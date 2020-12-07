package br.com.sd.victor;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class Database {

    private final String PATH = "./src/main/resources/database.txt";
    private Gson gson = new Gson();
    private Hashtable<Long, MapValue> hashtable;

    public Database() {
        getFromDisk();
        saveToDisk();
    }

    private void getFromDisk() {
        hashtable = new Hashtable<>();
        File file = new File(PATH);
        if(file.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                while(br.ready()) {
                    String line = br.readLine();
                    JsonKeyValue jsonKeyValue = gson.fromJson(line, JsonKeyValue.class);
                    if(jsonKeyValue != null) {
                        hashtable.put(jsonKeyValue.getKey(), jsonKeyValue.getMapValue());
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveToDisk() {
        synchronized (this.hashtable) {
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    try {
                        File file = new File(PATH);
                        FileWriter fw;
                        if (file.exists()) {
                            fw = new FileWriter(file, false);
                        } else {
                            file.createNewFile();
                            fw = new FileWriter(file);
                        }
                        StringBuilder sb = new StringBuilder();
                        Set<Long> keys = hashtable.keySet();
                        for (Long key : keys) {
                            sb.append("{\"key\":" + key + ",\"value\":" + gson.toJson(hashtable.get(key)) + "}\n");
                        }
                        fw.write(sb.toString());
                        fw.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            timer.scheduleAtFixedRate(timerTask, 15000, 15000);
        }
    }

    public MapValue getData(long key) {
        synchronized (this.hashtable) {
            return hashtable.get(key);
        }
    }

    public MapValue insertData(Request request) {
        synchronized (this.hashtable) {
            MapValue mapValue = valueToMapValue(request);
            mapValue.setVersion(1L);
            return hashtable.put(request.getKey(), mapValue);
        }
    }

    public MapValue removeData(long key) {
        synchronized (this.hashtable) {
            return hashtable.remove(key);
        }
    }

    public MapValue updateData(Request request) {
        synchronized (this.hashtable) {
            MapValue mapValue = valueToMapValue(request);
            return hashtable.put(request.getKey(), mapValue);
        }
    }

    private MapValue valueToMapValue(Request request) {
        Value value = request.getValue();

        MapValue mapValue = new MapValue();
        mapValue.setVersion(value.getVersion());
        mapValue.setTimestamp(value.getTimestamp());
        mapValue.setData(value.getData().toStringUtf8());

        return mapValue;
    }
}

package com.company;

import javax.xml.ws.EndpointReference;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MyHashMap<Key, Value> {
    private int size;
    private int capacity = 16;

    @SuppressWarnings("unchecked")
    private EntryMap<Key, Value>[] values = new EntryMap[capacity];

    public Value get(Key key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    private void ensure() {
        if (size == values.length) {
            int  newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }
    public int size() {
        return size;
    }

    public void put(Key key, Value value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }
        if(insert) {
            ensure();
            values[size++] =  new EntryMap<Key, Value>(key, value);
        }
    }
}

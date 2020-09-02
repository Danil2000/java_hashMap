package com.company;

public class EntryMap<Key, Value> {
    private final Key key;
    private Value value;

    public EntryMap(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}


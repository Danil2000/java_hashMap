package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        MyHashMap hash = new MyHashMap(2);
        hash.put(10, (long) 1.5);
        hash.put(15, (long) 2.5);
        System.out.println(hash.get(15));
        Map<Integer, Long> map = new HashMap<>();
        map.put(10, (long) 1.5);
        map.put(15, (long) 2.5);
        System.out.println(map.get(15));
    }
}

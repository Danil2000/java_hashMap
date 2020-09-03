package com.company;

import javax.xml.ws.EndpointReference;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MyHashMap {
   private int free = Integer.MIN_VALUE;
   private int size;
   private int[] keys;
   private long[] values;

   public MyHashMap(int size) {
       this.size = Math.max(3 * size / 2, size) + 1;
       keys = new int[this.size];
       values = new long[this.size];
       Arrays.fill(keys, free);
   }

   private int make_hash(int x) {
       return (x >> 15) ^ x;
   }
   private int getIndex(int hash) {
       return Math.abs(hash) % size;
   }
   public void put(int x, long y) {
       for(int i = getIndex(make_hash(x)); ; i++) {
           if (i == size)
               i = 0;
           if (keys[i] == free)
               keys[i] = x;
           if (keys[i] == x) {
               values[i] = y;
               return;
           }
       }
   }
   public long get(int x) {
       for(int i = getIndex(make_hash(x)); ; i++) {
           if (i == size)
               i =  0;
           if (keys[i] == free)
               throw new RuntimeException("Can not find Key");
           if (keys[i] == x)
               return values[i];
       }
   }
   public int size() {
       return size;
   }
}

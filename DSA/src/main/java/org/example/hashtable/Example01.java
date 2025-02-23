package org.example.hashtable;

import java.util.Hashtable;

public class Example01 {
    public static void main(String[] args) {

        Hashtable<String, String> hashTable = new Hashtable<>();

        hashTable.put("k1", "v1");
        hashTable.put("k2", "v2");

        System.out.println("Hashtable Elements" + hashTable);
    }
}

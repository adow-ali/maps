package com.adow;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args){
        // Create names of employees vs theirs ids
        // Map is an interface which spacifies what kind of method a real map implementation have to support such
        // as hashmap
        HashMap<String, Integer> empIds = new HashMap();

        // adding new employee mapping to empIds
        empIds.put("Jama", 123);
        empIds.put("Adow", 1345);
        empIds.put("Amina", 4567);
        System.out.println(empIds);

        // to get specific key
        System.out.println(empIds.get("Adow"));

        // to check if certain key exists in the map
        System.out.println(empIds.containsKey("Adow"));

        // to check if certain value exists in the map
        System.out.println(empIds.containsValue(123));

        // to update with new key-value in the map
        empIds.put("Adow", 12345);
        System.out.println(empIds);
        // to replace key-value pair in the map
        empIds.replace("Adow", 888);
        System.out.println(empIds);
        // to put ifAbsent/update key-value pair in the key/value is missing in the map
        empIds.putIfAbsent("Adow", 333);
        // to remove key value pair from the map
        empIds.remove("Amina");
        System.out.println(empIds);


// Hashmap is a collection or set of key-value pairs


    }
}

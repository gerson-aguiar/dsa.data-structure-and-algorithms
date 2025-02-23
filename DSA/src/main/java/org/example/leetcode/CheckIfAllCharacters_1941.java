package org.example.leetcode;

import java.util.HashMap;

public class CheckIfAllCharacters_1941 {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for(char c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int firstFrequency = frequencyMap.values().iterator().next();

        for(int frequency : frequencyMap.values()){
            if(frequency != firstFrequency) return false;
        }

        return true;
    }

    public static void main(String[] args) {


        System.out.println(areOccurrencesEqual("LeetCode"));
    }
}

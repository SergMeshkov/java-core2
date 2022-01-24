package ru.geekbrains.java2.homeworks.homeworks3;

import java.util.*;

public class Homework {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Pear", "Banana", "Orange",
                "Pineapple", "Apple", "Kiwi", "Peach", "Watermelon", "Apple",
                "Banana", "Pineapple", "Orange");
        Set<String> set = new HashSet<>(words);
        System.out.println(set.toString());

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", 89246585646L);
        phonebook.add("Petrov", 2287466L);
        phonebook.add("Sidorov", 123456789L);
        phonebook.add("Kulikov", 26416485L);
        phonebook.add("Petrov", 89545444121L);
        phonebook.add("Ivanov", 26548658L);
        phonebook.add("Kulikova", 89245668556L);
        phonebook.add("Meshkov", 88005654655L);

        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Meshkov"));
        System.out.println(phonebook.get("Sidorova"));


    }
}

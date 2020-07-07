package com.costaroot.taskmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListCreator {
    public List<String> fruitList(boolean isOrange) {
        List<String> fruits = new ArrayList<>();
        if (isOrange) {
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Cherry");
            fruits.add("Orange");
            fruits.add("Pineapple");
        } else {
            fruits.add("Apple");
            fruits.add("Mango");
            fruits.add("Lime");
            fruits.add("Banana");
            fruits.add("Pineapple");
        }
        return fruits;
    }

    public List<Integer> numberList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(11);
        numbers.add(18);
        numbers.add(22);
        numbers.add(20);
        return numbers;
    }

    public List<Integer> randomNumberList(int size, int bound) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(bound));
        }
        return numbers;
    }
}

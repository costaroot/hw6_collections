package com.costaroot.taskmanager;

import java.util.List;

public class TaskManager {
    public void removeDivisibleBy3(List<Integer> numbers) {
        System.out.println("List of number:" + numbers);
        numbers.removeIf(num -> (num % 3 == 0));
        System.out.println("After Removing" + numbers);
    }

    public void orangeReplace(List<String> fruits) {
        System.out.println("List of fruit: " + fruits);
        if (!fruits.contains("Orange")) {
            System.out.println("List is not contain Orange!");
        } else {
            while (fruits.contains("Orange"))
                fruits.set(fruits.indexOf("Orange"), "Grapefruit");
        }
        System.out.println("List of fruit after change:" + fruits);
    }

    private void duplicateElementsOfLists(List<Integer> list, List<Integer> checkList) {
        System.out.println("List1:" + list);
        System.out.println("List2:" + checkList);
        list.retainAll(checkList);
        if (list.isEmpty()) {
            System.out.println("Lists have not similar element.");
        } else {
            System.out.println("Lists have similar element: " + list);
        }
    }

    public void runApplication() {
        ListCreator listCreator = new ListCreator();
        this.removeDivisibleBy3(listCreator.numberList());
        this.orangeReplace(listCreator.fruitList(true));
        this.orangeReplace(listCreator.fruitList(false));
        this.duplicateElementsOfLists(listCreator.randomNumberList(5, 10),
                listCreator.randomNumberList(10, 7));
    }
}

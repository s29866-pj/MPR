package org.example;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("New");
        list.add("Year");

        if(CollectionUtils.isNotEmpty(list1)) {
            list.forEach(System.out::println);
        } else {
            System.out.println("List is empty");
        }
    }
}
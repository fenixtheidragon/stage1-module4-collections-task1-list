package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int element : sourceList) {
            if (element % 2 == 0) {
                linkedList.add(element);
            } else {
                linkedList.add(0, element);
            }
        }
        return linkedList;
    }
}

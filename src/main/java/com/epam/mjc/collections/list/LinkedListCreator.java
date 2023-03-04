package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        Iterator<Integer> iterator = sourceList.iterator();
        LinkedList<Integer> resultList = new LinkedList<>();
        Integer toAdd;
        while (iterator.hasNext()) {
            if ((toAdd = iterator.next()) % 2 != 0) {
                resultList.addFirst(toAdd);
            } else {
                resultList.addLast(toAdd);
            }
        }
        return resultList;
    }
}

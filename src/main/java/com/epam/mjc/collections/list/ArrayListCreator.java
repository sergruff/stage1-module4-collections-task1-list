package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        Iterator<String> iterator = sourceList.iterator();
        ArrayList<String> resultList = new ArrayList<>();
        int counter = 0;
        while (iterator.hasNext()){
            String toAdd = iterator.next();
            if (++counter%3==0){
                resultList.add(toAdd);
                resultList.add(toAdd);
            }
        }
        return resultList;
    }
}

package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        if ((5*first*first+3)>(5*second*second+3)){
            return 1;
        } else if ((5*first*first+3)==(5*second*second+3)) {
            if (first>second){
                return 1;
            } else if (first<second) {return -1;}
            return 0;
        } else return -1;
    }
}

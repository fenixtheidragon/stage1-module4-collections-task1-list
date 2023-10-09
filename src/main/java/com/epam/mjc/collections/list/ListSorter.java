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
        int firstNum = Integer.parseInt(a);
        int secondNum = Integer.parseInt(b);
        if (5 * firstNum * firstNum + 3 == 5 * secondNum * secondNum + 3) {
            return firstNum - secondNum;
        } else if (5 * firstNum * firstNum + 3 > 5 * secondNum * secondNum + 3){
            return 1;
        } else {
            return -1;
        }
    }
}

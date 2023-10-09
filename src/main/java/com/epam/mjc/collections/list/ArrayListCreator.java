package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int a = 1; a <= sourceList.size(); a++) {
            if (a % 3 == 0) {
                arrayList.add(sourceList.get(a-1));
                arrayList.add(sourceList.get(a-1));
            }
        }
        return arrayList;
    }
}

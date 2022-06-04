package com.ua.learning.project.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

    public static int[] arraySubtraction(int[] arr1, int[] arr2) {
        int[] resultArray = new int[0];
        if (arr1 == null || arr2 == null) {
            System.out.println("Enter valid data, please!");
            return resultArray;
        } else {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int temp : arr1) {
                list1.add(temp);
            }
            for (int temp : arr2) {
                list2.add(temp);
            }
            list1.removeAll(list2);
            resultArray = new int[list1.size()];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = list1.get(i);
            }}
            return resultArray;
    }
}


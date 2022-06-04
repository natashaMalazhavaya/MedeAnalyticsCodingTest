package com.ua.learning.project.implementation.task6;

import com.ua.learning.project.model.entity.Task6;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraySubtractionTest {

    @DataProvider(name="subtraction")
    public static Object [][] values() {
        return new Object[][] {{new int[] {1, 1, 2, 3, 3, 5}, new int[] {1, 3, 10}, new int[] {2, 5}},
                {new int[] {1, 2}, new int[] {1}, new int[] {2}},
                {new int[] {1, 2, 2, 2, 3}, new int[] {2}, new int[] {1, 3}},
                {null, new int[] {1, 3, 10}, new int[] {}},
                {new int[] {1, 1, 2, 3, 3, 5}, new int[] {}, new int[] {1, 1, 2, 3, 3, 5}},
                {new int[] {}, new int[] {1, 2, 6}, new int[] {}}
        };}

    @Test(dataProvider = "subtraction")
    public void returnArray(int [] arr1, int [] arr2, int [] arr3) {
        int [] resultArr = Task6.arraySubtraction(arr1, arr2);
        Assert.assertEquals(resultArr, arr3);
    }

}


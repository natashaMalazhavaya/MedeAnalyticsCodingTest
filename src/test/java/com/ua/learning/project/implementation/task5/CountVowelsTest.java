package com.ua.learning.project.implementation.task5;

import com.ua.learning.project.model.entity.Task5;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountVowelsTest {

    @DataProvider(name="countVowels")
    public static Object [][] values() {
        return new Object[][] {{"aa", 2}, {"natasha", 3}, {"quality assurance", 7},
                {"compare", 3}, {"questions", 4}, {"Samantha", 0}, {"*tir/", 0},
                {"test", 1}, {null, 0}, {" ", 0}, {" a", 1}
        };}

    @Test(dataProvider = "countVowels")
    public void returnCombinedStringTest(String str, int count) {
        int result = Task5.returnCountOfVowels(str);
        Assert.assertEquals(result, count);
    }
}

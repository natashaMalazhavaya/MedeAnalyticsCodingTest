package com.ua.learning.project.implementation.task4;

import com.ua.learning.project.model.entity.Task4;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CombinedStringTest {

    @DataProvider(name="combinedString")
    public static Object [][] values() {
        return new Object[][] {{"aa", "bb", "cc", "abcabc"}, {"natasha", "project", "combine", "npcarotomajbseihcnate"},
                {"test", "b", "cc", ""}, {null, "bb", "cc", ""}, {" a", "bv", "cc", " bcavc"}, {" a", " b", " c", "   abc"}
        };}

    @Test(dataProvider = "combinedString")
    public void returnCombinedStringTest(String firstString, String secondString, String thirdString, String combinedString) {
        String result = Task4.returnCombinedString(firstString, secondString, thirdString);
        Assert.assertEquals(result, combinedString);
    }
}

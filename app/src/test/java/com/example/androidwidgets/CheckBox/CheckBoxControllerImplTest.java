package com.example.androidwidgets.CheckBox;

import junit.framework.TestCase;

import org.junit.Assert;

public class CheckBoxControllerImplTest extends TestCase {

    public void testOrderDetails() {
        String exceptedOutput = "Selected Items:\n Pizza : 100Rs\n Coffee : 50Rs\n Sugar : 120Rs\n Total :270Rs";
        String actualOutput = new CheckBoxControllerImpl().orderDetails(true,true,true);
        Assert.assertEquals(exceptedOutput, actualOutput);
    }
}
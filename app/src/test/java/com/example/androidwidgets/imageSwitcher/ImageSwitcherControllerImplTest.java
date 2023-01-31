package com.example.androidwidgets.imageSwitcher;

import junit.framework.TestCase;

import org.junit.Assert;

public class ImageSwitcherControllerImplTest extends TestCase {

    public void testGetNextImagePosition() {
        int exceptedOutput = 0;
        int actualOutput = new ImageSwitcherControllerImpl().getNextImagePosition(2,3);
        Assert.assertEquals(exceptedOutput, actualOutput);
    }
}
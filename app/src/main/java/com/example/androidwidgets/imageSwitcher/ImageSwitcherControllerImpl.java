package com.example.androidwidgets.imageSwitcher;

public class ImageSwitcherControllerImpl implements ImageSwitcherController {
    @Override
    public int getNextImagePosition(int currentImagePosition, int length) {
        if(currentImagePosition < length-1){
            return currentImagePosition + 1;
        } else {
            return 0;

        }
    }
}

package com.example.androidwidgets.CheckBox;

public class CheckBoxControllerImpl implements CheckBoxController{
    @Override
    public String orderDetails(boolean isPizzaSelected, boolean isCoffeeSelected, boolean isSugarSelected) {
        int totalAmount = 0;
        String orderDetails = "Selected Items:";
        if(isPizzaSelected) {
            totalAmount += 100;
            orderDetails += "\n Pizza : 100Rs";
        }
        if(isCoffeeSelected) {
            totalAmount += 50;
            orderDetails += "\n Coffee : 50Rs";
        }
        if(isSugarSelected) {
            totalAmount += 120;
            orderDetails += "\n Sugar : 120Rs";
        }
        orderDetails += "\n Total :" +totalAmount + "Rs";
        return orderDetails;
    }
}

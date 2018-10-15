package com.felixaoo;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }
    public String getInfo(){
        return "Retrait gratuit";
    }
}

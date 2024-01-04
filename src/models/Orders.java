package models;

import java.util.Arrays;

public class Orders {
    String name;
    int phone_number;
    int[] product_code;
    double[] prices;

    public Orders(String name, int phone_number, int[] product_code, double[] prices) {
        this.name = name;
        this.phone_number = phone_number;
        this.product_code = product_code;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int[] getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int[] product_code) {
        this.product_code = product_code;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }
    public void bill_generator(){
        System.out.println("Order details:");
        System.out.println("Name:"+ name);
        System.out.println("Phone Number:"+ phone_number);
        System.out.println("Item Code:" + product_code);
        for(int i=0; i< prices.length; i++){
            double price = prices[i];
            prices[i] = price + (((double) 13 /100) * price);
        }
        System.out.println("Price" + Arrays.toString(prices));
    }

}


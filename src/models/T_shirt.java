package models;

import java.util.Arrays;

public class T_shirt {
    String name;
    int product_code;
    double price;
    String brand;
    String description;
    String [] sizes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public T_shirt(String name, int product_code, double price, String brand, String description, String[] sizes) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    public void description (){
        System.out.println("Item name:" + name);
        System.out.println("Description:" + description);
        System.out.println("Product code:" + product_code);
        System.out.println("Price:" + price);
        System.out.println("Sizes:" + Arrays.toString(sizes));
    }
}

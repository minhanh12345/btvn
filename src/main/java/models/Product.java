package models;

public class Product {
    private String name;
    private int price;
    private int number;
    private String color;
    private int type;
    private Product(){}

    public Product(String name, int price, int number, String color, int type) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.color = color;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int description) {
        this.type = description;
    }


}

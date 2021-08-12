package models;

public class Product {
    private String name;
    private int price;
    private int number;
    private String color;
    private String description;
    private Product(){}

    public Product(String name, int price, int number, String color, String description) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.color = color;
        this.description = description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

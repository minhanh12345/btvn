package service;

import models.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductService {
    public static ArrayList<Product> listProduct = new ArrayList<>();

    static {
        listProduct.add(new Product("BMV", 100, 10, "blue", "abc"));
        listProduct.add(new Product("Toyota", 200, 10, "black", "abc"));
        listProduct.add(new Product("Lexus", 300, 20, "white", "abc"));
    }

    public static void create(Product product) {
        listProduct.add(product);
    }

    public static void edit(Product product, int index) {
        listProduct.set(index, product);
    }

    public static void delete(int index) {
        listProduct.remove(index);
    }

    public static ArrayList<Product> findByName(String name) {
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().contains(name)) {
                list.add(listProduct.get(i));
            }
        }
        return list;
    }
}
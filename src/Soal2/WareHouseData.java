/// 2572032
/// Khresna Mulia Putra
package Soal2;

import java.util.ArrayList;
import java.util.List;

public class WareHouseData {
    private List<Item> items;

    public WareHouseData() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllShirts() {
        boolean found = false;
        for (Item item : items) {
            if (item instanceof Shirt) {
                if (!found) {
                    System.out.println(String.format("%-15s %-20s %-10s %-5s", "Brand", "Name", "Price", "Size"));
                    found = true;
                }
                System.out.println(item);
            }
        }
        if (!found) {
            System.out.println("No shirts available.");
        }
    }

    public void showAllShoes() {
        boolean found = false;
        for (Item item : items) {
            if (item instanceof Shoe) {
                if (!found) {
                    System.out.println(String.format("%-15s %-20s %-10s %-5s %-10s", "Brand", "Name", "Price", "Size", "Color"));
                    found = true;
                }
                System.out.println(item);
            }
        }
        if (!found) {
            System.out.println("No shoes available.");
        }
    }
}
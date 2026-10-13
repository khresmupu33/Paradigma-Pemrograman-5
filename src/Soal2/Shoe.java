/// 2572032
/// Khresna Mulia Putra
package Soal2;

public class Shoe extends Item {
    private int size;
    private String color;

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-10.2f %-5d %-10s", brand, name, price, size, color);
    }
}
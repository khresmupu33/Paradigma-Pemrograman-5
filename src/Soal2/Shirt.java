/// 2572032
/// Khresna Mulia Putra
package Soal2;

public class Shirt extends Item {
    private Size size;

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-10.2f %-5s", brand, name, price, size);
    }
}
/// 2572032
/// Khresna Mulia Putra
package Soal2;

public class Operator {
    private WareHouseData wareHouseData;

    public Operator(WareHouseData wareHouseData) {
        this.wareHouseData = wareHouseData;
    }

    public void addShirt(String brand, String name, double price, Size size) {
        Shirt shirt = new Shirt();
        shirt.setBrand(brand);
        shirt.setName(name);
        shirt.setPrice(price);
        shirt.setSize(size);
        wareHouseData.addItem(shirt);
    }

    public void addShoe(String brand, String name, double price, int size, String color) {
        Shoe shoe = new Shoe();
        shoe.setBrand(brand);
        shoe.setName(name);
        shoe.setPrice(price);
        shoe.setSize(size);
        shoe.setColor(color);
        wareHouseData.addItem(shoe);
    }

    public void viewAllItem() {
        wareHouseData.showAllShirts();
        wareHouseData.showAllShoes();
    }
}
/// 2572032
/// Khresna Mulia Putra

package Soal2;

import java.util.Scanner;

public class WareHouseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WareHouseData wareHouseData = new WareHouseData();
        Operator operator = new Operator(wareHouseData);

        boolean loop = true;
        do {
            System.out.println("==========================================");
            System.out.println("1. Add Shirt");
            System.out.println("2. Add Shoe");
            System.out.println("3. View All Items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choose = input.nextInt();
            input.nextLine(); // Consumes newline

            switch (choose) {
                case 1:
                    System.out.print("Enter Brand: ");
                    String shirtBrand = input.nextLine();
                    System.out.print("Enter Name: ");
                    String shirtName = input.nextLine();
                    System.out.print("Enter Price: ");
                    double shirtPrice = input.nextDouble();
                    System.out.print("Enter Size (XS, S, M, L, XL, XXL): ");
                    String sizeStr = input.next().toUpperCase();
                    Size size = Size.valueOf(sizeStr);

                    operator.addShirt(shirtBrand, shirtName, shirtPrice, size);
                    break;
                case 2:
                    System.out.print("Enter Brand: ");
                    String shoeBrand = input.nextLine();
                    System.out.print("Enter Name: ");
                    String shoeName = input.nextLine();
                    System.out.print("Enter Price: ");
                    double shoePrice = input.nextDouble();
                    System.out.print("Enter Size (number): ");
                    int shoeSize = input.nextInt();
                    input.nextLine(); // Consumes newline
                    System.out.print("Enter Color: ");
                    String shoeColor = input.nextLine();

                    operator.addShoe(shoeBrand, shoeName, shoePrice, shoeSize, shoeColor);
                    break;
                case 3:
                    operator.viewAllItem();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Wrong Menu");
                    break;
            }
        } while (loop);

        input.close();
    }
}
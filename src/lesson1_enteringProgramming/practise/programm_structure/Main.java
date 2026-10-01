package lesson1_enteringProgramming.practise.programm_structure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int customPrice;

        try(Scanner sc = new Scanner(System.in);) {
            System.out.print("Введите цену товара (в руб.): ");
            int productPrice = sc.nextInt();
            System.out.print("Введите вес товара (в кг.): ");
            int productWeight = sc.nextInt();
            customPrice = calculateCustom(productPrice, productWeight);
        }

        System.out.println("Размер пошлины (в руб.) составит: " + customPrice);
    }

    public static int calculateCustom(int productPrice, int productWeight) {
        return (productPrice / 100) + (productWeight * 100);
    }

}

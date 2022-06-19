package storage.handler;

import storage.exceptionMy.ThisIsNotPriceMyException;

import java.util.Scanner;

public class HandlerGetPrice {
    public static double getPriceOfProductLok() {
        Scanner scanner = new Scanner(System.in);
        double priceOfProductLok;

        while (true) {
            try {
                System.out.print("Введите стоимость товара в гривнах: ");
                if (scanner.hasNextDouble()) {
                    priceOfProductLok = scanner.nextDouble();
                    scanner.nextLine();
                    if (0 >= priceOfProductLok) {
                        throw new ThisIsNotPriceMyException("\u001B[32m" + "Цена товара не может быть меньше либо равна 0 грн. \u001B[31m данные по цене не приняты, \u001B[32m введите еще раз" + "\u001B[0m");
                    } else {
                        System.out.println("\u001B[32m" + "Информация о товаре успешно записана в массив" + "\u001B[0m");
                        return priceOfProductLok;
                    }
                } else {
                    scanner.nextLine();
                    throw new ThisIsNotPriceMyException("\u001B[32m" + "Цена товара должен быть числом в диапозоне от 0 до " + Double.MAX_VALUE + ", \u001B[31m данные по цене не приняты, \u001B[32m введите еще раз" + "\u001B[0m");
                }

            } catch (ThisIsNotPriceMyException e) {
                System.out.println(e.getMessage());
            }

        }
    }

}

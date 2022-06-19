package storage;

import models.Price;
import storage.exceptionMy.NoShopMyException;
import storage.handler.HandlerGetPrice;

import java.util.Arrays;
import java.util.Scanner;

public class Storage {
    public static final Price[] storage = new Price[2];

    public static void setStorage() {
        String nameOfProductLok;
        String nameOfShopLok;
        double priceOfProductLok;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < storage.length; i++) {
            System.out.print("Введите название товара: ");
            nameOfProductLok = scanner.nextLine();
            System.out.print("Введите название магазина, в котором продается товар: ");
            nameOfShopLok = scanner.nextLine();
            priceOfProductLok = HandlerGetPrice.getPriceOfProductLok();
            storage[i] = new Price(nameOfProductLok, nameOfShopLok, priceOfProductLok);

        }
        Arrays.sort(storage);           // сортировка массива по назв.магаз., для этого Price implements Comparable<Price>

    }

    public static void toStringStorage() {

        try {
            if (storage[0] == null) {
                throw new NullPointerException();
            } else {
                for (int i = 0; i < storage.length; i++) {
                    System.out.println((i + 1) + ". " + storage[i]);
                }
            }

        } catch (NullPointerException n) {
            System.out.println("\u001B[31m" + "Информации нет. Список товаров пуст." + "\u001B[0m" + " (реком. обрат. к меню под № 1)");
        }

    }

    public static void getProductOfShop() {
        Scanner scanner = new Scanner(System.in);
        String nameOfShopLok;
        boolean thereIsShop = true;
        int counterOfProduct = 1;
        try {
            if (storage[0] == null) {
                throw new NullPointerException();
            } else {
                System.out.print("Введите название магазина: ");
                nameOfShopLok = scanner.nextLine();

                for (int i = 0; i < storage.length; i++) {
                    if (nameOfShopLok.equals(storage[i].getNameOfShop())) {
                        System.out.println(counterOfProduct + ". " + storage[i]);
                        counterOfProduct++;
                        thereIsShop = false;
                    }
                }

                if (thereIsShop) {
                    throw new NoShopMyException(nameOfShopLok + "\u001B[32m" + " : магазин не найден" + "\u001B[0m");
                }

            }
        } catch (NoShopMyException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException p) {
            System.out.println("\u001B[31m" + "Информации нет. Список товаров пуст." + "\u001B[0m"  + " (реком. обрат. к меню под № 1)");
        }

    }
}

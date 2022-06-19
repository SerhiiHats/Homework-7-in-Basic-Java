import storage.Storage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keyOutOfWhile = true;
        while (keyOutOfWhile) {

                System.out.println("\u001B[1;32m" + "***************** Выбирите следующее действие из меню (№ цифра + Enter) *****************" + "\u001B[0m");
                System.out.println("\u001B[1;32m" + "1." + "\u001B[0m" + " ввод данных о товаре в массив товаров. " +
                        "\u001B[1;32m" + "2." + "\u001B[0m" + " вывод на экран всех данных. " +
                        "\u001B[1;32m" + "3." + "\u001B[0m" + " вывод на экран информации о товарах, продающихся в конкретном магазине. " +
                        "\u001B[1;32m" + "0." + "\u001B[0m" + " выход (or any other key).");
                switch (scanner.next()) {
                    case "1": {
                        Storage.setStorage();
                        break;
                    }
                    case "2": {
                        Storage.toStringStorage();
                        break;
                    }
                    case "3": {
                        Storage.getProductOfShop();
                        break;
                    }
                    case "0": {
                        keyOutOfWhile = false;
                        break;
                    }
                    default: {
                        keyOutOfWhile = false;
                    }

                }


        }
        scanner.close();
        System.out.println("\u001B[32m" + "Конец программы" + "\u001B[0m");
    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanManu = new Scanner(System.in);
        double[] doubleNumber = new double[2];
        double a;
        double b;
        boolean keyOutOfWhile = true;
        doubleNumber = getNumberWithKeyboard();
        a = doubleNumber[0];
        b = doubleNumber[1];
        while (keyOutOfWhile) {
            System.out.println("1. сложение  2. вычетание  3. умножение  4. деление  5. продолжить с другими значениями  0. выход");
            switch (scanManu.next()) {
                case "1": {
                    add(a, b);
                    break;
                }
                case "2": {
                    sub(a, b);
                    break;
                }
                case "3": {
                    mul(a, b);
                    break;
                }
                case "4": {
                    div(a, b);
                    break;
                }
                case "5": {
                    doubleNumber = getNumberWithKeyboard();
                    a = doubleNumber[0];
                    b = doubleNumber[1];;
                    break;
                }
                case "0": {

                }
                default:{
                    keyOutOfWhile = false;
                }
            }

        }
        System.out.println("конец программы");

    }

    public static void add(double a, double b) {
        System.out.println("Пример : " + a + " + " + b + " = " + (a + b));
    }

    public static void sub(double a, double b) {
        System.out.println("Пример : " + a + " - " + b + " = " + (a - b));
    }

    public static void mul(double a, double b) {
        System.out.println("Пример : " + a + " * " + b + " = " + (a * b));
    }

    public static void div(double a, double b) {
        System.out.print("Пример : " + a + " * " + b + " = ");
       try {
           if (b == 0) throw new ArithmeticException();
           double c = a / b;
           System.out.println(c);
       } catch (ArithmeticException e) {
           System.out.println("\u001B[31m" + "Деление на ноль!" + "\u001B[0m");
       }

    }

    public static double[] getNumberWithKeyboard() {
        Scanner scanner = new Scanner(System.in);
        double[] doublMas = new double[2];
        for (int i = 0; i < doublMas.length; i++) {
            System.out.print("Введите " + (i + 1) + "-е число : ");
            if (scanner.hasNextDouble()) {
                doublMas[i] = scanner.nextDouble();
            } else {
                System.out.println("\u001B[31m" + "Число не было введено" + "\u001B[0m");
                i--;
                scanner.nextLine();
            }
        }
          return doublMas;
    }

}

package employee;

import employee.myException.HereIsNotIntegerYear;

import java.time.LocalDate;
import java.util.Scanner;

public class Handler {
    public static int getVvodYearOfJob() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите год поступления на работу : ");
                if (scanner.hasNextInt()) {
                    int yearOFJob = scanner.nextInt();
                    scanner.nextLine();
                    if (yearOFJob < 1997) {                  /** 1997 - воображаемый год основания места работы */
                        throw new HereIsNotIntegerYear("\u001B[32m" + "Год поступления не может быть меньше 1997 - т.к. это год основания компании, \u001B[31m данные не приняты, \u001B[32m введите еще раз" + "\u001B[0m");
                    } else if (yearOFJob > LocalDate.now().getYear()) {
                        throw new HereIsNotIntegerYear("\u001B[32m" + "Год поступления не может быть больше " + LocalDate.now().getYear() + " т.к. это текущий год, \u001B[31m данные не приняты, \u001B[32m введите еще раз" + "\u001B[0m");
                    } else {
                        System.out.println("\u001B[32m" + "Запись успешна была введена!"  + "\u001B[0m");
                        return yearOFJob;
                    }

                } else {
                    scanner.nextLine();
                    throw new HereIsNotIntegerYear("\u001B[32m" + "Год поступления должен быть целым числом в диапозоне от 1997 до " + LocalDate.now().getYear() + ", \u001B[31m данные не приняты, \u001B[32m введите еще раз"+ "\u001B[0m");

                }
            } catch (HereIsNotIntegerYear e) {
                System.out.println(e.getMessage());


            }

        }
    }
}

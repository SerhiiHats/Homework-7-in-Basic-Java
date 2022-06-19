import employee.Handler;
import employee.Worker;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name1;
        String jobTitle1;
        int yearOFJob1;
        Worker[] workers = new Worker[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введите фамилию и инициалы работника : ");
            name1 = scanner.nextLine();
            System.out.println("Введите название занимаемой должности : ");
            jobTitle1 = scanner.nextLine();
            yearOFJob1 = Handler.getVvodYearOfJob();
            workers[i] = new Worker(name1, jobTitle1, yearOFJob1);
        }

        System.out.println("Введенные записи до сортировки по алфавиту:");
        for (Worker w : workers) {
            System.out.println(w);
        }

        System.out.println();

        System.out.println("Упорядоченные записи по алфавиту:");
        Arrays.sort(workers);
        for (Worker w : workers) {
            System.out.println(w);
        }

        System.out.println();

        System.out.println("Фамилия работника, стаж работы которого самый большой:");
//        int maxStagOld = LocalDate.now().getYear() - workers[0].getYearOFJob();
//        int pozitionWorkerOfArrays = 0;
//        for (int i = 1; i < workers.length; i++) {
//            if (LocalDate.now().getYear() - workers[i].getYearOFJob() > maxStagOld) {
//                maxStagOld = LocalDate.now().getYear() - workers[i].getYearOFJob();
//                pozitionWorkerOfArrays = i;
//            }
//        }
//        System.out.println(workers[pozitionWorkerOfArrays]);

        Arrays.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return Integer.compare(o1.getYearOFJob(), o2.getYearOFJob());
            }
        });
        System.out.println(workers[0]);

        System.out.println();

        System.out.println("Упорядоченные записи по алфавиту должностей:");
        Arrays.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getJobTitle().compareTo(o2.getJobTitle());
            }
        });

        for (Worker w : workers) {
            System.out.println(w);
        }
        scanner.close();
    }

}

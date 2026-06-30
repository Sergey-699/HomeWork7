import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1");
        int firstFriday = 2;
        int i = firstFriday;
        for (; i <= 31; i += 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задание 2");
        int allDistance = 42195;
        int coveredDistance = 0;
        do {
            int remainingDistance = allDistance - coveredDistance;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            coveredDistance += 500;
        } while (coveredDistance <= 42195);

        System.out.println("С циклом for");
        int d = 0;
        System.out.println("Пройденная дистанция");
        for (; d <= 42195; d += 500) {
            int remainingDistance = allDistance - d;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
        }

        System.out.println("Задание 3");
        int remainingFunds = 2800;
        int parkingDays = 0;
        while (remainingFunds >= 100) {
            parkingDays++;
            if (parkingDays % 5 == 0) {
                System.out.println(parkingDays + "-й день — бесплатно!");
                continue;
            }
            remainingFunds -= 100;
        }
        System.out.println("Бюджет позволяет стоять " + parkingDays + " дней.");

        System.out.println("С циклом for");
        int budget = 2800;
        int paidDays = 0;
        for (; budget > 0; ) {
            paidDays++;
            if (paidDays % 5 == 0) {
                System.out.println(paidDays + "-й день — бесплатно!");
                continue;
            }
            budget -= 100;
        }
        System.out.println("Бюджет позволяет стоять " + paidDays + " дней.");

        System.out.println("Задание 4");
        int month = 0;
        int total = 0;
        int accumulation = 12_000_000;
        int monthDeposit = 15000;
        while (true) {
            month++;
            total += monthDeposit;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Месяц: " + month + ", Сумма: " + total + " рублей");
            if (total >= accumulation) {
                System.out.println("Cумма достигнута!");
                break;
            }
        }


            System.out.println("Задание 5");
            int charge = 20;
            int minute = 0;
            int overheats = 0;
            while (charge < 100 && overheats < 3) {
                minute++;
                if (minute % 10 == 0) {
                    overheats++;
                    System.out.println("Перегрев! Зарядка прервана на 2 минуты.");
                    minute += 2;
                    continue;
                }
                charge += 2;
            }
            if (overheats >= 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
            }
            System.out.println("Время зарядки составило " + minute + " минут.");
        }
    }



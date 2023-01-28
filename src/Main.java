import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 1.11");

        isLeapYear(5104);
        downloadApp(1, 2022);
        deliveryCard(70);


    }

    public static void isLeapYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }
    }

    public static void downloadApp(int clientOS, int productionYear ) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (productionYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите стандартную версию приложения для Android по ссылке");
            }
        } else if (productionYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        }
    }

    public static void deliveryCard(int deliveryDistance) {
        System.out.println("Задача 3");
        int dayDelivery = 1;
            if (deliveryDistance > 100) {
                System.out.println("Нет доставки");
                return;
            }
            if (deliveryDistance > 20) {
                dayDelivery++;
            }
            if (deliveryDistance > 60) {
                dayDelivery++;
            }
            System.out.println("Доставка займет " + dayDelivery + " суток");

    }

}
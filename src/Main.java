import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 1986;
        checkYear(year);
        int clientOS = 1;
        int clientDeviceYear = 2017;
        checkVersion(clientOS, clientDeviceYear);
        int deliveryDistance = 95;
        int days = 1;
        calculateDeliveryDays(deliveryDistance, days);
    }
    public static void checkYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " год является високосным");
        }
        else {
            System.out.println( year + " год не является високосным");
        }
    }

    public static void checkVersion(int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance, int days) {
        System.out.println("Задача 3");
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        }
        else if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        }
    }


}
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка Методы");
        int yearNumber = 2000;
        leapYear(yearNumber);
        int clientOS = 1;
        var clientDeviceYea = 2015;
        phoneOs(clientOS, clientDeviceYea);
        int deliveryDistance = 95;
        int days = card(deliveryDistance);
        System.out.println("Потребуется дней:  " + days);
    }
    public static void leapYear(int yearNumber) {
        if (yearNumber % 4 == 0 && yearNumber % 100 != 0 || yearNumber % 400 == 0) {
            System.out.println(yearNumber + " — високосный год");
        } else {
            System.out.println(yearNumber + " — невисокосный год");
        }
    }
    public static void phoneOs(int clientOS, int clientDeviceYea) {
        if (clientOS == 0 && clientDeviceYea < 2015) {
            System.out.println("Установите облегченную версию для IOS");
        }
        if (clientOS == 1 && clientDeviceYea < 2015) {
            System.out.println("Установите облегченную версию для Android");
        }
        if (clientDeviceYea >= 2015) {
            System.out.println("Установите обычную версию");
        }
    }
    public static int card(int deliveryDistance) {
        System.out.println("Задача 4");
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }
}
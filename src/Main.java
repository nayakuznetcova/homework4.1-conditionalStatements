public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите приложение для android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложение для android по ссылке");
        }
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите приложение для android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " является невисокосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет два дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет три дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        char monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима, Январь");
                break;
            case 2:
                System.out.println("Зима, Февраль");
                break;
            case 3:
                System.out.println("Весна, Март");
                break;
            case 4:
                System.out.println("Весна, Апрель");
                break;
            case 5:
                System.out.println("Весна, Май");
                break;
            case 6:
                System.out.println("Лето, Июнь");
                break;
            case 7:
                System.out.println("Лето, Июль");
                break;
            case 8:
                System.out.println("Лето, Август");
                break;
            case 9:
                System.out.println("Осень, Сентябрь");
                break;
            case 10:
                System.out.println("Осень, Октябрь");
            case 11:
                System.out.println("Осень, Ноябрь");
                break;
            case 12:
                System.out.println("Зима, Декабрь");
                break;
            default:
                System.out.println("Такого месяца в году нет");
        }

    }
}
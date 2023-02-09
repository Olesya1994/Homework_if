public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то нужно подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = -5;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов .На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло " + temp + " градусов .Сегодня тепло, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 21;
        if (age > 2 && age < 6) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в детский сад.");
        } else if (age > 6 && age < 18) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если человеку " + age + " лет, то его место в университете.");
        } else if (age > 24) {
            System.out.println("Если человеку " + age + " лет, то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 87;
        if (age < 5) {
            System.out.println("Если ребёнку " + age + " лет, то он не может кататься на аттракционе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если ребёнку " + age + " лет, то он может кататься только в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если ребёнку " + age + " лет, то он может кататься без сопровождения взрослого.");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int trainCapacity = 102;
        int seat = 60;
        int numberOfTicket = 59;
        if (numberOfTicket <= seat) {
            System.out.println("Есть свободные сидячие места");
        } else if (numberOfTicket > seat && numberOfTicket <= trainCapacity) {
            System.out.println("Есть только стоячие места");
        } else if (numberOfTicket > trainCapacity) {
            System.out.println("Больше нет мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 56;
        int two = 3;
        int three = 6666;
        int max = one;
        if (one < two) {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println("Максимальное число "+max);
    }
}

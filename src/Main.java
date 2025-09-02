import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nameOfSomething;

        long currentYear = 2025;

        int NUM = 1;

        long year;

        String WORD = ("homework");
        nameOfSomething = (NUM + " " + WORD);
        System.out.println(nameOfSomething);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");

        String Name = scanner.nextLine();
        System.out.println("Введите вашу фамилию: ");

        String Name2 = scanner.nextLine();
        System.out.println("Привет " + Name + ' ' + Name2 + "!");

        while (true) {
            System.out.println("Твой год рождения? ");
            year = scanner.nextLong();

            if (year >= 1930 && year <= currentYear) {
                long age = currentYear - year;
                System.out.println("Тебе " + age + " лет");
                break;
            } else {
                System.out.println("Неверный год рождения! Попробуй снова.");
            }
        }
    }
}


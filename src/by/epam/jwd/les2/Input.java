package by.epam.jwd.les2;

import java.util.Random;
import java.util.Scanner;

public class Input {

    public int inputByScanner() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = scanner.nextInt();
        return number;
    }

    public int inputByRandom() {
        int number;
        Random random = new Random();
        number = random.nextInt(25);
        System.out.println(number);
        return number;
    }
}

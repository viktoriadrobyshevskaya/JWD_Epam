package by.epam.jwd.les1;

/* 5. Даны три действительных числа. Возвести в квадрат те из них,
   значения которых неотрицательны, и в четвертую степень — отрицательные.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x;
        int count = 3;

        Scanner scanner = new Scanner(System.in);
        while (count != 0) {
            System.out.println("Введите число: ");
            x = scanner.nextInt();
            if (x >= 0) {
                System.out.println("Это число положительное. Возводим в квадрат: " + Math.pow(x, 2));
            } else {
                System.out.println("Это число отрицательное. Возводим в 4ю степень: " + Math.pow(x, 4));
            }
            count--;
        }
    }
}

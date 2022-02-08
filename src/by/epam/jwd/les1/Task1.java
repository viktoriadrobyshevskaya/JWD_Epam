package by.epam.jwd.les1;

import java.util.Scanner;

/*   1. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
     и false — в противном случае:
     Сумма двух первых цифр заданного четырехзначного числа
     равна сумме двух его последних цифр.
 */
public class Task1 {
    public static void main(String[] args) {
        int x;
        System.out.println("Введите 4х-значное число: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        System.out.println((x / 1000) + (x / 100 % 10) == (x / 10 % 10) + (x % 10));

    }
}

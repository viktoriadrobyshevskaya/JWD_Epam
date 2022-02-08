package by.epam.jwd.les1;

//6. Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 9;

        int sum;
        int max;
        int min;

        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);

        sum = max + min;
        System.out.println(sum);
    }
}

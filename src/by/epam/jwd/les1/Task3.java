package by.epam.jwd.les1;

// 3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

public class Task3 {
    public static void main(String[] args) {
        double perimeter;
        double square;
        int a = 5;
        int b = 6;

        perimeter = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + (a + b);
        square = (a * b) / 2.0;

        System.out.println("Периметр = " + perimeter + ", площадь = " + square);
    }
}
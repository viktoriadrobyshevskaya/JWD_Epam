package by.epam.jwd.les1;

/*  7. Составить программу вычисления значений функции F(x) на отрезке [а, b] с шагом h.
    Результат представить в виде таблицы, первый столбец которой – значения аргумента,
    второй - соответствующие значения функции: F(x) = sin2(x)-cos(2x);
 */

public class Task7 {
    public static void main(String[] args) {
        double a = 1;
        double b = 11;
        double h = 2;

        for (double i = a; i <= b; i += h) {
            System.out.println("Value - " + i + "\t\tResult - " + function(i));
        }
    }

    public static double function(double value) {
        return Math.sin(value) * Math.sin(value) - Math.cos(2 * value);
    }
}

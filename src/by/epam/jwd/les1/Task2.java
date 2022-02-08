package by.epam.jwd.les1;

/* 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *     b + (Math.sqrt(Math.pow(b, 2) + 4ac)) / 2a ) - Math.pow(a, 3) * c + Math.pow(b, -2)
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 2;
        double x;

        double temp = b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        double temp1 = temp / (2 * a);
        x = temp1 - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(x);
    }
}

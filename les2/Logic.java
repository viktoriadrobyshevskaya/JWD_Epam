package by.epam.jwd.les2;

public class Logic {

    public boolean task1(int x) {
        return (x / 1000) + (x / 100 % 10) == (x / 10 % 10) + (x % 10);
    }

    public double task2(int a, int b, int c) {
        double x;

        double temp = b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        double temp1 = temp / (2 * a);
        x = temp1 - Math.pow(a, 3) * c + Math.pow(b, -2);

        return x;
    }

    public boolean task4(int x, int y) {
        return ((x <= 2 && x >= -2) && (y <= 4 && y >= 0)) || ((x <= 4 && x >= -4) && (y <= 0 && y >= -3));
    }


    public int task6(int a, int b, int c) {
        int max;
        int min;

        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);

        return max + min;
    }
}

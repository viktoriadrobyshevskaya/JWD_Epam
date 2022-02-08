package by.epam.jwd.les1;

// 8. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task8 {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 6, 32, 24, 88, 36, 3, 14, 85};
        int k = 3;
        int sum = 0;

        for (int j : array) {
            if (j % k == 0) {
                sum += j;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}

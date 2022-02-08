package by.epam.jwd.les1;

// 9. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int k = 2;
        int[] array1 = {1, 1, 1, 1, 1, 1};
        int[] array2 = {3, 3, 3, 3, 3};

        int[] shared = new int[array1.length + array2.length];

        int x = 0;
        for (int i = 0; i < shared.length; i++) {
            if (i <= k) {
                shared[i] = array1[i];
            } else {
                if (x < array2.length) {
                    shared[i] = array2[x];
                    x++;
                } else {
                    shared[i] = array1[k + 1];
                }
            }
        }

        System.out.println(Arrays.toString(shared));
    }
}

package by.epam.jwd.les1;

/* 10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     |   1  2    3    .   n  |
     |   n  n-1  n-2  .   1  |
     |   1  2    3    .   n  |
     |   n  n-1  n-2  .   1  |
     |   .  .    .    .   .  |
     |   n  n-1  n-2  .   1  |
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = arr.length - j;
                }
            }
        }

        // печатаем
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

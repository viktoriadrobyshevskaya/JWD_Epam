package by.epam.jwd.les1;

// 4. Для данных областей составить линейную программу, которая печатает true, если точка
// с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

public class Task4 {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;

        System.out.println(((x <= 2 && x >= -2) && (y <= 4 && y >= 0)) || ((x <= 4 && x >= -4) && (y <= 0 && y >= -3)));
    }
}

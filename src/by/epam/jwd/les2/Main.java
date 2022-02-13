package by.epam.jwd.les2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        View view = new View();

        //task 1
        int number = input.inputByScanner("Введите чётырехзначное число");
        boolean isTrue = logic.task1(number);
        view.outputBooleanToTheConsole(isTrue);

        //task2
        int a = input.inputByRandom();
        int b = input.inputByRandom();
        int c = input.inputByRandom();
        double value = logic.task2(a, b, c);
        view.outputDoubleToConsole(value);

        //task3
        int m = input.inputByRandom();
        int n = input.inputByRandom();
        double perimeter = logic.task3Perimeter(m, n);
        double square = logic.task3Square(m, n);
        view.outputPerimeterAndSquare(perimeter, square);

        //task4
        int x = 0;
        int y = -1;
        boolean isTrue1 = logic.task4(x, y);
        view.outputBooleanToTheConsole(isTrue1);

        //task6
        int number1 = input.inputByScanner("Введите 1ое число: ");
        int number2 = input.inputByScanner("Введите 2ое число: ");
        int number3 = input.inputByScanner("Введите 3е число: ");
        int sum = logic.task6(number1, number2, number3);
        view.outputIntToConsole("Cумма = ", sum);

        //task8
        int length = input.inputByScanner("Введите длину массива: ");
        int[] array = input.inputArrayByRandom(length);
        int k = input.inputByScanner("Введите число k: ");
        int summ = logic.task8(k, array);
        view.outputArrayToConsole(array);
        view.outputIntToConsole("Cумма = ", summ);
    }
}

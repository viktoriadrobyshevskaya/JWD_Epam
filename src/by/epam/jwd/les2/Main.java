package by.epam.jwd.les2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        View view = new View();

        //task 1
        int number = input.inputByScanner();
        boolean isTrue = logic.task1(number);
        view.outputBooleanToTheConsole(isTrue);

        //task2
        int a = input.inputByRandom();
        int b = input.inputByRandom();
        int c = input.inputByRandom();
        double value = logic.task2(a, b, c);
        view.outputDoubleToConsole(value);

        //task4
        int x = 0;
        int y = -1;
        boolean isTrue1 = logic.task4(x, y);
        view.outputBooleanToTheConsole(isTrue1);

        //task6
        int number1 = input.inputByScanner();
        int number2 = input.inputByScanner();
        int number3 = input.inputByScanner();
        int sum = logic.task6(number1, number2, number3);
        view.outputIntToConsole(sum);

    }
}

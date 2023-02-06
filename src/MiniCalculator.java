import java.util.Scanner;

        /*2). Создайте мини калькулятор с помощью возвращающего метода.
        Пусть метод в качестве параметра принимает два целых чисел
        и один символ, выполняет + - / *  .*/

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short a = (short) scan.nextInt();
        char c = scan.next().charAt(0);
        short b = (short) scan.nextInt();
        System.out.print(miniCalculator(a, b, c));
    }

    static short miniCalculator(short a, short b, char c) {

        switch (c) {
            case '+':
                return (short) (a + b);
            case '-':
                return (short) (a - b);
            case '*':
                return (short) (a * b);
            case '/':
                return (short) (a / b);
        }
        return 0;
    }


}

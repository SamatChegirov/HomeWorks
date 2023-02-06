import java.util.Random;
        //TODO
        /*1). Создайте метод возвращающий целое число,
        которое в качестве параметра принимает переменную int-го типа.
        Создайте массив, размер должен быть 10 и теперь с помощью выше
        созданного метода заполните его случайными цифрами диапазон которого будет от 3 до 7.*/

public class Main {
    public static void main(String[] args) {

        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = intMassMethod();
            System.out.print(mass[i] + ", ");
        }
    }
    static int intMassMethod() {
        Random random = new Random();
        int ran = random.nextInt(3, 7);
        return ran;
    }
}

/*      Кайтаруучу тиби boolean болгон метод түзүңүз, параметрине бир сан жана сандардын varargs-ын кабыл алсын.
        Методко биринчи берген аргументиңизди экинчи берген аргументтердин ичинен барбы же жокпу текшерип,
        бар болсо true, жок болсо false кайтарсын.
        static boolean contains (int a, int ... varargs) {
        // бул жака кодуңузду жазыңыз
        }*/

public class HomeWorkLesson10 {
    public static void main(String[] args) {

        System.out.println(homeWork10(4, 5,6,7,8,9,1,2,3,4));
    }


    static boolean homeWork10(int a, int ... varargs){
        for (int i : varargs) {
            if (i == a) {
                return true;
            }
        }
        return false;
    }
}

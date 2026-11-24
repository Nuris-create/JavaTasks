package block3;

// Задача 3.4 ★★ Предскажи вывод: функции — условие в tasks/block-3-functions.md
public class Task04 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(getDifference(a, b));   // 1
        System.out.println(getDifference(b, a));   // -1
        square(10); // 100
        System.out.println(square(square(2))); // 8
        System.out.println(sumOfSquares(a, b));   // 25
        System.out.println(half(7));   // 3
        System.out.println(isBig(sum(a, b)));  // false
        System.out.println(isBig(square(a + b)));  //true
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int getDifference(int b, int a) {
        return a - b;
    }

    public static int square(int x) {
        return x * x;
    }

    public static int sumOfSquares(int x, int y) {
        return square(x) + square(y);
    }

    public static double half(int number) {
        return number / 2;
    }

    public static boolean isBig(int number) {
        return number > 10;
    }
}

// Я ошибся в 3,4 и 6 строке.
//square(10); Я написал что выйдет 100, но забыл, что там ничего не напишет ведь нету sout
//System.out.println(square(square(2))); Я написал 8, подумав, что там из логики выходит 2 в кубе, но на деле это два в квадрате в квадрате (2^2)^2
//System.out.println(half(7));  Тут я просто забыл, что double сам делает принимаемые числа сразу дробными добавляя 0 после запятой
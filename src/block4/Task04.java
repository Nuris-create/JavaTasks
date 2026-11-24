package block4;

import java.util.Scanner;

// Задача 4.4 ★★ Цифры числа — условие в tasks/block-4-loops.md
public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(Digit(number));
        System.out.println(Big(number));
    }
    public static int Big(int number){
        int big=0;
        number=Math.abs(number);
        while(number>0){
            big=big>number%10 ? big : number%10;
            number/=10;
        }
        return big;
    }
    public static int Digit(int number){
        int digit=0;
        number=Math.abs(number);
        if (number==0){
            digit++;
        }
        while (number>0){
            digit++;
            number/=10;
        }
        return digit;
    }
}

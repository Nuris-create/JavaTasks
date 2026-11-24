package block4;

import java.util.Scanner;

// Задача 4.5 ★★ Число наоборот — условие в tasks/block-4-loops.md
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(Reverse(number));
        System.out.println(Polyndrom(number));
    }
    public static int Reverse(int number){
        int reverse=0;
        int sign=Math.abs(number);
        while(sign>0){
            reverse=reverse*10+sign%10;
            sign/=10;
        }


        return number >0 ? reverse: -reverse;
    }
    public static boolean Polyndrom(int number){
        return Reverse(number)==number;
    }
}

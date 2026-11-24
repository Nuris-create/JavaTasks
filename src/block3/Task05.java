package block3;

import java.util.Scanner;

// Задача 3.5 ★★ Счастливые билеты подряд — условие в tasks/block-3-functions.md
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isLucky(number));
        System.out.println(isLucky(number+1));
    }
    static int sumHalf (int number){
        int a,b,c;
        a=number%10;
        b=number/10%10;
        c=number/100%10;
        return a+b+c;
    }
    static boolean isLucky (int number){
        int half1,half2;
        half1=sumHalf(number);
        half2=sumHalf(number/1000);
        return half1==half2;
    }

        /*System.out.println(isLucky(number));
        System.out.println(isLuckyNext(number));

    static boolean isLucky(int number){
        int a1,a2,a3,b1,b2,b3;
        a1=number%10;
        a2=number/10%10;
        a3=number/100%10;
        b1=number/1000%10;
        b2=number/10000%10;
        b3=number/100000;
        return (a1+a2+a3==b1+b2+b3);
    }
    static boolean isLuckyNext(int number){
        int a1,a2,a3,b1,b2,b3;
        a1=(number+1)%10;
        a2=number/10%10;
        a3=number/100%10;
        b1=number/1000%10;
        b2=number/10000%10;
        b3=number/100000;
        return (a1+a2+a3==b1+b2+b3);
    }
    */

}

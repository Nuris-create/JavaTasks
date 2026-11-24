package block4;

import java.util.Scanner;

// Задача 4.7 ★★★ Сократи дробь — условие в tasks/block-4-loops.md
public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println(Result(number1,number2,NOD(number1,number2)));

    }
    public static int NOD(int number1, int number2){
        if(number2==0){
            return number1;
        }
        return NOD(number2, number1%number2);
    }
    public static String Result(int number1,int number2,int NOD){
        if (number1%number2==0){
            return Integer.toString(number1/number2);
        }
        String Ans1=Integer.toString(number1/NOD);
        String Ans2=Integer.toString(number2/NOD);
        return Ans1+"/"+Ans2;
    }

}

package block4;

import java.util.Scanner;

// Задача 4.6 ★★ Сумма рекурсией — условие в tasks/block-4-loops.md
public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(Recurse(number));
    }
    public static int Recurse(int number){
        if(number==0){
            return 0;
        }
        return number+Recurse(number-1);
    }
}

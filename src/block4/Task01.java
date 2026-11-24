package block4;

import java.util.Scanner;

// Задача 4.1 ★ Таблица умножения — условие в tasks/block-4-loops.md
public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=1; i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }

    }
}

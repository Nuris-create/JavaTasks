package block4;

import java.util.Scanner;

// Задача 4.8 ★★★ Ёлка любой высоты — условие в tasks/block-4-loops.md
public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(Tree(number));
    }
    public static int Tree(int n){
        for (int i=1;n>0;n--,i+=2){
            for(;n>0;n--){
                System.out.print(" ");
            }

            for(;i>0;i--){
                System.out.print("*");
            }
            System.out.println();

        }
        return 0;
    }
}

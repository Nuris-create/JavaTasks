package block4;

import java.util.Scanner;

// Задача 4.3 ★★ Сложи бумагу — условие в tasks/block-4-loops.md
public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long height=scanner.nextInt();
        System.out.println(countFolds(height));

    }
    public static int countFolds(long meters){
        long thickness=1l;
        meters*=10000l;
        int folds=0;
        while(meters>thickness){
            thickness*=2;

            folds++;
        }
        return folds;

    }
}

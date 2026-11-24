package block3;

import java.util.Scanner;

// Задача 3.3 ★★ Средняя температура — условие в tasks/block-3-functions.md
public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int utro=scanner.nextInt();
        int dnem=scanner.nextInt();
        int vecher=scanner.nextInt();
        int noch=scanner.nextInt();
        System.out.println(Average(utro,dnem,vecher,noch));
    }
    static double Average(int a,int b,int c,int d){
        return (a+b+c+d)/4.0;
    }
}

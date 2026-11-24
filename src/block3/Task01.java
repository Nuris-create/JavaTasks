package block3;

import java.util.Scanner;

// Задача 3.1 ★ Прямоугольник — условие в tasks/block-3-functions.md
public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scale1=scanner.nextInt();
        int scale2=scanner.nextInt();
        System.out.println(per(scale1,scale2));
        System.out.println(area(scale1,scale2));

    }
    static int per(int width, int height){
        return 2*(width+height);
    }
    static int area(int width,int height){
        return width*height;
    }
}

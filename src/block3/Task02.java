package block3;

import java.util.Scanner;

// Задача 3.2 ★ Расстояние — условие в tasks/block-3-functions.md
public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position1=scanner.nextInt();
        int position2=scanner.nextInt();
        System.out.println(Distance(position1,position2));
    }
    static int Distance(int pos1, int pos2){
        return Abs(pos1-pos2);
    }
    static int Abs(int pos3){
        return Math.abs(pos3);
    }
}

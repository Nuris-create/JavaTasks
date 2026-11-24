package block4;

import java.util.Scanner;

// Задача 4.2 ★★ Угадай число — условие в tasks/block-4-loops.md
public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      for(int attempt=0;;){
          int input=scanner.nextInt();
          attempt++;
          if(input!=37){
              if(input>37 && 100>=input){
                  System.out.println("Загаданное меньше");
              }
              else if(input<37 && 0<input){
                  System.out.println("Загаданное больше");
              }
              else {
                  System.out.println("Число должно быть от 1 до 100");
                  attempt--;
              }
          }
          else{
              System.out.println("Угадал! Попыток:"+attempt);
              break;
          }
        }

    }
}

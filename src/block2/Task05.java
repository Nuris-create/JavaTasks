package block2;

import java.util.Scanner;

// Задача 2.5 ★★ Калькулятор — условие в tasks/block-2-branching.md
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt();
        String operator=scanner.next();
        int number2=scanner.nextInt();


            switch (operator) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "/":
                    if (number2==0)
                    {
                        System.out.println("На ноль делить нельзя");
                    }
                    else {
                        System.out.println(number1 / number2);
                    }
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "%":
                    System.out.println(number1 % number2);
                    break;
                default:
                    System.out.println("ERROR");


        }
    }
}

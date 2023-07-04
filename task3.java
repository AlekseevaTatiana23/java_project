// // Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

 public class task3 {
     public static void main(String[] args) {
         Scanner iScanner = new Scanner(System.in);
         System.out.print("Введите первое число: ");
         int numb_first = iScanner.nextInt();
         System.out.print("Введите второе число: ");
         int numb_second = iScanner.nextInt();
         System.out.println("Введите операцию + - / *: ");
         char operation = iScanner.next().charAt(0);
         int res;
         switch (operation) {
             case '+':
                 res = numb_first + numb_second;
                 System.out.printf("Результат: %d",res);
                 break;
             case '-':
                 res = numb_first - numb_second;
                 System.out.printf("Результат: %d",res);
                 break;
             case '/':
                 res = numb_first / numb_second;
                 System.out.printf("Результат: %d",res);
                 break;
             case '*':
                 res = numb_first * numb_second;
                 System.out.printf("Результат: %d",res);
                 break;

         }
         iScanner.close();
     }
 }

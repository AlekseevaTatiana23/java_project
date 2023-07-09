// // Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

import java.io.IOException;
import java.util.logging.*;

 public class logForCalculator {
     /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(logForCalculator.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        //logger.setLevel(Level.INFO);
        logger.info("Some info");
        
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

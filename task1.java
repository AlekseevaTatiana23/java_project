/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите 1-ое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", SumNumber(i));
        iScanner.close();
    }

    
    public static int SumNumber(int a) {
    return (a * (a + 1)) / 2;
    }
}
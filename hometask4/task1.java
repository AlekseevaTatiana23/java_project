//Даны два Deque, представляющие два целых числа. 
//Цифры хранятся в обратном порядке и 
//каждый из их узлов содержит одну цифру.
//1) Умножьте два числа и верните произведение в виде связанного списка.
//2) Сложите два числа и верните сумму в виде связанного списка. // LinkedList (связанный список). 
//Одно или два числа должны быть отрицательными.

package hometask4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class task1 {
    public static int deQueToInt(Deque<Integer> l1) {
        StringBuilder res1 = new StringBuilder();

        l1.stream().forEach(S -> res1.insert(0, S));
        int foo = 0;
        try {
            foo = Integer.parseInt(res1.toString());
        } catch (NumberFormatException e) {
            foo = 0;
        }
        return foo;
    }

    public static Deque<Integer> intTodeQue(int l1) {
        Deque<Integer> res = new ArrayDeque<>();
        String str1 = Integer.toString(l1);

        if (str1.charAt(0) == '-') {
            res.push(-Integer.parseInt(str1.substring(1, 2)));
            for (int i = 2; i < str1.length(); i++) {
                res.push(Integer.parseInt(str1.substring(i, i + 1)));
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                res.push(Integer.parseInt(str1.substring(i, i + 1)));
            }
        }
        return res;
    }

    public static Deque<Integer> multNumbersStr(Deque<Integer> l1, Deque<Integer> l2) {
        int sum1 = deQueToInt(l1), sum2 = deQueToInt(l2);
        int mult = sum1 * sum2;
        return intTodeQue(mult);
    }

    public static Deque<Integer> sumNumbers(Deque<Integer> l1, Deque<Integer> l2) {
        Deque<Integer> res = new ArrayDeque<>();
        int sum = 0;
        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();

        while (it1.hasNext() || it2.hasNext()) {
            if (it1.hasNext()) {
                sum += it1.next();
            }
            if (it2.hasNext()) {
                sum += it2.next();
            }
            res.addLast(sum % 10);
            sum /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();

        dq1.addFirst(2);
        dq1.addLast(4);
        dq1.addLast(-3);

        dq2.addFirst(5);
        dq2.addLast(6);
        dq2.addLast(4);

        System.out.println(" dq1 : " + dq1);
        System.out.println(" dq2 : " + dq2);
        System.out.println(" dq1 + dq2 : " + sumNumbers(dq1, dq2));
        System.out.println(" dq1 * dq2: " + multNumbersStr(dq1, dq2));
    }
}

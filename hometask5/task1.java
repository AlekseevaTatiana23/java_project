package hometask5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    //public static void sortName(Map<String, Integer> map) {
       // Map<Integer, ArrayList<String>> sortMap = new HashMap<>();
       // ArrayList<Integer> listCount = new ArrayList<>();
       // for (var item : map.entrySet()) {
       //     if (listCount.contains(item.getValue()) == false)
      //          listCount.add(item.getValue());
      //  }
     //   listCount.sort(null);
       // for (int i = listCount.size() - 1; i > -1; i--) {
      //      for (var item : map.entrySet()) {
      //          if (listCount.get(i) == item.getValue())
      //              System.out.printf("%s : %d \n", item.getKey(), item.getValue());
       //     }
      //  }
   // }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Ivanov", 1234, bookPhone);
        addNumber("Petrov", 546585, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 787897, bookPhone);
        printBook(bookPhone);
        //sortName(bookPhone);
    }

}



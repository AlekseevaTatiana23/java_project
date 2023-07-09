//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {5, 9, -6, 0, 18, 1, -1};
        lib.printArrayInt(array);
        int[] newArr = BubbleSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }
    public static int[] BubbleSort(int [] arr) {
        for(int j = 0; j < arr.length-1; j++) {
            
            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}

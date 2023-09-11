package seminars;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class IntegerArrayCheckedNull {

    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, null, 1, null, 0, 1, 1, 0, 1};
        CheckArrayForNull(ints);
    }

    public static void CheckArrayForNull(Integer[] arr){
        if (arr == null) System.out.println("В метод передам null");
        List<Integer> nullIndexes = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) nullIndexes.add(i);
        }
        if (nullIndexes.size() > 0) System.out.println(nullIndexes);
        else System.out.println("Элементов null в списке нет");

    }
}

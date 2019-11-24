import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Loops {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = new ArrayList<>();
        for (Integer i : list)
        {
            list2.add(i + 1);
        }
        System.out.println(list2);

        //no java 8
        list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        list2 = list.stream().map(i ->  i+1).filter(i-> i >= 5).collect(Collectors.toList());
        System.out.println(list2);

    }
}

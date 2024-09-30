import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Average : " + average);
    }
}

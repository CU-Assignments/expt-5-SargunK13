import java.util.ArrayList;
import java.util.List;

public class easy {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String[] inputStrings = {"10", "20", "30", "40", "50"};

        for (String str : inputStrings) {
            numbers.add(parseStringToInteger(str));
        }

        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }

    public static Integer parseStringToInteger(String str) {
        return Integer.parseInt(str);
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number; // Unboxing occurs here
        }
        return sum;
    }
}

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmallestNumber {

    public static void main(String[]args){
        System.out.print(minValue(new int[]{1,3,1}));
    }

    /**
     * Given a list of digits, return the smallest number that could be formed from these digits,
     * using the digits only once ( ignore duplicates).
     * @param values
     * @return
     */
    static int minValue(int[]values){
        return Integer.parseInt(
                Arrays.stream(values)
                        .sorted()
                        .distinct()
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining("")));
    }
}


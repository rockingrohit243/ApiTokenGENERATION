import java.util.List;

public class FunctionOdd {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,23,4,4,76,34,90 ,21,34,2345);
        System.out.println("The odd numbers are:");
        numbers.stream().filter(number->number%2 == 1).forEach(System.out::println);
    }
}

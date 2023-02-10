import java.util.List;

public class FunctionProgramming {
    public static void main(String[] args) {
        methodFunctional((List.of(1,3,5,7,9,10,13,15,17,19)));
    }

    private static void methodFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FunctionProgramming::print);
    }

    private static void print(Integer numbers) {
        System.out.println(numbers);
    }


}


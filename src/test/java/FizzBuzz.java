import java.util.ArrayList;

public class FizzBuzz {

    private int[] numbers;
    private String fizz = "Fizz";
    private String buzz = "Buzz";
    private int three = 3;
    private int five = 5;

    public FizzBuzz() {
    }

    public FizzBuzz(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }


    public ArrayList<String> play() {
        ArrayList<String> output = new ArrayList<>();
        for (int number : numbers) {
            output.add(getFizzBuzz(number));
        }
        return output;
    }

    private String getFizzBuzz(int number){
        if (number % three == 0 && number % five == 0) return fizz + " " + buzz;
        if (number % three == 0) return fizz;
        if (number % five == 0) return buzz;
        return String.valueOf(number);
    }
}

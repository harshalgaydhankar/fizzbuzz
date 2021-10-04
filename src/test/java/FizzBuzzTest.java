import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldHaveAnEntryPointToPlayFizzBuss(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        //then
        assertEquals(fizzBuzz instanceof FizzBuzz, true);
    }

    @Test
    public void shouldTakeAListOfNumberAsInputForGame(){
        //given
        int numbers[] = {1,2,3,4,5};
        //when
        FizzBuzz fizzBuzz = new FizzBuzz(numbers);
        //then
        assertEquals(fizzBuzz.getNumbers(), numbers);
    }

    @Test
    public void shouldReturnEmptyGameOutputForGivenEmptyListOfNumbers(){
        //given
        int numbers[] ={};
        //when
        FizzBuzz fizzBuzz = new FizzBuzz(numbers);
        ArrayList<String> gameOutput = fizzBuzz.play();
        //then
        assertEquals(gameOutput.size(), 0);
    }

    @Test
    public void shouldReturnGameOutputForGivenListOfNumbersWhichDontHaveFiveInIt(){
        //given
        int numbers[] ={1,2,3};
        //when
        FizzBuzz fizzBuzz = new FizzBuzz(numbers);
        ArrayList<String> gameOutput = fizzBuzz.play();
        //then
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList(new String[]{"1", "2", "Fizz"}));
        assertEquals(gameOutput.size(), 3);
        assertEquals(gameOutput, expectedOutput);
    }

    @Test
    public void shouldReturnGameOutputForGivenListOfNumbersWhichDontHaveThreeInIt(){
        //given
        int numbers[] ={1,2,4,8,5};
        //when
        FizzBuzz fizzBuzz = new FizzBuzz(numbers);
        ArrayList<String> gameOutput = fizzBuzz.play();
        //then
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList(new String[]{"1", "2","4","8", "Buzz"}));
        assertEquals(gameOutput.size(), 5);
        assertEquals(gameOutput, expectedOutput);
    }

    @Test
    public void shouldReturnGameOutputForGivenListOfNumbers(){
        //given
        int numbers[] ={10,11,12,13,14,15};
        //when
        FizzBuzz fizzBuzz = new FizzBuzz(numbers);
        ArrayList<String> gameOutput = fizzBuzz.play();
        //then
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList(new String[]{"Buzz", "11","Fizz","13", "14", "Fizz Buzz"}));
        assertEquals(gameOutput.size(), 6);
        assertEquals(gameOutput, expectedOutput);
    }


}

package telran.game;

import java.util.ArrayList;
import java.util.Collections;

public class gameAppl {

    public static void main(String[] args) {
        numberGenerator();

    }



    public static ArrayList<Integer> numberGenerator () {
        ArrayList <Integer> numbers = new ArrayList<>();
        for(int i = 1; i < 9; i++)
        {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        numbers.subList(4, numbers.size()).clear();
        for (Integer number : numbers) {
            System.out.print(number);

        }
        return numbers;
    }


}

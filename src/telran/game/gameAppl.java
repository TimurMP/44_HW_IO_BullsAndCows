package telran.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class gameAppl {

    public static void main(String[] args) throws IOException {
        numberGenerator();
        userInput();

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


    public static void userInput () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = System.out;
        while (true){
            String line = reader.readLine();
            if (line == null){
                break;
            }
//            printStream.println(line);
        }
    }


}

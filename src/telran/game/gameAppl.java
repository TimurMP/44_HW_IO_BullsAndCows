package telran.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class gameAppl {

    public static void main(String[] args) throws IOException {
        String num = "1234";

        System.out.println();
        ArrayList<Integer> numberGenerator = numberGenerator();


        System.out.println();
        System.out.println(numberGenerator);
        System.out.println(checkBulls(num, numberGenerator));
        System.out.println(checkCows (num, numberGenerator));

        checkBulls(num, numberGenerator);
        checkCows (num, numberGenerator);


    }


    public static ArrayList<Integer> numberGenerator() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        numbers.subList(4, numbers.size()).clear();
        for (Integer number : numbers) {
            System.out.print(number);

        }
        return numbers;
    }


    public static void userInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = System.out;
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }

            if (line.equals("123")) {
                break;
            }
//            printStream.println(line);
        }
    }


    public static int checkBulls(String userNumber, ArrayList<Integer> numberList) {
        int countBulls = 0;
        ArrayList<Integer> userInputList = new ArrayList<>();
        for (int i = 0; i < userNumber.length(); i++) {
            userInputList.add(Integer.parseInt(String.valueOf(userNumber.charAt(i))));
        }

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i).equals(userInputList.get(i))) {
                countBulls++;
            }
        }
        return countBulls;
    }


    public static int checkCows(String userNumber, ArrayList<Integer> numberList) {
        int countCows = 0;
        ArrayList<Integer> userInputList = new ArrayList<>();
        for (int i = 0; i < userNumber.length(); i++) {
            userInputList.add(Integer.parseInt(String.valueOf(userNumber.charAt(i))));
        }

        for (int i = 0; i < numberList.size(); i++) {
            if (!numberList.get(i).equals(userInputList.get(i))){
                for (int j = 0; j < numberList.size(); j++) {
                    if (numberList.get(i).equals(userInputList.get(j)) ) {
                        countCows++;
                    }
                }

            }

        }
        return countCows;
    }


}

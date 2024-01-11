package c322.Lab1;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        //test cases for problem 1
        int[][] numbersList = {{2, 7, 11}, {3, 2, 4}, {3, 3}};
        int[] targetList = {9, 6, 6};
        int[][] expectedList = {{0, 1}, {1, 2}, {0, 1}};

        int count = 0;
        for(int i = 0; i < numbersList.length; i++){
            int[] numbers = numbersList[i];
            int target = targetList[i];
            int[] expected = expectedList[i];

            int[] output = Problems.problem1(numbers, target);
            String result = "Wrong Answer";
            if(expected[0] == output[0] && expected[1] == output[1]){
                result = "Correct Answer";
                count++;
            }
            System.out.println(result);
            System.out.println("numbers:" + Arrays.toString(numbers));
            System.out.println("target:" + target);
            System.out.println("expected:" + Arrays.toString(expected));
            System.out.println("output:" + Arrays.toString(output));

        }
        System.out.println("Correct answers:" + count + " out of " + numbersList.length);


        // Test cases for problem2
        int[] P2NL = {121, -121, 1221, 12345, 0, 12321};
        boolean[] P2EL = {true, false, true, false, true, true};

        int P2count = 0;
        for (int i = 0; i < P2NL.length; i++) {
            int P2num = P2NL[i];
            boolean P2expected = P2EL[i];

            boolean output = Problems.problem2(P2num);
            String result = "Wrong Answer";
            if (P2expected == output) {
                result = "Correct Answer";
                P2count++;
            }
            System.out.println(result);
            System.out.println("Number: " + P2num);
            System.out.println("Expected: " + P2expected);
            System.out.println("Output: " + output);
        }
        System.out.println("Correct answers: " + P2count + " out of " + P2NL.length);

            // Test cases for problem 3
            String[][] strsList = {{"flower", "flow", "flight"}, {"dog", "racecar", "car"}};
            String[] P3EL = {"fl", ""};

            int P3count = 0;
            for (int i = 0; i < strsList.length; i++) {
                String[] strs = strsList[i];
                String P3expected = P3EL[i];

                String output = Problems.problem3(strs);
                String result = "Wrong Answer";
                if (P3expected.equals(output)) {
                    result = "Correct Answer";
                    P3count++;
                }
                System.out.println(result);
                System.out.println("Input: " + Arrays.toString(strs));
                System.out.println("Expected: " + P3expected);
                System.out.println("Output: " + output);
            }
            System.out.println("Correct answers: " + P3count + " out of " + strsList.length);

            //test cases for problem 4
        // Test cases for problem 4
        String[] romanNumerals = {"III", "LVIII", "MCMXCIV"};
        int[] P4EL = {3, 58, 1994};

        int P4count = 0;
        for (int i = 0; i < romanNumerals.length; i++) {
            String P4num = romanNumerals[i];
            int P4expected = P4EL[i];

            int output = Problems.problem4(P4num);
            String result = "Wrong Answer";
            if (P4expected == output) {
                result = "Correct Answer";
                P4count++;
            }
            System.out.println(result);
            System.out.println("Input: " + P4num);
            System.out.println("Expected: " + P4expected);
            System.out.println("Output: " + output);
        }
        System.out.println("Correct answers: " + P4count + " out of " + romanNumerals.length);

        //test cases for prob 5
        String[] inputStrings = {"()", "()[]{}", "(]"};
        boolean[] P5EL = {true, true, false};

        int P5count = 0;
        for (int i = 0; i < inputStrings.length; i++) {
            String input = inputStrings[i];
            boolean expected = P5EL[i];

            boolean output = Problems.problem5(input);
            String result = "Wrong Answer";
            if (expected == output) {
                result = "Correct Answer";
                P5count++;
            }
            System.out.println(result);
            System.out.println("Input: " + input);
            System.out.println("Expected: " + expected);
            System.out.println("Output: " + output);
        }
        System.out.println("Correct answers: " + count + " out of " + inputStrings.length);
    }




}


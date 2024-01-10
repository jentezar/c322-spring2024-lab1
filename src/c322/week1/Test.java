package c322.week1;
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






    }
}

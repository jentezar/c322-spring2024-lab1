package c322.Lab1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Problems {
    //problem 1
    public static int[] problem1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    //problem 2
    public static boolean problem2(int x) {
        String numStr = Integer.toString(x);
        char[] numChars = numStr.toCharArray();

        for (int i = 0, j = numChars.length - 1; i < j; i++, j--) {
            char temp = numChars[i];
            numChars[i] = numChars[j];
            numChars[j] = temp;
        }

        String reversedStr = new String(numChars);

        return numStr.equals(reversedStr);
    }

    public static String problem3(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < firstStr.length() && i < lastStr.length(); i++) {
            if (firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }

    //problem 4
    public static int problem4(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = romanValues.get(s.charAt(i));
            //subtract condition
            if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > cur) {
                result -= cur;
            } else {
                result += cur;
            }
        }

        return result;
    }

    //problem 5
    public static boolean problem5(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char bracket = st.pop();
                if ((c == ')' && bracket != '(') ||
                        (c == ']' && bracket != '[') ||
                        (c == '}' && bracket != '{')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }


    }


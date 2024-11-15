package stacks;

import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        boolean res = isPalindrome("OKKO");
        if (res){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }

    public static boolean isPalindrome(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }
        int i =0;
        while (!stack.isEmpty()){
            char ch = s.charAt(i++);
            char ch1 = stack.pop();
            if (ch != ch1) return false;
        }
        return true;
    }
}

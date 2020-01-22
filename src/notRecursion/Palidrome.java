package notRecursion;

public class Palidrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String str){
        boolean flag = true;
        for (int i = 0; i < str.length()/2; i++) {
            char first = str.charAt(i);
            char comparrison = str.charAt((str.length()-1)-i);
            if(first != comparrison){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

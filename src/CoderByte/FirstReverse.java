package CoderByte;

public class FirstReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("hello world"));
    }
    public static String reverseString(String str){
        if(str.length()== 1) return str;
        String last = String.valueOf(str.charAt(str.length()-1));
        return last + reverseString(str.substring(0, str.length()-1));
    }
}

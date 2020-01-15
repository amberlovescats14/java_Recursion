package codewars;

public class DontGiveMeFive {
    public static void main(String[] args) {

    }

    public static int getSum(int start, int end) {
        if(start == end )
            if(!Integer.toString(end).contains("5")) return 1;
            else return 0;
        if(!Integer.toString(start).contains("5"))
            return 1 + getSum(start + 1, end);
        else return getSum(start+1, end);
    }
}

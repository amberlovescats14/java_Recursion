package notRecursion;

public class NumberOfDivisors {
    public static void main(String[] args) {
        System.out.println(findAmountOfDivisors(30));
    }
    public static int findAmountOfDivisors(int n){
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0) count++;
        }
        return count;
    }
}

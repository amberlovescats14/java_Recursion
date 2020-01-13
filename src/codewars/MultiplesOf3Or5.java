package codewars;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(getMultiples(10));
    }

    public static int getMultiples(int number){
        int total = 0;
        for (int i = number-1; i > 0; i--) {
            if((number-i) % 3 == 0 || (number-i )% 5 == 0 ) {
                System.out.println(number);
                total += ( number-i);
            }
        }
        return total;
    }
}

package notRecursion;

import java.util.Arrays;

public class VaysaClerk {
    public static void main(String[] args) {
        System.out.println(sellTickets(new int[] {25, 100}));

    }

    public static String sellTickets(int [] peopleInLine){
        String answer = "YES";
        if(peopleInLine.length == 0) return answer;
        int amountInRegister = 0;
        int amountOfChangeDue = 0;
        for (int amount : peopleInLine) {
            amountOfChangeDue = amount - 25;
            System.out.println("in reg: "+amountInRegister);
            System.out.println("change: "+amountOfChangeDue);
            if(amountOfChangeDue > amountInRegister) {
                System.out.println("no");
                answer = "NO";
                break;
            }
            amountInRegister += amount;
            amountInRegister -= amountOfChangeDue;
            amountOfChangeDue = 0;
        }
        return answer;
    }
}

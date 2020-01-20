package notRecursion;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        System.out.println(checkIfValidPhoneNumber("(123) 123-1234"));
    }
    public static boolean checkIfValidPhoneNumber(String phoneNumber){
        boolean flag = true;
        String phoneNumberFormat = "(nnn)*nnn-nnnn";
        if(phoneNumberFormat.length() != phoneNumber.length()) return false;
        for (int i = 0; i < phoneNumberFormat.length(); i++) {
            System.out.println("compare: "+phoneNumberFormat.charAt(i)+" "+phoneNumber.charAt(i));
            if(phoneNumberFormat.charAt(i) =='*')
                if(phoneNumber.charAt(i) != ' ') {
                    flag = false;
                    break;
                }
            if(phoneNumberFormat.charAt(i) == 'n')
                if(!String.valueOf(phoneNumber.charAt(i)).matches("[0-9]")) {
                    flag = false;
                    break;
                }
            if(phoneNumberFormat.charAt(i) != 'n' && phoneNumberFormat.charAt(i) != '*')
                if(
                    !String.valueOf(phoneNumberFormat.charAt(i)).equals(String.valueOf(phoneNumber.charAt(i)))
                ){
                flag = false;
                break;
            }



        }
        return flag;
    }


    public static boolean testRegex(String str){
        return String.valueOf(str.charAt(0)).matches("[0-9]");
    }
}

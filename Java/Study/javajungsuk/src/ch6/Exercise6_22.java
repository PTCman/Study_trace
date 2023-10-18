package ch6;

public class Exercise6_22 {
    public static boolean isNumber(String str){
        if(str==null || str.equals("")){
            return false;
        }

        boolean check = true;
        for(int i=0;i<str.length();i++){
           if(!('0'<=str.charAt(i) && str.charAt(i)<='9')){
               check = false;
               break;
           }
        }
        return check;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}

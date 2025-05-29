import java.util.Scanner;
public class Main {
    public static String toDigit(long number){
        String result = "";
        while(true){
            if(number < 2){
                result = (number % 2) + result;
                break;
            }
            result = (number % 2) + result;
            number /= 2;
        }
        return result;
    }

    public static long toDecimal(String digit){
        int num = 0;

        for(int i=0; i<digit.length(); i++){
            num= num * 2;
            
            if(digit.charAt(i) == '1'){
                num += 1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        long decimal = toDecimal(binary);
        String result = toDigit(decimal * 17);
        System.out.print(result);
        // Please write your code here.
    }
}
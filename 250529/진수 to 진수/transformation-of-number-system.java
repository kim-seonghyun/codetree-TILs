import java.util.Scanner;
public class Main {

    public static long toDecimal(String number, int digit){
        long result = 0;

        for(int i=0; i<number.length(); i++){
            result = result * digit;
            
            result += (number.charAt(i) - '0');
        }
        return result;
    }

    public static String tobinary(long number, int digit){
        String result = "";
        
        while(true){
            if(number < digit){
                result = (number % digit) + result;
                break;
            }
            result = (number % digit) + result;
            number /= digit;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        long number = toDecimal(N, A);
        String result = tobinary(number, B);
        System.out.println(result);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        // 여러가지 진수 변환
        // 10진수 -> B진수로
        int[] arr = new int[20];
        int cnt = 0;
        while(true){
            if(n < b){
                arr[cnt++] = n % b;
                break;
            }
            arr[cnt++] = n % b;
            n /= b;
        }
        
        for(int i = cnt -1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here;
        

        int day = 0;

        if(A.equals("Mon")){
            day = 0;
        }else if(A.equals("Tue")){
            day = 1;
        }else if(A.equals("Wed")){
            day = 2;
        }else if(A.equals("Thu")){
            day = 3;
        }else if(A.equals("Fri")){
            day = 4;
        }else if(A.equals("Sat")){
            day = 5;
        }else if(A.equals("Sun")){
            day = 6;
        }

        int[] numOfDays = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};

        int first = 0;

        for(int i=1; i< m1; i++){
            first += numOfDays[i];
        }
        first += d1;

        int second = 0;

        for(int i=1; i< m2; i++){
            second += numOfDays[i];
        }
        second += d2;
        
        int diffrences = second - first;
        if(diffrences - day >= 0){
            diffrences -= day;
            int result = diffrences / 7 + 1;

            System.out.println(result);
        }else{
            System.out.println(0);
        }
        
    }
}
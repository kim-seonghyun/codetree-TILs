import java.util.Scanner;

public class Main {

    public static int numOfDays(int month){
        int[] days = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int result = 0;
        for(int i=1; i<month; i++){
            result += days[i];
        }
        return result;
    }

    public static int numOfDay(String day){
        if(day.equals("Mon")){
            return 0;
        }else if(day.equals("Tue")){
            return 1;
        }else if(day.equals("Wed")){
            return 2;
        }else if(day.equals("Thu")){
            return 3;
        }else if(day.equals("Fri")){
            return 4;
        }else if(day.equals("Sat")){
            return 5;
        }else if(day.equals("Sun")){
            return 6;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.

        int firstDays = numOfDays(m1) + d1;
        int secondDays = numOfDays(m2) + d2;
        int currentDay = numOfDay("Mon");
        int result = 0;
        for(int i=firstDays; i<=secondDays; i++){
            if(currentDay == numOfDay(A)){
                result++;
            }
            currentDay = (currentDay + 1) % 7;
        }
        System.out.println(result);
    }
}
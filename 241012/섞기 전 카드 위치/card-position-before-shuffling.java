import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int n;
    static int[] order;
    static int[] board;
    static int[] result;

    public static void main(String[] args) throws IOException {
        inputValue();

        // 2 3 5 4 1 뜻 :
        // 첫번째 요소는 2번쨰로
        // 두번째 요소는 3번쨰로
        // 세번째 요소는 5번쨰로
        // 네번째 요소는 4번쨰로
        // 다섯번째 요소는 1번쨰로


        // 1 2 3 4 5
        // 5 1 2 4 3
        // 3 5 1 4 2
        // 2 3 5 4 1

        // 101  102 103  104  105


        // 그냥 인덱스 계속 돌리면 되겠는데?


        for(int times=0; times<3; times++){
            int[] tmp = new int[n];
            for(int i=0; i<n; i++){
                tmp[order[i] -1] = result[i];
            }
            result = tmp;
        }
        int[] tmp = new int[n];
        for(int i=0; i<n; i++){
            tmp[result[i]] = board[i];
            // board[i] 의 특정 숫자는원래
            // result[i] 번째 위치에 있다.

        }
        for(int i=0; i<n; i++){
            System.out.println(tmp[i]);
        }
    }

    private static void inputValue() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        order = new int[n];
        for(int i=0; i<n; i++){
            order[i] = Integer.parseInt(st.nextToken());
        }
        board = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            board[i] = Integer.parseInt(st.nextToken());
        }
        result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = i;
        }

    }
}
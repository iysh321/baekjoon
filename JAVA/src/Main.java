import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for (int c = 0; c < C; c++) {
            String[] line = br.readLine().split(" ");

            int N = Integer.parseInt(line[0]);
            int[] scores = new int[N];

            for (int i = 0; i < N; i++) {
                scores[i] = Integer.parseInt(line[i + 1]);
            }

            double sum = 0;
            for (int score : scores) {
                sum += score;
            }
            double avg = sum / N;

            int count = 0;
            for (int score : scores) {
                if (score > avg) {
                    count++;
                }
            }

            double percentage = (count / (double) N) * 100;
            System.out.printf("%.3f%%\n", percentage);
        }

        br.close();
    }
}


//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        // 예제 입력 받기
//        String input = br.readLine(); // 한 줄 입력 받기
//        int num = Integer.parseInt(input); // 숫자로 변환
//
//        // 예제 출력
//        bw.write("입력값: " + num + "\n");
//
//        // 자원 닫기 (필수)
//        br.close();
//        bw.flush(); // 남아 있는 출력 데이터를 모두 출력
//        bw.close();
//    }
//}

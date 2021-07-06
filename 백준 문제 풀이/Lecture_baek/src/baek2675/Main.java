package baek2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//완료
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열 상태인 버퍼 리더를 사용할것이다
        int T = Integer.parseInt(br.readLine());
        //먼저 몇개의 문장을 입력할것인지 선택한다
        for (int i = 0; i < T; i++) {

            String str = br.readLine();
            String[] st = str.split(" ");
            //스트링 형식으로 받을것이며 readLine() 은 공백 포함 문자를 받아 문자열을 받는다
            //즉, 공백을 나눌수 있는 함수 split을 사용해 배열에 담는다


            String S = st[1];
            int X = Integer.parseInt(st[0]);
            //배열 0번째는 반복할 횟수가 들어오니 인트형으로 변환해서 받고
            //배열 1번은 문자열이 들어가있으니 다시 스트링 변수에 담아서 처리한다
            for (int p = 0; p < S.length(); p++) {
                for (int j = 0; j < X; j++) {
                    System.out.print(S.charAt(p));
                    //알파벳 잘 좀 보자 헷갈려죽는줄 알았다 한결아 ㅋ
                }
            }
            System.out.println();
        }
    }

}

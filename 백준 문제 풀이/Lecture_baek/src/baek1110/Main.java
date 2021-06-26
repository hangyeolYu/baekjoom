package baek1110;
import java.io.BufferedReader;//받는 함쑤
import java.io.InputStreamReader;//받는 함쑤
import java.io.IOException;//오류잡는 놈

public class Main{ //완료

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());//Buffer는 문자열로 받으니 인트로 형변환 한걸 변수에 넣어놈

        int cnt = 0;//카운터 변수
        int copy = N;

        do {//do while  쓴건 if 를 써도 되나 무조건 한번은 돌아야 하니 만약 if 를 쓸꺼면 식 밑에 오도록 해서 한번은 돌게 하자
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (copy != N);// 다르면 반복 하다가 같아지면 나와서

        System.out.println(cnt);//세어진 카운터 내보냄
    }
}
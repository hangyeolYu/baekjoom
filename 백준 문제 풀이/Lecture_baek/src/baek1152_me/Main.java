package baek1152_me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main { // 완료 공백빼고 나눠서 배열에 담아서 배열 갯수를 벹자 //답은맞지만 오류가 난다 뭐징 ㅋ
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //문제중에  Mazatneunde Wae Teullyeoyo 이런게 있음 잘보자 
        String str = br.readLine().trim();
       String []S = str.split(" ");


       // trim() : 앞 뒤에 공백문자가 있으면 제거
       // "  abc" ==> "abc"
        // "     "
        //그후 split()으로 공백을 제외하고 배열에 넣고 배열 갯수를 세자
        // Mazatneunde Wae Teullyeoyo 첫 공백은 읽지 못해서 독자적인 배열 공간을 할당받았다

         System.out.println(S.length);
    }
}

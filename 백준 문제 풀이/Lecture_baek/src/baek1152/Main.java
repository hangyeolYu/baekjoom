package baek1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main { // 공백빼고 나눠서 배열에 담아서 배열 갯수를 벹자   ??? 뭐지 다시 잘보자 뭘 놓쳤는지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //문제중에  Mazatneunde Wae Teullyeoyo 이런게 있음 잘보자 
        String str = br.readLine();
       String []S = str.split(" ");
        System.out.println(S.length);
    }
}

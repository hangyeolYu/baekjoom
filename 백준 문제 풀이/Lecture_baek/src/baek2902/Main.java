package baek2902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//완료
    public static void main(String[] args) throws IOException {//이문제는 스트링으로 받은 문장을 차배열로 쪼개서 대입후
        //대문자 범위 내에서만 print 형식으로 출력함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char [] arr = new char[str.length()];
        for(int i =0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        for(int i =0;i<str.length();i++){
            if((int)(arr[i])>=65&&(int)(arr[i])<=90){
                System.out.print(arr[i]);
            }
        }
    }

}

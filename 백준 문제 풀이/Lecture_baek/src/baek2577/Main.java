package baek2577;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//완료
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//버퍼 리더로 받는다 세 수를 형변환!
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        //int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        //혹은 이렇게 표현 가능
        int [] arr = new int[10];//0~9
        char [] arrChar = new char[arr.length];

        String str = String.valueOf(A*B*C);
        //"10001303010"


   

       for(int i=0;i<str.length();i++){
           arr[str.charAt(i)-48]++;
           //arr[str.char(i)-'0']++;
       }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

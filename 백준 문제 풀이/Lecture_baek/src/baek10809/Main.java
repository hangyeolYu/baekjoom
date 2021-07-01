package baek10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//완료  // 자세히 보자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[26]; //
        for(int i = 0;i < arr.length;i++){arr[i]=-1;}

        String S =br.readLine();

        char box = '\u0000';
//        box = (char)(arr[0]+98);
//        System.out.println(box);


        for(int i =0;i<S.length();i++){
            for(int j=0;j<arr.length;j++) {

                box = (char) (97 + j); //a~z 를 문자로 바꿔 박스에 넣는다
                if (arr[j] != -1) { //그전에 순서를 넣어놨으면 지나가기
                    box = '\u0000';// 초기화
                }
                else if (S.charAt(i) == (box)) {//만약 받은 단어의 문자에 채크를 하고

                arr[j] = i;  //몇번째에 있었는지 대입하기
                box = '\u0000';
            }

                else box = '\u0000';
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
       }

    }
}

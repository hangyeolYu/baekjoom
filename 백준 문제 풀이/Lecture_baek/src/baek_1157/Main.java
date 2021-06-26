package baek_1157;

import java.io.*;

public class Main {//완료
    public static void main(String[] args) throws IOException {///////백줌 문자열 변환 문제 카톡방 링크
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//버퍼로 받고

        String word = br.readLine();//스트링으로 받아
        String wordUpper = word.toUpperCase(); //대문자 변환

//        char[] myChars = wordUpper.toCharArray();
//
//        int [] num = Integer.parseInt(String(myChars));

        int [] count = new int[26]; // 영어 알파벳의 숫자는 26개이다

        for (int i = 0; i < wordUpper.length(); i++) {
            if('A'<=wordUpper.charAt(i)&&wordUpper.charAt(i)<='Z'){//돌리면서 해당범위에 있을때 카운터 배역 객체(원소 )에 ++
                count[wordUpper.charAt(i)-'A']++;
            }
            }


        int standard = -1; //기준을 -1 로 잡고
        char end ='?'; // 두개이상일때 대비해 일단 ? 넣어둠

        for(int i =0;i < count.length;i++){
            if(count[i] > standard){
                 standard = count[i];
                 end = (char) (i+65); //가장 많이 나온걸 넣어둠
            }
            else if (count[i]==standard){
                end ='?'; //같아지면 바로 ? 넣고 끝
            }
        }

        System.out.println(end); //내보내고
        bw.flush(); //비우고
        bw.close(); //닫고
    }
}
//드디어 끝 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ하
package baek2908;


import java.io.*; //버퍼 리더를 받기위한 임폴트와 오류 처리
import java.util.StringTokenizer;//토크나이져 활용

public class Main {//완료
    public static void main(String[] args)  throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 리더로 받고
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 라이터로 return 값을 보냄

        StringTokenizer str = new StringTokenizer(br.readLine()," ");  //스트링으로 받고 토크나이저로 " " 받음!

         int A = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());//" " 로 나눈 문자열을 뒤집어서 인트화해서 나눠서 넣고
        int B = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());

        System.out.println(A>B?A:B); // 비교해서 큰걸 출력


        }
    }


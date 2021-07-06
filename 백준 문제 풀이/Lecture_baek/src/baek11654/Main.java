package baek11654;


import java.io.IOException;


        public class Main {//완료 문제 출제하고 답 나오는거좀 재대로 보자 ㅋㅋㅋㅋㅋㅋ
            public static void main(String[] args) throws IOException {

                int a = System.in.read();
                System.out.println(a);
//Sytem.in 의 in 은 InputStream을 의미 한다. 입력 받으면 바이트로 받아 바이트값으로
                //출력이 된다 .read()는 바이트 값을 문자 값으로 읽어 내보낸다 이문제는 아스키 값을
                //내보내는 것으로 read까지만 해서 그냥 출력하면된다!
                //추가로 Scanner sr = new Scanner(System.in); 은 바이트 값을 내부 스트림에서
                //받아서 다시 ch 단위로 받아 상위로 보내고 받은걸 String 으로 형식으로 저장후 원하던 출력 형식으로 형변환을해 내보낸다
                //그래서 스캐너로 받은걸 형변환을 써서 쓰면 효율이 안좋은것 .
                //반대로 BufferedReadr는 read() 값을 입력이 끝날때까지 잠시 대기하면 받는다
                //그후 기달리다가 받은 문자들을 합쳐 문자열로 내보낸다
                //구조적으로 하나하나 채크하는 Scanner보다 ch 단위로 받아 그대로 String
                //형식으로 뱉기때문에 빠르다.

                //https://st-lab.tistory.com/41?category=830901
                //참고 자료 링크
    }
}

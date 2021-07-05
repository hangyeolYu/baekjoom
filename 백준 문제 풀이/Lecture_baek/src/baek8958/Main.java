package baek8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//완료
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int how = Integer.parseInt(br.readLine());
        for (int j = 0; j < how; j++) {
            String str = br.readLine(); //이건 한번딱 받아서 하는거 인풋으로 몇번 받을지 받는 식도 만들자
            int count = 0;
            int temp = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'O') {
                    count++;
                    temp += count;

                } else if (str.charAt(i) == 'X') {
                    count = 0;
                }
            }
            System.out.println(temp);
        }
    }
}

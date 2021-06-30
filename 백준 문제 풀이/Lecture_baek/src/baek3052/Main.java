package baek3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {//완료 HashSet 은 같은 수가 들어오면 사라진다!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0; i < 10;i++){
            hash.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(hash.size());
    }
}

package baek5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {//모르겠다 난 어려움 공략보면서 쉽게 생각하자아!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count =0;
    int N = str.length();
    for(int i =0;i < N;i++){
        switch (str.charAt(i)){
            case'A','B','C':
                count +=3;
            break;

            case'D','E','F':
                count += 4;
                break;

            case'G','H','I':
                count += 5;
                break;

            case 'J' : case 'K': case 'L' :
                count += 6;
                break;

            case 'M' : case 'N': case 'O' :
                count += 7;
                break;

            case 'P' : case 'Q': case 'R' : case 'S' :
                count += 8;
                break;

            case 'T' : case 'U': case 'V' :
                count += 9;
                break;

            case 'W' : case 'X': case 'Y' : case 'Z' :
                count += 10;
                break;

        }
    }
        System.out.println(count);

    }
}

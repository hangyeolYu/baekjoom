package baek4344_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();

        for(int i=0;i< N;i++){
            int sum = 0;
            int count =0;
            double box =0;
            sc.close();
            Scanner sc2 = new Scanner(System.in);
           String str = sc2.nextLine();
           String [] st = str.split(" ");
           int students = Integer.parseInt(st[0]);
           for(int j=1;j<students+1;j++){
               sum += Integer.parseInt(st[j]);
           }
           box= (double)sum/N;
           for(int p=1;p<st.length;p++){
               if(Integer.parseInt(st[p])>box){
                   count++;
               }
           }
            System.out.printf("%.3f%%\n",((double)count/students)*100);
        }


    }

}


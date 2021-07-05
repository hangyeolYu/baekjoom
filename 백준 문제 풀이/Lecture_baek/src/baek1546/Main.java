package baek1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {//완료      인트형으로 시작해서 틀림 더블형으로 받자
    public static void main(String[] args) throws IOException {//현재 런타임 에러 줄여보자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double [] arr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i =0; i<arr.length;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0;i < arr.length;i++){
            arr[i] = (arr[i]/arr[arr.length-1])*100;
        }

        double temp = 0;

        for(int i = 0;i < arr.length;i++){
            temp += arr[i];
        }
        System.out.println(temp/N);

        //int box = Math.max(int x, int y); 두 수를 비교해 큰수를 box에 담는다

        //int max = 0;
        //    for (int i : original) {
        //      max = Math.max(max, i);
        //    } 이치 포문으로 돌리면서 할수있다



   다}
}

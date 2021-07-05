package baeksee;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    double [] arr = new double[N];

    double box =0;

    for(int i =0; i< N;i++){
        arr[i] = sc.nextDouble();

    }
    //arr = {40.00 , 60.00, 80.00}
        Arrays.sort(arr);
   // arr - {40.00 , 60.00 , 80.00}

        for(int i =0; i< arr.length;i++){
            arr[i] = arr[i]/arr[arr.length-1]*100;
        }
        //40 /
        for(int i =0 ;i < arr.length;i++){
            box +=arr[i];
        }
        System.out.println(box/N);




    }
}

package baek10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {//완료
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        N = sc.nextInt();

        int [] arr = new int [N];//입력받은 수만큼 배열의 크기를 생성

        for(int i = 0;i <arr.length;i++){
            arr[i]= sc.nextInt(); //for문으로 배열의 원소값을 입력
        }
        Arrays.sort(arr);//오름차순 배열

        System.out.printf("%d %d",arr[0],arr[N-1]);// 최소값과 최댓값 출력
    }
}

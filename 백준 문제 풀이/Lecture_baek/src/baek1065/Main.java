package baek1065;

import java.util.Scanner;

public class Main {//완료
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(d(sc.nextInt()));
        //자연수 는 1,000보다 작거나 같다 받고 함수로 바로 출력하자
    }



    public static int d(int number){
        int cnt =0;
        if(number < 100){
            return number;
            //1~99 두자리 수는 전부다 한수이다 그러므로 두자리가 들어오면 바로 뱉자
        }
        else {
            cnt =99;
            if(number ==1000){
                number =999;
                //1000이 들어오면 1000은 계산 할 필요가 없다 999 라 정의 하자
                //99이상이라는 뜻이므로 카운터에 99를 더해논다
            }

            for(int i =100;i <=number;i++){
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;
                if(hun -ten == ten-one){
                    cnt++;
      //100의 자리, 10의 자리 ,1의 자리를 각 구해 만약 100-10 == 10 =1 자릿수가 같다면
      //카운터를 하고 출력하자
                }
            }
        }
        return cnt;
    }
}

package baek4344;




import java.util.Scanner;

public class Main {//완료 Buffer 사용시 String Tokenizer 활용하자

    //StringTokenizer st;
    //st = StringTokenizer(br.readLine()," ");
    //int N = Integer.parseInt(st.nextToken());

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        double count =0;
        int C = sc.nextInt(); //처음 몇번 시작하지

        for(int i = 0;i < C;i++){//그에 마춰 for 문 만들고
            int N = sc.nextInt();
            double [] arr = new double[N];// 저장해서
            for(int j =0; j< arr.length;j++){
                int box =sc.nextInt();
                         arr[j] = box;
                         sum +=box; //평균 만들 준비
            }
            double eat =(double)sum/N; //평균을 넣어두고
            for(int p=0;p<arr.length;p++){
                if(arr[p]>eat){ //만약 돌다가 평균보다 큰수가 나온다면 카운터 해서
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);// 평균보다 높은 학생수 /학생수 해서 *100 출력
            count= 0;
            sum =0;
        }


    }
}

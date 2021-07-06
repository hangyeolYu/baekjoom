package baek4673;

public class Test {//비겁하게 보고함 ㅠ 설명 적자
    public static void main(String[] args) {
        boolean [] check = new boolean[10001];
        for(int i =1;i<10001;i++){
                int n = d(i);
        //포문을 돌리면서 함수에 호출을해 0으로 반환하거나 반환하지않음!
                if(n<10001){
                    check[n] = true;//n 비교! 
        //우리는  0으로 나눠지는 수를 구하는게 아니므로 boolean 배열에 true를 넣어두자
                }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<10001;i++){
            if(!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int d(int number){
        int sum = number;
      //기본식은 d(75) = 75+7+5 = 87을 반환해야함! 우선
      //sum에다가 복사를 해놈!
        while(number !=0){
            sum +=number%10;
            //10에 자리를 더하고
            number = number/10;
            //10을 나눠 다시 %10 을해서 0이나올때까지 반복
            //num==0 이 되고 다더한 sum 값을 출력
        }
        return sum;
    }
}

package baek2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {//완료
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int max = -1;

        for(int i = 0; i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
      for(int i = 0; i< arr.length;i++){
          for(int j =i+1;j<=arr.length;j++){
              if(arr[i]>max){
                  max= arr[i] ;
              }
          }
          // 두와일을 써서 i j를 전부다 돌렸를때 살아있다면 그 아이와 arr[i] 값을 출룍하면될듯! 두와일 아니여도 다른걸 써보도록 하자 
      }
      int p;
      for(p =0 ;p <arr.length;p++){
          if (max == arr[p]){
              break;
          }
      }
        System.out.println(max);

        System.out.println(p+1);
    }
}

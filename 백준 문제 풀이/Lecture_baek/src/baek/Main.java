package baek;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,num1,num2,add = 0;
        int count = 0;
        String str = null;
        String str1= null;
        String str2 = null;
        String str3 = null;

        N =sc.nextInt();
        while(N <10){
            N *= 10;
        }
        System.out.println(N);

        while(true) {
            str = Integer.toString(N);
            char[] myChar = str.toCharArray();
            num1= Integer.parseInt(String.valueOf(myChar[0]));
            num2= Integer.parseInt(String.valueOf(myChar[1]));

               add = num1 + num2;
            count++;
            if(N==add){break;}
            else if (add<10){
               str1 = String.valueOf(num2);
               str2 = String.valueOf(add);
              N = Integer.parseInt(str1+str2);
               continue;
            }
            else if(add> 10){
                str1 = String.valueOf(num2);
                str2 = String.valueOf(add);
               char[]newChar = str2.toCharArray();
                str3 =String.valueOf(newChar[1]);
                N= Integer.parseInt(str1 + str3);
               continue;

            }

        }
        System.out.println(count);
    }
}

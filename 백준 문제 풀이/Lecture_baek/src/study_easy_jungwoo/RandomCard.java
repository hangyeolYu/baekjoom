package study_easy_jungwoo;

import java.util.ArrayList;

public class RandomCard {
    public static void main(String[] args) throws InterruptedException {
        int cartegori = (int)(Math.random()*4)+1;
        String random = null;

        ArrayList<String> arrayList = new ArrayList<>();
        String []cardnum = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        for(int i = 0;i< cardnum.length;i++){
             arrayList.add(cardnum[i]);
        }

            if (cartegori == 1) { random = "Club"; }
        else if (cartegori == 2) { random = "Diamonds"; }
        else if (cartegori == 3) { random = "Hearts"; }
        else random = "Spades";

       // double randomValue = Math.random();
        int ran = (int)(Math.random()*arrayList.size()-1);
        String getcard = arrayList.get(ran);


        System.out.printf("%s 의 %s \n",random,getcard);
        System.out.printf("%s 의 %s \n",random,getcard);
        System.out.printf("%s 의 %s \n",random,getcard);
        System.out.printf("%s 의 %s \n",random,getcard);
        System.out.printf("%s 의 %s \n",random,getcard);



    }
}

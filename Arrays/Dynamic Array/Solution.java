/*
 *------------------------
 * Author : Adonis Murati
 *------------------------
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastAnswer = 0;
        int nSequences = sc.nextInt();
        int nQueries = sc.nextInt();
        int value, x, y, index;
        
        ArrayList<Integer>[] seqList = new ArrayList[nSequences];
        
        while(nQueries --> 0){
            value = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            index = (x ^ lastAnswer) % nSequences;
        
            switch(value){
                case 1:
                    if(seqList[index] == null){
                        ArrayList<Integer> myList = new ArrayList<>();
                        myList.add(y);
                        seqList[index] = myList;
                    }else{
                        seqList[index].add(y);
                    }
                break;

                case 2:
                    lastAnswer = seqList[index].get(y % seqList[index].size());
                    System.out.println(lastAnswer);
                break;
            }
        }
        sc.close();
    }
}
//Author: Adonis Murati

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            int element = sc.nextInt();
            list.add(element);
        }
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++){
            String input = sc.next();
            if("Insert".equals(input)){
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            }
            else if("Delete".equals(input)){
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}

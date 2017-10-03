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
        int[][] elements = new int[6][6];
        int max = Integer.MIN_VALUE;
        int temp;
        
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                elements[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        
        for(int i=0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                temp = sumOfElements(elements, i, j);
                max = Math.max(temp, max);
            }
        }
        System.out.println(max);
    }
    
    private static int sumOfElements(int[][] arr, int row, int col){
        int sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                                  + arr[row+1][col+1]
                + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
        return sum;
    }
}
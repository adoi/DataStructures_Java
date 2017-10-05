/*
 *------------------------
 * Author : Adonis Murati
 *------------------------
*/

import java.util.*;

public class Solution {

    static int[] rotateNumbers(int[] elements, int d) {
        int nElements = elements.length;
        
        int[] temp = Arrays.copyOfRange(elements, 0, d);
        
        for(int i = d; i < nElements; i++){
            elements[i - d] = elements[i];
        }
        
        for(int i = nElements - d; i < nElements; i++){
            elements[i] = temp[i-nElements+d];
        }
        
        return elements;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int[] result = rotateNumbers(a, d);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }
}

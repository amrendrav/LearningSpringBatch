package AiseHi;

import java.util.HashMap;
import java.util.HashSet;

public class FindPairswithSum {

    public static void main(String[] args) {
        int[] arr = {1, 5, 23, 10, 43, -8, -12, 42, -12, 4, -8, 9};
        findPairsWithSum(arr , -20);
    }

    private static void findPairsWithSum(int[] arr, int sum) {

        HashSet<Integer> uniqueSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
          int temp = sum - arr[i];

          if(uniqueSet.contains(arr[i])){
              System.out.println("Pair with given sum " + sum + " is (" + temp +  ", " + arr[i] + ")");
          }
          uniqueSet.add(temp);
        }


    }
}

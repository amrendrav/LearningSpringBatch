package AiseHi;

import java.util.HashSet;

public class PairSum {

        static void printpairs(int arr[],int sum)
        {
            HashSet<Integer> s = new HashSet();
            for (int i=0; i<arr.length; ++i)
            {
                int temp = sum-arr[i];

                // checking for condition
                if (temp>=0 && s.contains(temp))
                {
                    System.out.println("Pair with given sum " +
                            sum + " is (" + arr[i] +
                            ", "+temp+")");
                }
                s.add(arr[i]);
            }
        }

        // Main to test the above function
        public static void main (String[] args)
        {
            int A[] = {1, 4, 45, 6, 10, 8, 8, 12, 7 ,9, 9, 7};
            int n = 16;
            printpairs(A,  n);
        }


}

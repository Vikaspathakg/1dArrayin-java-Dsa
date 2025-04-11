package arrays;
import java.util.*;
public class maxSubarraySum {
    public static void maxSubarraysum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                    currSum+=num[k];

                }
                System.out.print(currSum+" ");
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};

        maxSubarraysum(num);

    }
}

package arrays;

import java.util.Scanner;

public class largest {
    public static int largestArray(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];

            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {4,3,2,10,6};
        System.out.println("The largest number is "+largestArray(num));

    }
}

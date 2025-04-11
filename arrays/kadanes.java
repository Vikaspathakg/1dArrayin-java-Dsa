package arrays;
import java.util.*;
public class kadanes {
    public static void kadaneMaxsub(int num[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            curr = curr + num[i];
            if(curr<0){
                curr = 0;
            }
            max = Math.max(max,curr);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadaneMaxsub(num);

    }
}

package arrays;

import java.util.Scanner;

public class binarysearch {
    public static int binarySearch(int num[],int key){
        int n=num.length;
        int st=0,end=n-1;

        while(st<=end){
            int mid = (st+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]<key){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {12,30,45,90,35};
        int key = 35;
        int result = binarySearch(num,key);
        if(result==-1){
            System.out.println("Number not exist:");
        }else{
            System.out.println("Number at "+result);
        }
    }
}

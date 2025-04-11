package arrays;

import java.util.Scanner;

public class linearsearch {
    public static int linearSearch(int num[],int key){
        int n = num.length;
        for(int i=0;i<=n;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num[] = {10,20,30,40,50};
        int key = 50;
        int result = linearSearch(num,key);
        if(result==-1){
            System.out.println("number not exist");
        }else{
            System.out.println("nubmer at "+result);
        }

    }
}

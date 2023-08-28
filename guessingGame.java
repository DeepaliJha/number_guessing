

import java.util.*;

class guessingGame {
    /**
     * @param args
     */
    public static void main(String args[]){
        int arr[]={1,2,4,8,16};
        Scanner sc=new Scanner(System.in);
        int n=0,ans=0;
        int arr2[][]={{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31},
        {2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31},
        {4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31},
        {8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31},
        {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}};  
        for(int i=0;i<5;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
            System.out.println("press 1 if number is present 0 if number is  absent");
            n=sc.nextInt();
            if(n==1){
                ans+=arr[i];
            }
            System.out.println("your number was "+ans);
        } 
    }      
}








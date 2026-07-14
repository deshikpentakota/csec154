import java.io.*;
import java.util.*;
class median{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr=new int[n1];
        int[] arr1=new int[n2];
        int total=n1+n2;
        int[] arr2=new int[total];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<n2;i++){
            arr2[arr.length+i]=arr1[i];
        }
        Arrays.sort(arr2);
        if(total%2!=0){
            System.out.print(arr2[total/2]);
        }
        else{
            System.out.print((arr2[total/2-1]+arr2[total/2])/2.0);
        }
    }
}
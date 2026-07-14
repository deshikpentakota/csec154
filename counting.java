//counting sort
import java.io.*;
import java.util.*;
class counting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            maxi=Math.max(maxi,arr[i]);

        }
        int[] count=new int[maxi+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<maxi+1;i++){
            count[i]=count[i]+count[i-1];
        }
        int[] arr1=new int[n];
        for(int i=n-1;i>=0;i--){
            arr1[--count[arr[i]]]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }
}
import java.io.*;
import java.util.*;
class maxsubarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int msum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            msum+=arr[i];
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[i];
                msum=Math.max(msum,sum);
            }
        }
        System.out.print(msum);
        
        

        
    }
}
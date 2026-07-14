import java.io.*;
import java.util.*;
public class kadane{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int cs=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        cs=Math.max(arr[i],cs+arr[i]);
        maxsum=Math.max(maxsum,cs);
    }
    System.out.print(maxsum);
}
}
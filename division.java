import java.io.*;
import java.util.*;
public class division{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1<0){
            count++;
            n1=n1*-1;
        }
        if(n2<0){
            count++;
            n2=n2*-1;
        }
        float l=0,r=n1;
        float mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(mid*n2==n1){
                break;
            }
            else if(mid*n2<n1){
                l=mid;
            }
            else{
                r=mid;
            }

        }
        if(count==0 && count==2){
            System.out.print(mid);
        }
        else{
            float ans=mid*-1;
            System.out.print(ans);
        }
        

    }
}
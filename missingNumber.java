import java.util.*;
import java.util.Scanner;

class missingNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int v=a[0]-0;
        for(int i=0;i<n;i++)
        {
            if(v<(a[i]-i))
            {
                while((a[i]-i)!=v)
                {
                    System.out.print((v+i)+" ");
                    v++;
                } 
            }           
        }   
        
    }
}
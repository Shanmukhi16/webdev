import java.io.*;
import java.util.*;
class Binary
{
    public static void main(String args[])
    throws IOException
    {
        int i,j,n,key,l,h,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter key:");
        key=sc.nextInt();
        l=0;
        h=n-1;
        m=(1+h)/2;
        while(l<=h)
        {
            if(a[m]<key)
            {
                l=m+1;
            }
            else if(a[m]==key)
            {
                System.out.println("key found"+key+"at position"+m);
                break;
            }
            else
            {
                h=m-1;
            }
        }
        if(l>h)
          System.out.println("key not found");
    }
}

//prime or not
import java.util.Scanner;
class array20
  {
    public static void main(String args[])
    {
      int i,n,count=0,r,dup,j;
      System.out.println("enter the size of an array ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     int a[]=new int[n];
      for(i=0;i<n;i++)
        {
          System.out.println("enter the elements ");
          Scanner sc1=new Scanner(System.in);
          a[i]=sc1.nextInt();
        }
      for(i=0;i<n;i++)
        {
         dup=a[i];
          count=0;
          j=1;
         
            while(j<=dup)
              {
                if(dup%j==0)
                {
                  count++;
                }
                j++;
              }
          if(count==2)
          {
            System.out.println(a[i]);
          }
        }
    }
  }
//strong number
import java.util.Scanner;
class array22
  {
    public static void main(String args[])
    {
     int i,n,sum=0,fact,r,dup,j;
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
        
          sum=0;
          while(dup>0)
            {
              fact=1;
              r=dup%10;
              while(r>0)
                {
                  fact=fact*r;
                  r--;
                }
              sum=sum+fact;
              dup=dup/10;
            }
          if(sum==a[i])
          {
            System.out.println(a[i]);
          }
        }
    }
  }
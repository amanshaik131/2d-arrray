//print duplicate elements
import java.util.Scanner;
class array24
  {
    public static void main(String args[])
    {
      System.out.println("enter the number ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j;
      for(i=0;i<n;i++)
        {
          System.out.printf("enter the value of a[%d] ",i);
          Scanner sc1=new Scanner(System.in);
          a[i]=sc1.nextInt();
        }
      for(i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              {
                System.out.println("the duplicate elements "+ a[j]);
              }
            }
        }
      
    }
  }
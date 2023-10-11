import java.util.Scanner;
class array29
  {
    public static void main(String args[])
    {
      int sum=0;
      System.out.println("enter the number ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      int i,j;
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
          System.out.printf("enter the value of a[%d][%d] ",i,j);
          Scanner sc1=new Scanner(System.in);
          a[i][j]=sc1.nextInt();
            }
        }
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
              if(i>j)
              {
                sum=sum+a[i][j];
              }
              else
              {
                System.out.print(" 0 ");
              }
            }
          System.out.println();
        }
      System.out.println("the sum is "+sum);
    }
  }
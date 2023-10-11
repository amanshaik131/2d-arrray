import java.util.Scanner;
class array28
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
          System.out.printf("enter the value of a[%d] ",i);
          Scanner sc1=new Scanner(System.in);
          a[i][j]=sc1.nextInt();
            }
        }
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
              if(i<j)
              {
                sum=sum+a[i][j];
              }
          
            }
          System.out.println();
        }
      System.out.print("the sum is "+sum);
    }
  }
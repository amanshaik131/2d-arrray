import java.util.Scanner;
class array32
  {
    public static void main(String args[])
    {
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
            for(int k=i+j;k<n;k++)
              {
                if(a[i][j]==a[i][k])
                {
                  System.out.println(a[i][k]);
                }
              }
              System.out.println();
          }
          
        }
   
    }
  }
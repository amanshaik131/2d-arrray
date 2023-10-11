import java.util.Scanner;
class array32
  {
    public static void main(String args[])
    {
      System.out.println("enter the number ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      int b[][]=new int[n][n];
      int c[][]=new int[n][n];
      int i,j;
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
          System.out.printf("enter the value of a[%d][%d] ",i,j);
          Scanner sc1=new Scanner(System.in);
          a[i][j]=sc1.nextInt();
          System.out.printf("enter the value of b[%d][%d]",i,j);        
          b[i][j]=sc1.nextInt();
            }
        }
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {

              c[i][j]=a[i][j]+b[i][j];
          }
          
        }
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
              System.out.print(c[i][j]+ " ");
            }
          System.out.println();
        }
      
    }
  }
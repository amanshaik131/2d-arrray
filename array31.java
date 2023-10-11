import java.util.Scanner;
class array31
  {
    public static void main(String args[])
    {
      int found=1;
      System.out.println("enter the number ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      int b[][]=new int[n][n];
      int i,j;
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
          System.out.printf("enter the value of a[%d][%d] ",i,j);
          Scanner sc1=new Scanner(System.in);
          a[i][j]=sc1.nextInt();
          b[j][i]=a[i][j];
            }
        }
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
               if(a[i][j]!=b[i][j])
               {
                 found=0;
                 break;
               }
            }
          System.out.println();
        }
      if(found==1)
      {
        System.out.println("symmetric matrix ");
      }
    else
      {
      System.out.println("not symmetric matrix ");
    }  
    
   }
  }
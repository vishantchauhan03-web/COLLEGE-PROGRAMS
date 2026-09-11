import java.util.Scanner;

public class HHHH {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int[][] num= new int[2][2];
        int[][] num2= new int[2][2];
        System.out.println("enter element num");
        for(int i =0;i<2;i++){
            for(int  j= 0;j<2;j++){
                num[i][j]=sc.nextInt();
                
            }
            System.out.println();
        }
        System.out.println("enter element num2");
        for(int a =0;a<2;a++){
            for(int  b= 0;b<2;b++){
                num2[a][b]=sc.nextInt();
                
            }
            System.out.println();
        }
        int [][] sum=new int[2][2];
        for(int i =0;i<2;i++){
            for(int  j= 0;j<2;j++){
                sum[i][j]= num[i][j]+num2[i][j];
                System.out.print("sum is " ,sum[i][j] );
            }
            System.out.println();   
        }

    }
}
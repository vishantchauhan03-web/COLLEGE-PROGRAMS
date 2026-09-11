import java.util.Scanner;

public class multiplication {
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
        int [][] mul=new int[2][2];
        for(int i =0;i<2;i++){
            for(int  j= 0;j<2;j++){
                for(int k=0;k<2;k++){
                mul[i][j]= mul[i][j]+num[i][k]*num2[k][j];
                
            }System.out.print(mul[i][j]+"  ");
            }
            System.out.println();   
        }

    }
}
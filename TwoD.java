import java.util.Scanner;
class TwoD{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int[][] num= new int[2][2];
        System.out.println("enter element");
        for(int i =0;i<2;i++){
            for(int  j= 0;j<2;j++){
                num[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i =0;i<2;i++){
            for(int  j= 0;j<2;j++){
                System.out.print(num[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
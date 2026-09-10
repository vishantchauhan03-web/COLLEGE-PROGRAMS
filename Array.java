import java.util.Scanner;

class Array{
    public static void main(String arge[]){
        int n=4;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the element");
         int[] num= new int[n];
         for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
         } for (int j=0;j<num.length;j++)
         System.out.print(num[j]);
    }
}
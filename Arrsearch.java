import java.util.Scanner;

class Arrsearch{
    public static void main(String arge[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number");
        int target= sc.nextInt();
        boolean found=false;
        
        int[] num={1,2,4,35,4,5,3,24,3,23,};
       
        for(int i=0;i<num.length;i++){
            if (target==num[i]){
                System.out.println("element found on index : " + i);
                found=true;

            }} 
            if(found==false){
                System.out.println("element not found");
                
            
        }
        

    }
}
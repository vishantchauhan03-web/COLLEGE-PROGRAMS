class calculate {
    //public int add(int a,int b){
      //  return a+b;
        public String getMePen(int cost){

            if(cost>10){
                return "PEN";
            }
            else{
                return "NOT PEN";
            }
        }
    }

public class function {
    public static void main(String[] args) {
       //int num1=7;
      // int num2=5;

       //calculate calc=new calculate();
       //int sum=calc.add(num1,num2);
       //System.out.println(sum);
       calculate obj= new calculate();
       String str=obj.getMePen(19);
       System.out.println(str);


       
    }
}
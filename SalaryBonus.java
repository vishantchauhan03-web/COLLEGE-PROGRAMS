import java.util.Scanner;
class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your 1st salary: ");
        double salary1= sc.nextDouble();
        System.out.println("Enter your work experience: ");
        int experience= sc.nextInt();
        if(experience>3){
            for(int year=4; year<=experience; year++){
                salary1=salary1+(salary1*0.03);
                System.out.println("Salary after "+year+" year is: "+salary1);
            }
        }else{
            System.out.println("no bonus for you");

        }
        System.out.println("Your final salary is: "+salary1);
        sc.close();
    }
}
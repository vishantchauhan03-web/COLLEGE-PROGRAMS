class Digitreverse{
    public static void main(String arr[]){
        int i=123456;
        int reverse=0;
        while(i>0){
            reverse= reverse*10 +(i%10);
            i=i/10;

        }System.out.println(reverse);
    }
}
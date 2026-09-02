class Clock {
    public static void main(String arr[]) {

        int a = 0;

        while (a < 24) {

            int b = 1;

            while (b <= 59) {

                System.out.println(a + ":" + b);

                b++;
            }

            a++;
        }
    }
}
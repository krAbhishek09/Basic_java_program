
public class Occ {

    public static void main(String[] args) {

        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter the no");
        //   int n =sc.nextInt();
        //   for(int i =0; i < n; i++) {
        //   }
        int n = 2346;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;

        }
        System.out.println(count);
    }

}

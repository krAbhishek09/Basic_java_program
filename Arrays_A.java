
public class Arrays_A {

    public static void main(String[] args) {

        // int age[];
        // age = new int[5];
        int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(marks[4]);

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("sum = " + sum);
        int min=Integer.MAX_VALUE;
        // for (int i = 0; i < arr.length; i++) {

        //     if (i < min) {
        //         min = i;
                
        //     }
        // }
        for(int num:arr)
        {
            if (min < num)
            {
                min = num;
            }
        }
        System.out.println(min);

        // String name[] = {"Random", "Arrays", "Arrays", "Arrays", "Arrays"};
        // for (int i = 0; i < name.length; i++) {
        //     System.out.println("name is  " + name[0]);
        // }
    }
}

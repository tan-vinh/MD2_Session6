package bt.bai5;

import java.util.Scanner;

public class Test extends ArrayCaculator {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter an integer"+ (i+1) +": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr));
    }

}

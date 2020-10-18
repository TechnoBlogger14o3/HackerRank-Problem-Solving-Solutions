import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int negative = 0;
        int zero = 0;
        int positive = 0;
        int len = arr.length;
        for (int i=0; i<len; i++) {
            if (arr[i] < 0) negative++;
            if (arr[i] == 0) zero++;
            if (arr[i] > 0) positive++;
        }
        
        System.out.println(String.format("%.8f", (float) positive/len));
        System.out.println(String.format("%.8f", (float) negative/len));
        System.out.println(String.format("%.8f", (float) zero/len));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

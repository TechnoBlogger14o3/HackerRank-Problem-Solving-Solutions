//Contributed by Navtika Kumar
import java.io.*;
import java.util.*;

public class LargestRectangle {

    // Complete the largestRectangle function below.
    static int largestRectangle(int[] h) {
        Stack<Integer> s = new Stack<>(); 
          
        int max_area = 0; 
        int tp; 
        int area_with_top; 
        int n = h.length; 
       
        int i = 0; 
        while (i < n) 
        { 
            if (s.empty() || h[s.peek()] <= h[i]) 
                s.push(i++); 
       
            else
            { 
                tp = s.peek();  
                s.pop(); 
       
                area_with_top = h[tp] * (s.empty() ? i : i - s.peek() - 1); 
       
                if (max_area < area_with_top) 
                    max_area = area_with_top; 
            } 
        } 
       
        while (s.empty() == false) 
        { 
            tp = s.peek(); 
            s.pop(); 
            area_with_top = h[tp] * (s.empty() ? i : i - s.peek() - 1); 
       
            if (max_area < area_with_top) 
                max_area = area_with_top; 
        } 
       
        return max_area;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        int result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

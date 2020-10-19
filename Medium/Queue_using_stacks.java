import java.util.*;
public class Queue_using_stacks {

    static int queries;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        queries = scan.nextInt();
        Stack s = new Stack();
        Stack q = new Stack();
        while(queries-->0)
        {
            int n = scan.nextInt();
            if(n == 1)
                s.push(scan.nextInt());
            else
            {  if(q.isEmpty()) 
                {
                    while(!s.isEmpty())
                    q.push(s.pop());
                }
                if(n == 2)
                    q.pop();
                else if(n == 3)
                    System.out.println(q.print());
            }
        }
        
    }
    
     static class Stack{
        
        long[] arr = new long[queries];
        int top = -1;
        void push(long x){
            arr[++top] = x;
        }
        boolean isEmpty(){
            if(top == -1)
                return true;
            else
                return false;
        }
        long pop(){
            if(isEmpty())
            {
                return -1;
            }
            else
            {
                return arr[top--];
            }
        }
        long print(){
            if(isEmpty())
            {
                return -1;
            }
            else
                return arr[top];
        }
        long length(){
            return arr.length;
        }
    }  
    
}

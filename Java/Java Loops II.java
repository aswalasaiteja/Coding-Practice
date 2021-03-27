import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- != 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int res = a+b;
        System.out.print(res+" ");
        
        for(int i = 0;i<n-1;i++){
        res = res + (int)(Math.pow(2,(i+1)))*b;
        System.out.print(res+" ");
        }
        
        
        System.out.println();
        }
        in.close();
                

        
    }
}
package javaLoopsTwo;

import java.util.Scanner;

public class Main {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int result = 0;
	            
	            for(int j=0;j<n;j++){
	            	
	                result = a + b*((int)Math.pow(2, j+1)-1);
	                System.out.print(result + " ");
	            }
	            
	            System.out.print("\n");
	          }
	        in.close();
	    }
}

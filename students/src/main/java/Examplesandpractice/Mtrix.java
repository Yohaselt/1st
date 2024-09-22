package Examplesandpractice;

import java.util.Scanner;

public class Mtrix {
	

	public static void main(String[] args) {
		
	
int[][]matrix=new int[3][3];
Scanner scanner= new Scanner(System.in);
System.out.println("enter the element of the 3*3matrix=");
for (int i=0; i<3; i++) {
	for( int j=0; j<3;j++) {
		matrix[i][j]=scanner.nextInt();
	}
}

int sum =0;
for(int i =0; i<3; i++) {
	sum+=matrix[i][i];
}
System.out.println("the sum of the principal diagonal element is="+sum);
	}

}
	/*syntax for xpath
	 //tagname[@attributte='attribute value']
	 //img[@title='your Store']   OR
	 
	 //*[@attribute='value']
	  //*[@title='your Store']
	  */
	 



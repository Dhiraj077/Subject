package sorting;

import java.util.Scanner;

public class GoldenRectangle {
	
	public static void main (String args[])throws Exception{
		System.out.println("Enter the No. of Rectangles :");
		Scanner sc = new Scanner(System.in); 
		int noofRectangles = sc.nextInt();
		int count = 0; // it will count the no. of golden Rectangles.
		for (int t=0; t < noofRectangles; t++ ) {
			
			System.out.println("Enter the Dimension of Rectangles" + (t+1));
			double width = sc.nextInt();
			double height = sc.nextInt();
			double ratio;
			
			if(width > height) {
				ratio = width / height;
				if (ratio>=1.68 && ratio <=1.7)
					count++;
			}
			else
			{
				ratio = height/width;
				if (ratio>=1.6 && ratio <=1.7)
					count++;
			}
		}
		System.out.println("Total No. of Golden Rectangles are :" + count);
		sc.close();
	}
	 
}

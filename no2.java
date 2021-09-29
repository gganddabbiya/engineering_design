package no2;

import java.util.Scanner;

public class no2 {
	public static void main(String[] args) {
		
		for (int i = 0; i<3; i++) {
			int x1,x2,y1,y2;
			Scanner sc = new Scanner(System.in);
	
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			if((x1>=100&&x1<=200&&y1>=100&&y1<=200)&&(x2>=100&&x2<=200&&y2>=100&&y2<=200))
				System.out.println("포함 : O | 겹침 : O");
			
			else if(x1>=100&&x1<=200&&y1>=100&&y1<=200)
				System.out.println("포함 : X | 겹침 : O");	

			else if(x2>=100&&x2<=200&&y2>=100&&y2<=200)
				System.out.println("포함 : X | 겹침 : O");
			
			else
				System.out.println("포함 : X | 겹침 : X");

			}
		}

}
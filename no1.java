package no1;

import java.util.Scanner;

public class no1 {
	public static void main(String[] args) {
		for (int i = 0; i<3; i++) {
			int i1,i2,i3;
			Scanner sin = new Scanner(System.in);
			i1 = sin.nextInt();
			i2 = sin.nextInt();
			i3 = sin.nextInt();
			if((i1+i2<i3)||(i1+i3)<i2||(i2+i3)<i1)
				System.out.println("삼각형을 만들 수 없습니다.");
			else if((i1==i2)&(i2==i3))
				System.out.println("정삼각형입니다");
			else if((i1==i2)||(i2==i3)||(i1==i3))
				System.out.println("이등변삼각형입니다");
			else if((i1*i1+i2*i2==i3*i3)||(i2*i2+i3*i3==i1*i1)||(i3*i3+i1*i1==i2*i2))
				System.out.println("직각삼각형입니다");
			else System.out.println("삼각형을 만들 수 있습니다.");
			
		}
	}

}

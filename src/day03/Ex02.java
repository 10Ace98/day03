package day03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		int num;
		System.out.println("?? ?Է? >>>");
		num=input.nextInt();
		
		if(num>100) {
			System.out.println("100???? ????");
		}else if(num >70) {
			System.out.println("70???? ????");
		}else if(num>40) {
			System.out.println("40???? ????");
		}else {
			System.out.println("?? ???? ??");
		}
			
		
		
	}
	
	
}





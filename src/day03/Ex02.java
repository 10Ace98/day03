package day03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		int num;
		System.out.println("수 입력 >>>");
		num=input.nextInt();
		
		if(num>100) {
			System.out.println("100보다 쿠다");
		}else if(num >70) {
			System.out.println("70보다 쿠다");
		}else if(num>40) {
			System.out.println("40보다 쿠다");
		}else {
			System.out.println("그 외의 값");
		}
			
		
		
	}
	
	
}





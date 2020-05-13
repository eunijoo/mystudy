package baekjoon_0504;

import java.util.Scanner;

public class if_1330_Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a,b;
		System.out.println("두 정수 입력?");
		a= sc.nextInt();
		b= sc.nextInt();
		
		if(a<b) {
			System.out.println("<");
		}else if(a>b) {
			System.out.println(">");
		}else {
			System.out.println("=");
		}
	}
}

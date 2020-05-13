package baekjoon_0504;

import java.util.Scanner;

public class for_2439_Ex6 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,star;
		
		System.out.println("수 입력");
		a=sc.nextInt();
		
		for(star=0;star<a;star++) {
			for(int b=0;b<a;b++) {
			
				System.out.print("&");
				
			}
			System.out.println("*");
		}
	}
}


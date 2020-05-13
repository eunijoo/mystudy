package baekjoon_0504;

import java.util.Scanner;

public class if_9498_Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int jum;
		System.out.println("점수입력");
		jum=sc.nextInt();
		if(jum>=90) {
			System.out.println("A");
		}else if(jum>=80&&jum<90) {
			System.out.println("B");
		
		}else if(jum>=70&&jum<80) {
			System.out.println("C");
		}else if(jum>=60&&jum<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}

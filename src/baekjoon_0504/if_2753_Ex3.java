package baekjoon_0504;

import java.util.Scanner;

public class if_2753_Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year;
		
		System.out.println("년도입력?");
		year=sc.nextInt();
		if(year<1&&year>4000) {
			System.out.println("년도 다시 입력해주세요");
			year=sc.nextInt();
		}
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("윤년이다.");
		}else {
		System.out.println("윤년이 아니다.");
		}
	}

}

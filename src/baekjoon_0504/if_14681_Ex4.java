package baekjoon_0504;

import java.util.Scanner;

public class if_14681_Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("좌표입력하세요.");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0&&x<=1000||y>0&&y<=1000) {
			System.out.println("1");
		}else if(x<0&&y>0&&y<=1000) {
			System.out.println("2");
		}else if(x<0&&y<0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
	}
}

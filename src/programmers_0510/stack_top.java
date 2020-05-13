package programmers_0510;

import java.util.Stack;

public class stack_top {
	public static void main(String[] args) {
		int[] heights={6,9,5,7,4};
		Solution s=new Solution();
		s.solution(heights);
		
		for(int i:s.solution(heights)) {
		System.out.println(i);
		}
	}

}
class Solution {
	public int[] solution(int[] heights) {
		Stack<Integer> st = new Stack<Integer>();
		int[] answer = new int[heights.length];
		int i, j;
		
		for (i = heights.length-1; i >= 0; i--) {
			for (j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					st.push(j+1);
					break;
				}
			}if(j==-1) {
				st.push(0);
			}
		}
		for(int k=0;k<heights.length;k++) {  //스택에 저장해줌.(answer)
			answer[k]=st.pop();		
		}
		
		
		return answer;
	}
}

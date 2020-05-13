package programmers_0510;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class stack_top2 {
   public static void main(String[] args) {
      int heights[] = {1,5,3,6,7,6,5};  //[0,0,2,0,0,5,6]
      StackSolution ss = new StackSolution();
      ss.solution(heights);

   }
}

class StackSolution{
   public int[] solution(int[] heights) {
      List<Integer> list = new ArrayList<Integer>();
      Stack<Integer> stack=new Stack<Integer>();
      int[] answer = new int[heights.length];
      for (int s : heights) {
         stack.push(s);
      }
 
      int top, j;
      int annum = heights.length-1;
      for(int i=0; i<heights.length; i++) {
         top = stack.pop();
         for(j=0; j<stack.size()+list.size(); j++) {
            if(stack.peek()>top) {
               answer[annum] = stack.size();
               break;
            } else { 
               list.add(stack.pop());
            }
         }
         
         for(int k=list.size()-1; k>=0; k--) {
            stack.push(list.get(k));
         }
         annum--;
         list.clear();
      }
      for(int s: answer) {
         System.out.println(s);
      }
      return answer;
   }
}
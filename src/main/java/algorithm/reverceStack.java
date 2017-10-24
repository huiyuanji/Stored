package algorithm;

import java.util.Stack;

/**
 * 逆序实现栈
 * Created by Administrator on 2017/10/24.
 */
public class reverceStack {
    public int getAndRemovetheLastValue(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int lastValue = getAndRemovetheLastValue(stack);
            stack.push(result);
            return lastValue;
        }


    }

    public void revese(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemovetheLastValue(stack);
        revese(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0;i<8;i++){
            stack.push(i);
        }

        reverceStack reverceStack = new reverceStack();
        reverceStack.revese(stack);


       for (int i=0;i<8;i++){
           System.out.println(stack.pop());
       }


    }
}

package algorithm;

import java.util.Stack;

/**
 * 实现栈的pop push 以及最小栈元素的输出
 * date :2017-10-23
 */
public class stack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public stack() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int value) {
        stackData.push(value);
        if (!stackMin.isEmpty()) {
            if (value <= this.getMin()) {
                stackMin.push(value);
            } else {
                new RuntimeException(value + " is not the min value").printStackTrace();
            }
        } else {
            stackMin.push(value);
        }
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("stackData is empty");
        }
        int stackDatavalue = stackData.pop();


        if (!stackMin.isEmpty()) {
            if (stackDatavalue == this.getMin()) {
                stackMin.pop();
            }
        } else {
            throw new RuntimeException("stackMin is empty");
        }

        return stackDatavalue;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stackMin is empty");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        stack stack = new stack();
        for (int i = 5; i >= 0; i--) {
            stack.push(i);
        }
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
    }
}

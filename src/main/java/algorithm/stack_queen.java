package algorithm;

import java.util.Stack;

/**
 * 栈实现队
 * date :2017-10-23
 */
public class stack_queen {
    private Stack<Integer> stackpush;
    private Stack<Integer> stackpop;

    public stack_queen() {
        stackpush = new Stack<Integer>();
        stackpop = new Stack<Integer>();
    }

    public void add(int newValue) {
        stackpush.push(newValue);
    }

    public Integer poll() {
        if (stackpush.isEmpty() && stackpop.isEmpty()) {
            new RuntimeException("queue id empty").printStackTrace();
        } else if (stackpop.isEmpty()) {
            while (!stackpush.isEmpty()) {
                stackpop.push(stackpush.pop());
            }
        }
        return stackpop.pop();
    }

    public int peek() {
        if (stackpush.isEmpty() && stackpop.isEmpty()) {
            new RuntimeException("queue id empty").printStackTrace();
        } else if (stackpop.isEmpty()) {
            while (!stackpush.isEmpty()) {
                stackpop.push(stackpush.pop());
            }
        }
        return stackpop.peek();
    }
}

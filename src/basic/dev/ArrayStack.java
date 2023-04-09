package basic.dev;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStack {
	    private int maxSize; // kích thước tối đa của mảng
	    private int[] stackArray; // mảng lưu trữ các phần tử của stack
	    private int top; // chỉ số của phần tử đầu tiên của stack

	    // Constructor
	    public ArrayStack(int maxSize) {
	        this.maxSize = maxSize;
	        stackArray = new int[maxSize];
	        top = -1;
	    }

	    // Phương thức đẩy phần tử vào stack
	    public void push(int element) {
	        if (isFull()) {
	            throw new RuntimeException("Stack is full");
	        }
	        top++;
	        stackArray[top] = element;
	    }

	    // Phương thức lấy phần tử khỏi stack
	    public int pop() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        int element = stackArray[top];
	        top--;
	        return element;
	    }

	    // Phương thức kiểm tra stack có rỗng hay không
	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    // Phương thức kiểm tra stack có đầy hay không
	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }

		@Override
		public String toString() {
			return "ArrayStack [stackArray=" + Arrays.toString(stackArray) + "]";
		}
	    
	}


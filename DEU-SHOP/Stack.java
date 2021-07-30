
public class Stack {
	private int top;
	private Object[] elements;

	Stack(int capacity) {
		elements = new Object[capacity];
		top = -1;
	}

	boolean isFull() {
		return (top + 1 == elements.length);
	}

	boolean isEmpty() {
		return (top == -1);
	}

	int size() {
		return top + 1;
	}

	Object peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else
			return elements[top];
	}

	void push(Object data) {
		if (isFull())
			System.out.println("Stack Overflow");
		else {
			top++;
			elements[top] = data;
		}
	}

	Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else {
			Object retData = elements[top];
			top--;
			return retData;
		}
	}

	Object remove(Object data) {

		int size = size();
		Stack temp = new Stack(size);
		boolean flag=false;
		Object O = null;
		
		for(int i=0;i<size;i++) {
			if(peek()==data) {
				O=pop();
				flag=true;
			}
			if(!flag)
			temp.push(pop());
		}
		
		if(flag)
			size=size-1;
		
		for(int i=0;i<size;i++) {
			push(temp.pop());
		}

		return O;

	}
}

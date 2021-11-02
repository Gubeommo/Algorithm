package Stack;
import java.util.*;


public class StackList1 implements Stacks{
	
	private int top;
	private int stackSize;
	private char stackArr[];
	
	public StackList1(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		stackArr = new char[this.stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		
		return ( top == -1);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return ( top == this.stackSize-1 );
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Stack is full");
		} else {
			stackArr[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Deleting fail ! Stack is empty !");
			return 0;
		} else {
			System.out.println("Deleted Item : " + stackArr[top]);
			return stackArr[top--];
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Peeking fail ! Stack is empty !");
			return 0;
		} else {
			System.out.println("Peeked Item : " + stackArr[top]);
			return stackArr[top];
		}
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Stack is already empty !");
		} else {
			top = -1;
			stackArr = new char[this.stackSize];
			System.out.println("Stack is clear !");
		}
		
	}
	
	public static boolean isTrue(int num) {
		if (num >10 || num <1) {
			System.out.println("number is over !");
			return false;
		}else {
			return true;
		}
	
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println(Arrays.toString(stackArr));
		}
	}

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int stackSize = 5;
		StackList1 arrStack = new StackList1(stackSize);
		
		
			
			arrStack.push('A');
		    arrStack.printStack();
		        
		    arrStack.push('B');
		    arrStack.printStack();
		        
		    arrStack.push('C');
		    arrStack.printStack();
		        
		    arrStack.pop();
		    arrStack.printStack();
		        
		    arrStack.pop();
		    arrStack.printStack();
		        
		    arrStack.peek();
		    arrStack.printStack();
		        
		    arrStack.clear();
		    arrStack.printStack();


		
			
		}
		
		
		

	}


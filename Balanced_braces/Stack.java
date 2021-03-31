package core;

import java.util.LinkedList;

public class Stack<X> {

	LinkedList<X> stack = new LinkedList<X>();
	
	public void push(X value){
		stack.add(value);
	}
	
	public X pop(){
		X value = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return value;
	}
	
	public X peek(){
		return stack.get(stack.size()-1);
	}

	public boolean isEmpty(){
		return (stack.size()==0);
	}
	
	public void clear(){
		stack.clear();
	}
	
}

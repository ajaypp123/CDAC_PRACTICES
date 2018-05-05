package stkpkg;

import java.util.Arrays;

import emppkg.Emp;

public class FixedStack implements MyStack{
	private int top;
	private Emp[] emps;
	
	public FixedStack() {
		top = -1;
		emps = new Emp[STACK_SIZE];
	}
	
	@Override
	public String toString() {
		return " emps=" + Arrays.toString(emps) ;
	}

	@Override
	public Emp pop() {
		if(top > 0){
			top--;
			return emps[top+1];
		}else{
			System.out.println("Stack is Empty");
		}
		return null;
	}
	
	@Override
	public void push(Emp e) {
		if(top < (STACK_SIZE-1)){
			top++;
			emps[top] = e;
			//System.out.println(top);
		}else{
			System.out.println("Stack is Full");
		}
	}
	
}

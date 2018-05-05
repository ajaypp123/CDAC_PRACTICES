package stkpkg;

import emppkg.Emp;

public interface MyStack {
	int STACK_SIZE =3;
	
	void push(Emp e);
	Emp pop();
}

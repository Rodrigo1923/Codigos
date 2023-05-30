package PilaEstatica;

import java.util.Stack;

public class PilaB<T> implements PilaTDA<T>{

	private Stack<T> pila;
	
	public PilaB() {
		pila=new Stack<T>();
	}
	
	@Override
	public boolean isEmpty() {
		return (pila.empty());
	}

	@Override
	public T pop() {
		T dato;
		dato=(T)pila.peek();
		pila.pop();
		return dato;
	}

	@Override
	public void push(T dato) {
		pila.push(dato);
	}

	@Override
	public T peek() {
		return (T)(pila.peek());
	}

	@Override
	public void freePila() {
		pila.clear();
	}

	public int Size() {
		return pila.size();
	}
	
	public String toString() {
		return toString(Size()-1);
	}
	private String toString(int i) {
		return (i>=0)?"tope==>"+i+"["+pila.get(i)+"]\n"+toString(i-1):"";
	}
	
}

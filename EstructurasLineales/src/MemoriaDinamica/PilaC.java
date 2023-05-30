package MemoriaDinamica;

import java.util.ArrayList;

import PilaEstatica.PilaTDA;

public class PilaC<T> implements PilaTDA<T>{

	private ArrayList pila;
	
	int tope=-1;
	
	public PilaC() {
		pila = new ArrayList();
		int tope;
	}
	
	public int Size() {
		return pila.size();
	}

	@Override
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	
	public void vaciar() {
		pila.clear();
	}

	@Override
	public void push(T dato) {
		pila.add(dato);
		tope++;
	}

	@Override
	public T pop() {
		T dato=(T)pila.get(tope);
		pila.remove(tope);
		tope--;
		return dato;
	}
	
	@Override
	public T peek() {
		return (T)pila.get(tope);
	}

	public String toString() {
		return toString(tope);
	}
	
	public String toString(int i) {
		return (i>=0)?"tope ===>"+i+"["+pila.get(i)+"]\n"+toString(i-1):"";
	}
	
	@Override
	public void freePila() {
		// TODO Auto-generated method stub
		
	}
	
}

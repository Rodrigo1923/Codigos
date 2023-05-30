package PilaEstatica;
	
public interface PilaTDA<T>{
	
	public boolean isEmpty();
	
	public T pop();
	
	public void push(T dato);
	
	public T peek();
	
	public void freePila();
	
}

package EstructurasColas;

public interface ColaTDA <T>{

	public boolean isEmptyCola();
	
	public void pushCola(T Dato);
	
	public T popCola();
	
	public T peekCola();
	
	public void freeCola();
	
}

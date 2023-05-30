package Operaciones;

import MemoriaDinamica.Nodo;

public interface OperaTDA<T> {

	public void insertarFrente(T dato);
	
	public void insertarFinal(T dato);
	
	public boolean isListaVacia();
	
	public Nodo buscarLista(T dato);
	
	public void Eliminar(Nodo dato);
	
	public void Modificar(Nodo dato);
	
	public String mostrarLista();
	
}

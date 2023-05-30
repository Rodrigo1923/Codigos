package Operaciones;

import MemoriaDinamica.Nodo;

public class Ordenado<T> implements OperaTDA<T>{

	private Nodo inicio;
	private Nodo f;
	
	@Override
	public void insertarFrente(T dato) {
		
	}

	@Override
	public void insertarFinal(T dato) {
		
	}

	@Override
	public boolean isListaVacia() {
		return (inicio==null);
	}

	@Override
	public Nodo buscarLista(T dato) {
		Nodo i=inicio;
		while(i!=null && dato!=i.getInfo()) {
			i=i.getSig();
		}
		return (i!=null)? (Nodo)i:null;
	}
	
	public Nodo buscarAnterior(Nodo dato) {
		Nodo i=inicio;
		if(dato!=inicio) {
			while(dato!=i.getSig() && i.getSig()!=null) {
				i=i.getSig();
			}
		}else {
			i=null;
		}
		return (Nodo) i;
	}

	@Override
	public void Eliminar(Nodo dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Modificar(Nodo dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrarLista() {
		// TODO Auto-generated method stub
		return null;
	}

}

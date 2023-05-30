package Operaciones;

import MemoriaDinamica.Nodo;
import Tools.ToolsPanel;

public class Desordenado<T> implements OperaTDA<T> {

	private Nodo inicio;
	private Nodo f;
	
	@Override
	public void insertarFrente(T dato) {
		Nodo u = new Nodo(dato);
		if(isListaVacia()) {
			inicio=u;
		}else {
			u.sig=inicio;
			inicio=u;
		}
	}

	@Override
	public void insertarFinal(T dato) {
		Nodo u = new Nodo(dato);
		if(isListaVacia()) {
			inicio = u;
		}else {
			f.sig=u;
		}
		f=u;
	}

	@Override
	public boolean isListaVacia() {
		return (inicio== null);
	}

	@Override
	public Nodo buscarLista(T dato) {
		Nodo i=inicio;
		while(i!=null && dato!=i.getInfo()) {
			i=i.getSig();
		}
		return (i!=null)? (Nodo)i:null;
	}

	@Override
	public void Eliminar(Nodo existe) {
		if(existe==inicio) {
			inicio=inicio.sig;
			existe=null;
		}else {
			Nodo antes=buscarAnterior(existe);
			if(existe==f) {
				f=antes;
				f.sig=null;
				existe=null;
			}else {
				antes.sig=existe.sig;
				existe=null;
			}
		}
	}
	
	@Override
	public String mostrarLista() {
		String cad="";
		Nodo i=inicio;
		while(i!=null) {
			cad+=i.getInfo()+"--->\n";
			i=i.getSig();
		}
		return cad;
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
	
	public void Modificar(Nodo dato) {
		dato.setInfo(ToolsPanel.leerInt("A que numero lo quieres modificar"));
	}

}

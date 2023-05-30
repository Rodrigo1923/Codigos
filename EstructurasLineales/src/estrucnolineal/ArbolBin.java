package estrucnolineal;

import DobleLiga.Nodito;

public class ArbolBin<T>{

	private Nodito raiz;
	
	public ArbolBin() {
		raiz=null;
	}
	
	public Nodito getRaiz() {
		return raiz;
	}
	
	public void setRaiz(Nodito raiz) {
		this.raiz=raiz;
	}
	
	public boolean arbolVacio() {
		return (raiz==null);
	}
	
	public void vaciarArbol() {
		raiz=null;
	}
	
	public void insertarArbol(T info) {
		
		Nodito p = new Nodito(info);
		
		if(arbolVacio()) {
			raiz=p;
		}else {
			Nodito padre = buscarPadre(raiz, p);
			
			if((int)p.info>=(int)padre.info)
				padre.der=p;
			else {
				padre.izq=p;
			}
		}
		
	}
	
	public Nodito buscarPadre(Nodito actual, Nodito p) {
		Nodito padre = null;
		while(actual!=null) {
			padre = actual;
			if((int)p.info>=(int)padre.info) {
				actual = padre.der;
			}else {
				actual = padre.izq;
			}
		}
		return padre;
	}
	
	public String preorden(Nodito r) {
		if(r!=null) {
			return r.getInfo()+" - "+preorden(r.getIzq())+" - "+preorden(r.getDer());
		}
		else return "";
	}
	
	public String inorden(Nodito r) {
		if(r!=null) {
			return inorden(r.getIzq())+" - "+r.getInfo()+" - "+inorden(r.getDer());
		}
		else return "";
	}
	
	public String inorden2(Nodito r) {
		if(r!=null) {
			return inorden2(r.getDer())+" - "+r.getInfo()+" - "+inorden2(r.getIzq());
		}
		else return "";
	}
	
	public String posorden(Nodito r) {
		if(r!=null) {
			return posorden(r.getIzq())+" - "+posorden(r.getDer())+" - "+r.getInfo();
		}
		else return "";
	}
	
	public Nodito buscarDato(Nodito r, T dato) {
		while(r!=null) {
			if(r.getInfo()==dato) {
				return r;
			}else {
				if((int)dato<(int)r.getInfo()) {
					r=r.getIzq();
				}else {
					r=r.getDer();
				}
			}
		}
		return r;
	}
	
	public static void graficarArbol(Nodito nodo, int nivel) {
		if (nodo != null) {
            graficarArbol(nodo.der, nivel + 1);
            System.out.println("   ".repeat(nivel) + nodo.info);
            graficarArbol(nodo.izq, nivel + 1);
		}
	
	}
}

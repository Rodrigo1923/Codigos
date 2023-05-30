package EstructurasColas;

import MemoriaDinamica.Nodo;

public class ColaD<T> implements ColaTDA<T>{

	private Nodo cola;
	private Nodo f;
	
	public ColaD() {
		cola = null;
	}
	
	@Override
	public boolean isEmptyCola() {
		return (cola==null);
	}

	@Override
	public void pushCola(T Dato) {
		Nodo u=new Nodo(Dato);
		if(isEmptyCola()) {
			cola=u;
		}else {
			f.sig = u;
		}
		f=u;
	}

	@Override
	public T popCola() {
		Nodo u= cola;
		T dato=(T) cola.getInfo();
		cola=cola.getSig();
		u=null;
		return dato;
	}

	@Override
	public T peekCola() {
		return (T)(cola.getInfo());
	}

	@Override
	public void freeCola() {
		cola=null;
		f=null;
	}

	public String toString() {
		Nodo u=cola;
		return toString(u);
	}
	
	public String toString(Nodo i) {
		return (i!=null)?"tope==>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
	}
	
}

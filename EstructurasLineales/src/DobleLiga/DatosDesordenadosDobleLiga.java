package DobleLiga;

import MemoriaDinamica.Nodo;
import Operaciones.OperaTDA;
import Tools.ToolsPanel;

public class DatosDesordenadosDobleLiga<T> implements OperaTDA<T>{

	private Nodito puntero;
	private Nodito f;
	
	public DatosDesordenadosDobleLiga() {
		puntero = null;
	}

	@Override
	public void insertarFrente(T dato) {
		Nodito p = new Nodito(dato);
		if(isListaVacia()) {
			puntero=p;
			f=p;
		}else {
			p.der=puntero;
			puntero.izq=p;
			puntero=p;
		}
	}

	@Override
	public void insertarFinal(T dato) {
			Nodito p= new Nodito(dato);
			if(isListaVacia()) {
				puntero=p;
			}else {
				f.der=p;
				p.izq=f;
			}
			f=p;
	}

	@Override
	public boolean isListaVacia() {
		return (puntero==null);
	}

	public Nodito buscarListas(T dato) {
		Nodito b=puntero;
		while(b!=null&&!(dato.equals((Object)b.getInfo())))
			b=b.getDer();
		return (b);
	}

	public void Eliminar(Nodito dato) {
		if(dato==puntero) {
			puntero=puntero.der;
			puntero.izq=null;
			dato=null;
		}else {
			if(dato==f) {
				f=f.izq;
				f.der=null;
				dato=null;
			}else {
				dato.der.izq=dato.izq;
				dato.izq.der=dato.der;
				dato=null;
			}
		}
		
	}

	public void Modificar(Nodito dato) {
		dato.info=ToolsPanel.leerString("A que dato lo deseas cambiar");
	}

	@Override
	public String mostrarLista() {
		String cad="";
		
		for(Nodito j=puntero; j!=null; j=j.der) {
			cad+=j.getInfo()+"==>";
		}
		cad+="\n";
		for(Nodito j=f; j!=null; j=j.izq) {
			cad+=j.getInfo()+"==>";
		}
		
		return cad;
	}

	@Override
	public void Modificar(Nodo dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nodo buscarLista(T dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Eliminar(Nodo dato) {
		// TODO Auto-generated method stub
		
	}

}

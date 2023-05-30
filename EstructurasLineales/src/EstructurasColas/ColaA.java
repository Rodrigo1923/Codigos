package EstructurasColas;

import Tools.ToolsPanel;

public class ColaA<T> implements ColaTDA<T>{

	private T cola[];
	private byte u;
	
	public ColaA(int max) {
		cola = (T[]) (new Object[max]);
		u=-1;
	}
	
	@Override
	public boolean isEmptyCola() {
		return (u==-1);
	}

	public boolean isSpace() {
		return (u<cola.length-1);
	}
	
	@Override
	public void pushCola(T Dato) {
		if(isSpace()) {
			u++;
			cola[u]=Dato;
		}else {
			ToolsPanel.imprimeError("Cola llena...");
		}
	}

	@Override
	public T popCola() {
		T Dato = cola[0];
		for(int k=0; k<=u; k++) {
			cola[k]=cola[k+1];
		}
		u--;
		return Dato;
	}

	@Override
	public T peekCola() {
		return (T)cola[0];
	}
	
	public String toString() {
		return toString(0);
	}
	
	public String toString(int i) {
		return (i<=u)?" "+i+"=>["+""+cola[i]+"] "+toString(i+1):"";
	}

	@Override
	public void freeCola() {
		u=-1;
	}

}

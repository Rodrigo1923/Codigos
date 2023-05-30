package estrucnolineal;

import javax.swing.JOptionPane;

import DobleLiga.Nodito;
import Tools.ToolsPanel;

public class TesTArbol {

	public static void main(String[] args) {
		menu0("Insertar,Recorridos,Buscar,Hojas,Altura,Ver,Exit");
	}
	
	public static void menu0(String menu){  
		ArbolBin<Integer> arb;
		arb = new ArbolBin();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Insertar": 
					arb.insertarArbol(ToolsPanel.leerInt("Inserte un dato"));
					break;
				case "Recorridos":  
					ToolsPanel.imprimePantalla("PreOrden: "+arb.preorden(arb.getRaiz())
					+"\nInOrden1: "+arb.inorden(arb.getRaiz())
					+"\nInOrden2: "+arb.inorden2(arb.getRaiz())
					+"\nPosOrden: "+arb.posorden(arb.getRaiz()));
					break;
				case "Buscar":
					Nodito obj = arb.buscarDato(arb.getRaiz(), ToolsPanel.leerInt("Que numero quieres buscar?: "));
					if(obj!=null) {
						ToolsPanel.imprimePantalla("El numero que buscas es: "+obj.getInfo());
					}else {
						ToolsPanel.imprimeError("Este dato no existe");
					}
					break;
				case "Hojas":
					break;
				case "Altura":
					
					break;
				case "Ver":
					arb.graficarArbol(arb.getRaiz(), 0);
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}

}

package Ejecutar;

import javax.swing.JOptionPane;

import EstructurasColas.ColaA;
import DobleLiga.DatosDesordenadosDobleLiga;
import DobleLiga.Nodito;
import MemoriaDinamica.PilaC;
import Operaciones.Desordenado;
import MemoriaDinamica.Nodo;
import PilaEstatica.PilaA;
import PilaEstatica.PilaB;
import Tools.ToolsPanel;

public class Iniciar {

	public static void main(String[] args) {
		menu0("PushFr,PushFi,Buscar,Mostrar,Eliminar,Modificar,Exit");
	}
	
	public static void menu1(String menu){  
		Desordenado<Integer> Lista = new Desordenado();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "PushFr": Lista.insertarFrente((ToolsPanel.leerInt("Ingresa un numero")));
				break;
				case "PushFi": Lista.insertarFinal((ToolsPanel.leerInt("Ingresa un numero"))); 
					break;
				
				case "Buscar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodo obj = Lista.buscarLista(ToolsPanel.leerInt("Que numero buscas"));
						if(obj!=null) {
							ToolsPanel.imprimePantalla("Numero buscado: "+obj.getInfo());
							obj = Lista.buscarAnterior(obj);
							if(obj==null) {
								ToolsPanel.imprimeError("Es el primero numero, no tiene uno anterior.");
							}else {
								ToolsPanel.imprimePantalla("Su numero anterior es: "+obj.getInfo());
							}
						}else {
							ToolsPanel.imprimePantalla("Este numero no existe");
						}
					}
					break;
				
				case "Mostrar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						ToolsPanel.imprimePantalla(Lista.mostrarLista());
					}
					break;
					
				case "Eliminar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodo op = Lista.buscarLista(ToolsPanel.leerInt("Que numero quieres eliminar"));
						if(op==null) {
							ToolsPanel.imprimeError("Este dato no existe");
						}else {
							Lista.Eliminar(op);
						}
					}
					break;
				case "Modificar":
						if(Lista.isListaVacia()) {
							ToolsPanel.imprimeError("Lista vacia");
						}else {
							Nodo op=Lista.buscarLista(ToolsPanel.leerInt("Que numero quieres modificar"));
							if(op==null) {
								ToolsPanel.imprimeError("Este numero no existe");
							}else {
								Lista.Modificar(op);
							}
						}
					break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu0(String menu){  
		DatosDesordenadosDobleLiga Lista = new DatosDesordenadosDobleLiga();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "PushFr": Lista.insertarFrente((ToolsPanel.leerString("Ingresa un numero")));
				break;
				case "PushFi": Lista.insertarFinal((ToolsPanel.leerString("Ingresa un numero"))); 
					break;
				
				case "Buscar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodito op=Lista.buscarListas(ToolsPanel.leerString("Que dato buscas"));
						if(op==null) {
							ToolsPanel.imprimeError("El dato no existe");
						}else {
							ToolsPanel.imprimePantalla(""+op.getInfo());
						}
					}
					break;
				
				case "Mostrar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						ToolsPanel.imprimePantalla(Lista.mostrarLista());
					}
					break;
					
				case "Eliminar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodito op = Lista.buscarListas(ToolsPanel.leerString("Que numero quieres eliminar"));
						if(op==null) {
							ToolsPanel.imprimeError("Este dato no existe");
						}else {
							Lista.Eliminar(op);
						}
					}
					break;
				case "Modificar":
						if(Lista.isListaVacia()) {
							ToolsPanel.imprimeError("Lista vacia");
						}else {
							Nodito op=Lista.buscarListas(ToolsPanel.leerString("Que dato deseas modificar"));
							if(op==null) {
								ToolsPanel.imprimeError("Este dato no existe");
							}else {
								Lista.Modificar(op);
							}
						}
					break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu2(String menu){  
		PilaC<Integer> pila = new PilaC();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": pila.push(ToolsPanel.leerInt("Ingresa un numero")); ;break;
				
				case "Pop": if(pila.isEmpty()) ToolsPanel.imprimeError("Pila vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+pila.pop()); ;break;
				
				case "Peek": 
					if(pila.isEmpty()) ToolsPanel.imprimeError("Pila vacia");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la pila: "+pila.peek());
					;break;
				
				case "Free": 
					if(pila.isEmpty()) ToolsPanel.imprimeError("Pila vacia");
					else
						pila.vaciar();
						ToolsPanel.imprimeError("Pila vacia...");
					break;
				
				case "Mostrar": if(pila.isEmpty()) ToolsPanel.imprimeError("Pila vacia");
				else
					ToolsPanel.imprimePantalla(pila.toString()) ;break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu3(String menu){  
		PilaA<Integer> pila = new PilaA((byte)10);
		PilaC<Integer> pilaC =new PilaC();
		ColaA<Integer> ColaA = new ColaA((byte)10);
		PilaB<Integer> pilaB = new PilaB();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": ColaA.pushCola(ToolsPanel.leerInt("Ingresa un numero")); ;break;
				
				case "Pop": if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+ColaA.popCola()); ;break;
				
				case "Peek": 
					if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la cola: "+ColaA.peekCola());
					;break;
				
				case "Free": 
					if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia");
					else
						ColaA.freeCola();
						ToolsPanel.imprimeError("Pila vacia...");
					break;
				
				case "Mostrar": if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia");
				else
					ToolsPanel.imprimePantalla(ColaA.toString()) ;break;
				
				case "Exit": ;break;
				
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

package Grafo;

import java.util.*;

public class Grafo {

	private ArrayList<Node> nodes;
	
	//Construtor limitando a quantidade de Nós
	public Grafo(int qtdNos) {
		this.nodes = new ArrayList<Node>(qtdNos);
	}
	
	//insere edges marcando o destino e a distancia no nó origem
	public void insereEdge(int ori, int dest, double distancia) {
		Node n = nodes.get(ori);
		Edge ed = new Edge(nodes.get(dest), distancia);
		n.vizinhos.add(ed);
	}
	
	public ArrayList<Node> getNodes(){
		return nodes;
	}
	
	public Node getNode(int no) {
		return nodes.get(no);
	}
}

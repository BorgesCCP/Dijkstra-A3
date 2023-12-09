package Grafo;

import java.util.*;

public class Node implements Comparable<Node>{
	public String nome;
	public ArrayList<Edge> vizinhos;
	public LinkedList<Node> visitadas;
	public double menorDistancia = 0;
	public Node anterior;
	
	//compara implementado com Comparable
	public int compareTo(Node outra) {
		return Double.compare(menorDistancia, outra.menorDistancia);
	}
	
	//Construtor
	public Node(String nome) {
		this.nome = nome;
		vizinhos = new ArrayList<Edge>();
		visitadas = new LinkedList<Node>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getMenorDistancia() {
		return menorDistancia;
	}
	
	
}

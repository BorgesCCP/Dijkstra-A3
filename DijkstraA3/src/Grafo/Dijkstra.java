package Grafo;

import java.util.*;

import Chumbador.FakeBD;

public class Dijkstra {

	public static void algoritmoDijk(Node origem) {

		// Pega o nó vizinho não visitado com menos distancia

		// visita todos os vizinhos dele

		// Atualiza a distancia de todos os vizinhos (com o PriorityQueue).

		// Repe o processo
		origem.menorDistancia = 0;
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		queue.add(origem);

		while (!queue.isEmpty()) {

			Node n = queue.poll();

			for (Edge vizinhos : n.vizinhos) {
				// soma a distancia do vizinho a distancia da cidade atual
				Double novaDist = n.menorDistancia + vizinhos.distancia;

				if (vizinhos.destino.menorDistancia > novaDist) {
					// tira o nó do queue e atualiza a distancia
					queue.remove(vizinhos.destino);
					vizinhos.destino.menorDistancia = novaDist;

					// pega os nós visitados até agora e adiciona o novo nó visitado
					vizinhos.destino.visitadas = new LinkedList<Node>(n.visitadas);
					vizinhos.destino.visitadas.add(n);

					// mira no próximo vizinho para repetir o processo
					queue.add(vizinhos.destino);

				}
			}
		}
	}

	public static Node getViagemDijkstra(Node origem, Node destino) {
		FakeBD.instanciarObjetos();

		origem = FakeBD.retornaNo(origem.getNome());
		destino = FakeBD.retornaNo(destino.getNome());

		// Confere se um dos vizinhos não é o destino

		// Pega o nó vizinho não visitado com menos distancia

		// visita todos os vizinhos dele

		// Atualiza a distancia de todos os vizinhos (com o PriorityQueue).

		// Repe o processo
		origem.menorDistancia = 0;
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		queue.add(origem);

		while (!queue.isEmpty()) {

			Node n = queue.poll();

			for (Edge vizinhos : n.vizinhos) {

				Node finalDestino = destino;
				if (n.vizinhos.stream().anyMatch(edge -> edge.destino.nome.equals(finalDestino.nome))) {
					double novaDist = n.menorDistancia + vizinhos.distancia;
					
					if (destino.menorDistancia <= novaDist) {
						// tira o nó do queue e atualiza a distancia
						queue.remove(destino);
						destino.menorDistancia = novaDist;

						// pega os nós visitados até agora e adiciona o novo nó visitado
						destino.visitadas = new LinkedList<Node>(n.visitadas);
						destino.visitadas.add(n);

						return destino;
					}
				} else {
					// soma a distancia do vizinho a distancia da cidade atual
					Double novaDist = n.menorDistancia + vizinhos.distancia;

					if (vizinhos.destino.menorDistancia <= novaDist) {
						// tira o nó do queue e atualiza a distancia
						queue.remove(vizinhos.destino);
						vizinhos.destino.menorDistancia = novaDist;

						// pega os nós visitados até agora e adiciona o novo nó visitado
						vizinhos.destino.visitadas = new LinkedList<Node>(n.visitadas);
						vizinhos.destino.visitadas.add(n);

						// mira no próximo vizinho para repetir o processo
						queue.add(vizinhos.destino);

					}
				}
			}
		}
		return destino;
	}
	
	public static ArrayList<Node> retornaCidadesVisitadas(Node destino){
		ArrayList<Node> lista = new ArrayList<Node>();
		
		for(Node node = destino; node != null; node = node.anterior) {
			lista.add(node);
			
			Collections.reverse(lista);
		}
		return lista;
	}
	
	public static void main(String[] args) {
		Node n0 = new Node("Cantagalo");
		Node n1 = new Node("Candói");
		Node n2 = new Node("Guarapuava");
		Node n3 = new Node("Virmond");
		Node n4 = new Node("Pitanga");
		Node n5 = new Node("Porto Barreiro");
		Node n6 = new Node("Campina do Simão");
		
		Edge n0_n1 = new Edge(n1, 79.83);
		Edge n0_n5 = new Edge(n5, 81.15);
		n0.vizinhos.add(n0_n1);
		n0.vizinhos.add(n0_n5);
		
		Edge n1_n0 = new Edge(n0, 79.75);
		Edge n1_n2 = new Edge(n2, 39.42);
		Edge n1_n3 = new Edge(n3, 103);
		n1.vizinhos.add(n1_n3);
		n1.vizinhos.add(n1_n2);
		n1.vizinhos.add(n1_n0);
		
		Edge n2_n1 = new Edge(n1, 38.65);
		n2.vizinhos.add(n2_n1);
		
		Edge n3_n1 = new Edge(n1, 102.53);
		Edge n3_n5 = new Edge(n5, 61.44);
		Edge n3_n6 = new Edge(n6, 96.79);
		n3.vizinhos.add(n3_n1);
		n3.vizinhos.add(n3_n5);
		n3.vizinhos.add(n3_n6);
		
		Edge n4_n5 = new Edge(n5, 133.04);
		n4.vizinhos.add(n4_n5);
		
		Edge n5_n0 = new Edge(n0, 81.77);
		Edge n5_n3 = new Edge(n3, 62.05);
		Edge n5_n4 = new Edge(n4, 134.47);
		Edge n5_n6 = new Edge(n6, 96.79);
		n5.vizinhos.add(n5_n0);
		n5.vizinhos.add(n5_n3);
		n5.vizinhos.add(n5_n4);
		n5.vizinhos.add(n5_n6);
		
		Edge n6_n3 = new Edge(n3, 97.24);
		Edge n6_n5 = new Edge(n5, 87.94);
		n6.vizinhos.add(n6_n3);
		n6.vizinhos.add(n6_n5);
		
		Node[] nodes = { n0, n1, n2, n3, n4, n5, n6 };
		
		for (Node n : nodes) {
			System.out.println("Distance to " + n.nome + ": " + n.menorDistancia);
	 	    ArrayList<Node> lista = retornaCidadesVisitadas(n);
	 	    System.out.println("Path: " + lista);
		}
	}
}

package Grafo;
// representa as ligações entre os Nós
public class Edge {
	public Node destino;
	public double distancia;

	public Edge(Node destino, double distancia) {
		this.destino = destino;
		this.distancia = distancia;
	}
}

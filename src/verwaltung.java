import untils.*;
import untils.graph.*;

public class verwaltung {
    public static void main(String[] args) {
        new verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");
    }
    public verwaltung(){
        Graph schulgraph=   new Graph();
        schulgraph.addVertex(new Vertex("Inforaum -1.030"));
        schulgraph.addVertex(new Vertex("Aula"));
        schulgraph.addVertex(new Vertex("PZ"));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1.030"),schulgraph.getVertex("Aula"),18));
    }
}
import untils.*;
import untils.graph.*;
public class verwaltung {
    public static void main(String[] args) {
        new verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");
    }
    public verwaltung(){
        Graph FRG=   new Graph();
        FRG.addVertex(new Vertex("Inforaum -1.030"));
        FRG.addVertex(new Vertex("Aula"));
        FRG.getVertex(new Vertex());
        FRG.addEdge(new Edge(FRG.getVertex("Inforaum -1.030"),FRG.getVertex("Aula"),18));
    }
}
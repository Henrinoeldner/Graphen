import untils.*;
import untils.graph.*;
import java.util.Scanner;

public class verwaltung {
    Graph schulgraph=   new Graph();
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Herzlich willkommen zum Schulgraphen!");
        new verwaltung();
    }
    public verwaltung(){
        schulgraph.addVertex(new Vertex("Inforaum -1030"));
        schulgraph.addVertex(new Vertex("Aula"));
        schulgraph.addVertex(new Vertex("PZ"));
        schulgraph.addVertex(new Vertex("Mensa"));
        schulgraph.addVertex(new Vertex("Lehrerzimmer"));
        schulgraph.addVertex(new Vertex("Cafeteria"));
        schulgraph.addVertex(new Vertex("WC"));
        schulgraph.addVertex(new Vertex("Tor(Rn)"));
        schulgraph.addVertex(new Vertex("Secretariat"));
        schulgraph.addVertex(new Vertex("Kunstraum -1011"));
        schulgraph.addVertex(new Vertex("Musikraum -1008"));
        schulgraph.addVertex(new Vertex("Sporthalle"));
        schulgraph.addVertex(new Vertex("Radkeller"));
        schulgraph.addVertex(new Vertex("TischtenPlatten"));
        schulgraph.addVertex(new Vertex("Tor(SF)"));
        schulgraph.addVertex(new Vertex("Fußballplatz"));
        schulgraph.addVertex(new Vertex("Schulzoo"));
        schulgraph.addVertex(new Vertex("Inforaum -1029"));
        schulgraph.addVertex(new Vertex("Chemieraum 1031"));
        schulgraph.addVertex(new Vertex("Bioraum 1028"));
        schulgraph.addVertex(new Vertex("Treppenhaus NW Trakt"));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Mensa"),schulgraph.getVertex("Lehrerzimmer"),96));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Mensa"),schulgraph.getVertex("Cafeteria"),7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Mensa"),schulgraph.getVertex("WC"),22));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"),schulgraph.getVertex("Cafeteria"),9));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"),schulgraph.getVertex("WC"),15));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"),schulgraph.getVertex("Inforaum -1030"),95));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"),schulgraph.getVertex("Kunstraumraum -1011"),71));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("WC"),schulgraph.getVertex("Inforaum -1030"),80));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("WC"),schulgraph.getVertex("Cafeteria"),22));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Kunstraum -1011"),schulgraph.getVertex("Inforaum -1030"),64));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Kunstraum -1011"),schulgraph.getVertex("Musikraum -1008"),7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Musikraum -1008"),schulgraph.getVertex("Inforaum -1030"),50));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"),schulgraph.getVertex("Inforaum -1029"),5));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"),schulgraph.getVertex("Schulzoo"),17));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"),schulgraph.getVertex("Treppenhaus NW Trakt"),13));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Schulzoo"),schulgraph.getVertex("Chemieraum 1031"),7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Schulzoo"),schulgraph.getVertex("Bioraum 1028"),7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Chemieraum 1031"),schulgraph.getVertex("Bioraum 1028"),4));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Chemieraum 1031"),schulgraph.getVertex("Treppenhaus NW Trakt"),22));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Bioraum 1028"),schulgraph.getVertex("Treppenhaus NW Trakt"),21));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"),schulgraph.getVertex("Fußballplatz"),34));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"),schulgraph.getVertex("Sporthalle"),95));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Sporthalle"),schulgraph.getVertex("Fußballplatz"),58));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Fußballplatz"),schulgraph.getVertex("Tor(SF)"),34));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Sporthalle"),schulgraph.getVertex("Tor(SF)"),63));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Sporthalle"),schulgraph.getVertex("TischtenPlatten"),28));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("TischtenPlatten"),schulgraph.getVertex("Tor(SF)"),48));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("TischtenPlatten"),schulgraph.getVertex("Fußballplatz"),57));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"),schulgraph.getVertex("PZ"),96));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"),schulgraph.getVertex("Tor(Rn)"),98));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"),schulgraph.getVertex("Radkeller"),45));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"),schulgraph.getVertex("Secretariat"),31));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"),schulgraph.getVertex("Lehrerzimmer"),37));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Tor(Rn)"),schulgraph.getVertex("Lehrerzimmer"),79));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Tor(Rn)"),schulgraph.getVertex("Secretariat"),18));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Lehrerzimmer"),schulgraph.getVertex("Radkeller"),27));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Secretariat"),schulgraph.getVertex("Radkeller"),26));
    }
    public List<Vertex> Breitensuche() {
        List<Vertex> ergebnisliste




    }
}
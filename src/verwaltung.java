import untils.*;
import untils.graph.*;

import java.util.Scanner;

public class verwaltung {
    Graph schulgraph=   new Graph();
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Herzlich willkommen zu Schulenavigator !");
        verwaltung Verwaltung=new verwaltung();
        Verwaltung.Auswahl();
    }

    /**
     *
     * Die Methode verwaltung() erstellt und initialisiert einen gewichteten Schulgraphen,
     * der das Schuhlgelände abbildet. Die Knoten repräsentieren
     * verschiedene Orte auf dem Gelände (z.b Räume, Eingänge unsw), während die Kanten die
     * Wege (mit Distanz in Metern) zwischen diesen Orten beschreiben.
     */
    public verwaltung() {

        String[] raeume = {
                "Inforaum -1030",
                "Aula",
                "PZ",
                "Mensa",
                "Lehrerzimmer",
                "Cafeteria",
                "WC",
                "Tor(Rn)",
                "Sekretariat",
                "Kunstraum -1011",
                "Musikraum -1008",
                "Sporthalle",
                "Radkeller",
                "TischtenPlatten",
                "Tor(SF)",
                "Fußballplatz",
                "Schulzoo",
                "Inforaum -1029",
                "Chemieraum 1031",
                "Bioraum 1028",
                "Treppenhaus NW Trakt"
        };

        //Dem Graphen schulgraph einen Knoten für jeden raum hinzufuegen
        for (String s : raeume) {
            schulgraph.addVertex((new Vertex(s)));
        }


        schulgraph.addEdge(new Edge(schulgraph.getVertex("Mensa"), schulgraph.getVertex("Lehrerzimmer"), 96));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Mensa"), schulgraph.getVertex("Cafeteria"), 7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Mensa"), schulgraph.getVertex("WC"), 22));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"), schulgraph.getVertex("Cafeteria"), 9));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"), schulgraph.getVertex("WC"), 15));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"), schulgraph.getVertex("Inforaum -1030"), 95));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"), schulgraph.getVertex("Kunstraum -1011"), 71));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("WC"), schulgraph.getVertex("Inforaum -1030"), 80));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("WC"), schulgraph.getVertex("Cafeteria"), 22));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Kunstraum -1011"), schulgraph.getVertex("Inforaum -1030"), 64));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Kunstraum -1011"), schulgraph.getVertex("Musikraum -1008"), 7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Musikraum -1008"), schulgraph.getVertex("Inforaum -1030"), 50));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"), schulgraph.getVertex("Inforaum -1029"), 5));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"), schulgraph.getVertex("Schulzoo"), 17));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"), schulgraph.getVertex("Treppenhaus NW Trakt"), 13));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Schulzoo"), schulgraph.getVertex("Chemieraum 1031"), 7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Schulzoo"), schulgraph.getVertex("Bioraum 1028"), 7));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Chemieraum 1031"), schulgraph.getVertex("Bioraum 1028"), 4));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Chemieraum 1031"), schulgraph.getVertex("Treppenhaus NW Trakt"), 22));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Bioraum 1028"), schulgraph.getVertex("Treppenhaus NW Trakt"), 21));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"), schulgraph.getVertex("Fußballplatz"), 34));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"), schulgraph.getVertex("Sporthalle"), 95));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Sporthalle"), schulgraph.getVertex("Fußballplatz"), 58));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Fußballplatz"), schulgraph.getVertex("Tor(SF)"), 34));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Sporthalle"), schulgraph.getVertex("Tor(SF)"), 63));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Sporthalle"), schulgraph.getVertex("TischtenPlatten"), 28));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("TischtenPlatten"), schulgraph.getVertex("Tor(SF)"), 48));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("TischtenPlatten"), schulgraph.getVertex("Fußballplatz"), 57));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Inforaum -1030"), schulgraph.getVertex("PZ"), 96));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"), schulgraph.getVertex("Tor(Rn)"), 98));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"), schulgraph.getVertex("Radkeller"), 45));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"), schulgraph.getVertex("Secretariat"), 31));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("PZ"), schulgraph.getVertex("Lehrerzimmer"), 37));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Tor(Rn)"), schulgraph.getVertex("Lehrerzimmer"), 79));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Tor(Rn)"), schulgraph.getVertex("Secretariat"), 18));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Lehrerzimmer"), schulgraph.getVertex("Radkeller"), 27));
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Secretariat"), schulgraph.getVertex("Radkeller"), 26));
    }
/*
        System.out.println("Von welchen Ort möchtest du die Nachbarn wissen?");
        Vertex gesucht = schulgraph.getVertex(scanner.nextLine());
        List<Vertex> speicher= schulgraph.getNeighbours(gesucht);
        speicher.toFirst();
        while (speicher.hasAccess()){
            System.out.print(speicher.getContent().getID()+" entfernung: ");
            System.out.println(schulgraph.getEdge(gesucht,speicher.getContent()).getWeight()+" meter");
            speicher.next();
        }
        */


    public void Auswahl(){
        int option;
        while (true){
            System.out.println("Welche Methode möchtest du testen? Bitte gebe die Zugewiesene Nummer ein und drücke Enter.");
            System.out.println("[1]Breitensuche");
            System.out.println("[2]Tiefensuche");
            System.out.println("[3]Matrixausgabe");
            System.out.println("[4]TiefensucheRekusive");
            option=scanner.nextInt();
            if (option==1){
                this.Listeausgeben(Breitensuche());
            }else if(option==2){
                this.Listeausgeben(Tiefensuche("Inforaum -1030"));
            }else if(option==3){
                this.Matrixausgabe(MatrixErstellen());
            }else if(option==4){
                this.Listeausgeben(TiefensucheRekusiv());
            }
        }
    }

    /**
     * Die Methode Breitensuche() traversiert alle Knoten des Graphens vom Startknoten ausgehend.
     * Es wird Schichtenweise traversiert wobei erst alle Nachbarn des Startknotens besucht werden,
     * die Nachbarn dieser Nachbarn und so weiter. Die Traversierung wird am ende ausgegeben.
     * @return ruekgabeListe
     */
    public List<Vertex> Breitensuche(){
        List<Vertex> ruekgabeListe=new List<>();
        Queue<Vertex> zubesuchen= new Queue<>();
        List<Vertex> ergebinsListe=new List<>();
        zubesuchen.enqueue(schulgraph.getVertex("Inforaum -1030"));
        zubesuchen.front().setMark(true);
        do{
            System.out.println(zubesuchen.front().getID());
            ruekgabeListe.append(zubesuchen.front());
            ergebinsListe=schulgraph.getNeighbours(zubesuchen.front());
            ergebinsListe.toFirst();
            while (ergebinsListe.hasAccess()){
                if (!ergebinsListe.getContent().isMarked()){
                    zubesuchen.enqueue(ergebinsListe.getContent());
                    ergebinsListe.getContent().setMark(true);
                }
                ergebinsListe.next();
            }
            zubesuchen.dequeue();
        }while(!zubesuchen.isEmpty());
        schulgraph.setAllVertexMarks(false);
        return  ruekgabeListe;
    }

    /**
     * Die Methode MatrixErstellen() erstellt mit hilfe eines 2D Arrays eine Matrix in welcher alle
     * Knoten und Gewichtungen enthalten sind.
     *
     */
    public String[][] MatrixErstellen(){
        //speichert all Knoten im Schulgraph in einer Liste
        List<Vertex> speicher= this.Breitensuche();
        int lange=0;
        speicher.toFirst();
        while (speicher.hasAccess()){
            lange++;
            speicher.next();
        }

        speicher.toFirst();
        String[][] rueckgabeMatrix =new String[lange+1][lange+1];
        rueckgabeMatrix[0][0]="                        ";
        for (int i=1;i<lange+1;i++){
            rueckgabeMatrix[i][0]=speicher.getContent().getID();
            rueckgabeMatrix[0][i]=speicher.getContent().getID();
            speicher.next();
        }
        for (int i=0;i<(lange)*(lange);i++) {

            if ((i / lange) + 1 != (i % lange) + 1) {

                Edge sp=schulgraph.getEdge(schulgraph.getVertex(rueckgabeMatrix[0][(i % lange) + 1]), schulgraph.getVertex(rueckgabeMatrix[(i / lange) + 1][0]));
                if (sp!=null) {
                    rueckgabeMatrix[(i / lange) + 1][(i % lange) + 1] =""+(int)sp.getWeight();
                }else{
                    rueckgabeMatrix[(i / lange) + 1][(i % lange) + 1]=" ";
                }
            }else{
                rueckgabeMatrix[(i / lange) + 1][(i % lange) + 1]="/";
            }
        }
        return rueckgabeMatrix;
    }

    /**
     * Gibt ein Mitgegebenes Zwei dimensionales Array in der darstellung einer Tabelle aus
     * @param pMatrix ,ist das zweidimensionale Array welches ausgegeben wird
     */
    public void Matrixausgabe(String[][] pMatrix){
        int zeilenbreite=0;/* speicher wie breit eine Zeile sein muss */
        for (int a=0;a< pMatrix.length;a++) {/*geht Zeile für Zeile die Tabelle durch*/
            for (int i = 0; i < pMatrix.length; i++) {/*geht Spalte für Spalte die Tabelle durch*/
                System.out.print("|"+pMatrix[i][a]);/*Ausgabe von "|" + das element in der zelle der Tabelle*/
                for (int c=pMatrix[i][a].length();c<pMatrix[i][0].length();c++){/*Sorgt dafür, dass die Zelle so breit wird wie die oberste Zelle der Spalte*/
                    System.out.print(" ");
                }
                zeilenbreite+=pMatrix[i][0].length()+1;/*erhöht die zeilenbreite um die Breite der Spalte*/
            }
            System.out.println("|");/*Schließt die Zeile*/
            for (int z=0;z<zeilenbreite;z++){/*fuegt eine Zeile mit ausschließlich "-----" ein mit der Breite der Zeile*/
                System.out.print("-");
            }
            System.out.println("-");/*Beendet die "------" Zeile*/
            zeilenbreite=0;/*setzt die Zeilenbreite zurueck auf null, damit sie nicht immer weiter erhoet wird*/
        }
    }

    public List<Vertex> TiefensucheRekusiv(){
        schulgraph.setAllVertexMarks(false);
        List<Vertex> rueckgabeliste=new List<>();
        rueckgabeliste= TiefensucheinternRekusiv(schulgraph.getVertex("PZ"),rueckgabeliste);
        schulgraph.setAllVertexMarks(false);
        return rueckgabeliste;

    }

    private List<Vertex> TiefensucheinternRekusiv(Vertex aktuellervertex, List<Vertex> pListe){
        aktuellervertex.setMark(true);
        pListe.append(aktuellervertex);
        List<Vertex> nachbar=schulgraph.getNeighbours(aktuellervertex);
        nachbar.toFirst();
        while (nachbar.hasAccess()){
            if (!nachbar.getContent().isMarked()){
                pListe=TiefensucheinternRekusiv(nachbar.getContent(),pListe);
            }
            nachbar.next();
        }

        return  pListe;
    }

    public void Listeausgeben(List<Vertex> pList){
        pList.toFirst();
        while (pList.hasAccess()){
            System.out.println(pList.getContent().getID());
            pList.next();
        }
    }

    // Führt eine Tiefensuche auf dem Graphen durch.
    // Es gibt zwei Varianten: mit explizitem Startknoten oder mit einem Standardwert.
    // Die Tiefensuche verarbeitet immer den zuletzt zwischengespeicherten Knoten (Stack-Prinzip/FILO),
    // im Gegensatz zur Breitensuche, die FIFO arbeitet (Queue-Prinzip).

    /**
     * Führt eine Tiefensuche mit dem Standard-Startknoten ("Inforaum -1030") durch.
     *
     * @return Liste der besuchten Knoten in der Reihenfolge ihrer Verarbeitung
     */
    public List<Vertex> Tiefensuche() {
        return Tiefensuche("Inforaum -1030");
    }

    /**
     * Führt eine Tiefensuche vom angegebenen Startknoten durch.
     *
     * @param VertexID ID des gewünschten Startknotens
     * @return Liste der besuchten Knoten in der Reihenfolge ihrer Verarbeitung
     */
    public List<Vertex> Tiefensuche(String VertexID) {
        List<Vertex> reihenfolge = new List<Vertex>();
        Stack<Vertex> zuBesuchen = new Stack<>();

        zuBesuchen.push(schulgraph.getVertex(VertexID));
        schulgraph.setAllVertexMarks(false);
        zuBesuchen.push(schulgraph.getVertex(VertexID));
        schulgraph.getVertex(VertexID).setMark(true);

        do {
            System.out.println(zuBesuchen.top().getID());
            reihenfolge.append(zuBesuchen.top());
            List<Vertex> nachbarn = schulgraph.getNeighbours(zuBesuchen.top());
            zuBesuchen.pop();

            nachbarn.toFirst();
            while (nachbarn.hasAccess()) {
                if (!nachbarn.getContent().isMarked()) {
                    nachbarn.getContent().setMark(true);
                    zuBesuchen.push(nachbarn.getContent());
                }
                nachbarn.next();
            }

        } while (!zuBesuchen.isEmpty());

        schulgraph.setAllVertexMarks(false);
        return reihenfolge;
    }
/*
    public List<Vertex> Dijkstra (Vertex StartVertex,Vertex ZielVertex){
        List<Vertex> rueckgabeList=new List<>();
        List<Vertex> nachbarn =new List<>();
        return rueckgabeList;
    }
    private List<Vertex> Dijkstraintern()
    */

}



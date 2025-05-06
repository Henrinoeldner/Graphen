import untils.*;
import untils.graph.*;

import java.util.Scanner;

public class verwaltung {
    Graph schulgraph=   new Graph();
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Herzlich willkommen zu Schulenavigator !");
        new verwaltung();

    }

    /**
     *
     * Die Methode verwaltung() erstellt und initialisiert einen gewichteten Schulgraphen,
     * der das Schuhlgelände abbildet. Die Knoten repräsentieren
     * verschiedene Orte auf dem Gelände (z.b Räume, Eingänge unsw), während die Kanten die
     * Wege (mit Distanz in Metern) zwischen diesen Orten beschreiben.
     */
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
        schulgraph.addEdge(new Edge(schulgraph.getVertex("Aula"),schulgraph.getVertex("Kunstraum -1011"),71));
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

        this.Breitensuche();
        this.Matrixausgabe(MatrixErstellen());
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
            zeilenbreite=0;
        }
    }
}
//test
import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Einleser
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
 
    Scanner scanner = new Scanner(System.in);
    /**
     * Konstruktor für Objekte der Klasse Scanner
     */
    public Einleser()
    {
       System.out.print("Gib deinen Namen ein: ");
    String name = scanner.nextLine();
    System.out.println(" Dein Name ist "+name);
    }

    
}
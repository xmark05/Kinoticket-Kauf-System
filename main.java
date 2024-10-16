import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe dein Alter an: ");
        int alter = scanner.nextInt();

        System.out.println("Suche die Filmart aus (1 = Normal, 2 = 3D, 3 = 4D)");
        int art = scanner.nextInt();

        System.out.println("Suche die Tageszeit aus (1 =Früh, 2 = Mittags, 3 = Abends)");
        int Tageszeit = scanner.nextInt();

        double ticketPreis = berechneTicketPreis(alter, art, Tageszeit);

        System.out.printf("Der Preis für ein Ticket beträgt: %.2f €%n ", ticketPreis); /* printf = Ausgabe-Text formatiert darzustellen.
        %.2f Das die Zahl mit 2 Dezimalstellen formatiert wird (z.b. 12.3 wird zu 12.30)
        %n für ein Zeilenumbruch
        */ 

        scanner.close();
    }

    public static double berechneTicketPreis(int alter, int art, int Tageszeit) {
        double grundpreis = 0.0;

        if ( alter < 12) {
            grundpreis = 6.0;
        } else if ( alter >= 12 && alter <= 17) {
            grundpreis = 12.0;
        } else if ( alter >= 17 && alter <= 64) {
            grundpreis = 12.50;
        } else if ( alter > 64) {
            grundpreis = 11.50;
        }

        double zuschlag = 0.0;

        switch (art) {
            case 1: //Normal 
                zuschlag = 0.0;
                break;
            case 2: // 3D
                zuschlag = 3.0;
                break;
            case 3: //4D
                zuschlag = 4.0;
                break;
            default:
            System.out.println("Ungültige Filmart ");
            break;
        }

        double gesamtPreis = grundpreis + zuschlag;

        if (Tageszeit == 1) {
            gesamtPreis *= 0.90; // 10% zuschlag 
        } else if  (Tageszeit == 3) {
            gesamtPreis *= 0.85; // 15% zuschlag
        }

        return gesamtPreis;


    }
}
Projekt: Kinoticket-Kauf-System
Beschreibung:

Erstelle ein Programm, das den Preis eines Kinotickets basierend auf dem Alter des Kunden, der Art des Films und der Tageszeit berechnet.
Anforderungen:

    Benutzereingaben:
        Alter der Person (Ganzzahl).
        Art des Films (Normal, 3D, IMAX).
        Tageszeit (Frühstückszeit, Nachmittag, Abend).

    Preislogik:

        Altersbasierte Preise:
            Unter 12 Jahre: 6 €
            12 bis 17 Jahre: 8 €
            18 bis 64 Jahre: 12 €
            Über 64 Jahre: 7 €

        Filmarten-Zuschläge (zu den Grundpreisen):
            Normal: Kein Zuschlag
            3D: +3 €
            IMAX: +5 €

        Tageszeit-Discounts:
            Frühstückszeit (09:00 - 12:00 Uhr): 10% Rabatt auf den Endpreis
            Nachmittag (12:00 - 17:00 Uhr): Kein Rabatt
            Abend (17:00 - 22:00 Uhr): 15% Rabatt auf den Endpreis

    Zusätzliche Features:
        Gib die Ticketkosten mit einer schönen Ausgabe aus.
        Vermeide negative Preise oder andere Fehler.

    Logik:
        Verwende if-Statements zur Überprüfung des Alters und der Tageszeit.
        Verwende ein switch-Statement (bzw. ein äquivalentes Konstrukt in deiner Programmiersprache), um den Filmtyp zu behandeln.

Schritt-für-Schritt-Anleitung:

    Alter abfragen und verarbeiten:
        Verwende ein if-Statement, um basierend auf dem Alter den Grundpreis zu bestimmen.

    Filmtyp abfragen und verarbeiten:
        Verwende ein switch-Statement, um den Filmtyp zu bestimmen und den entsprechenden Zuschlag hinzuzufügen.

    Tageszeit abfragen und verarbeiten:
        Verwende wieder ein if-Statement, um den Rabatt basierend auf der Tageszeit anzuwenden.

    Gesamtpreis berechnen und ausgeben.

Beispielablauf:

    Eingabe:
        Alter: 25
        Filmtyp: 3D
        Tageszeit: Abend

    Berechnung:
        Grundpreis für Alter 25: 12 €
        Zuschlag für 3D-Film: +3 €
        Rabatt für Abendvorstellung: 15% Rabatt (15 € - 2,25 € = 12,75 €)

    Ausgabe:
        „Der Preis für Ihr Ticket beträgt 12,75 €.“

Zusätzliche Herausforderung:

Füge noch weitere Regeln hinzu, z. B. Sonderrabatte für Schüler oder Studenten oder eine Happy-Hour mit einem speziellen Ticketpreis.

Dieses Projekt hilft dir, die Nutzung von if-Statements und switch-Statements zu üben und zu vertiefen. Willst du damit starten? Soll ich dir bei einem konkreten Codebeispiel helfen?

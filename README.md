# Matura-Mod: Der Stein der Weisen

Praktischer Teil der Maturaarbeit «Programmieren in Minecraft»

| | |
|---|---|
| Verfasser | _Claudio Lang_ |
| Betreuungsperson | _Martin Studer_ |
| Schule | _Gymnasium Kloster Disentis_ |
| Abgabe | _Oktober 2026_ |

## 1 Einleitung

Dieses Repository enthält den Quellcode des praktischen Teils der oben genannten Maturaarbeit. Ziel war die Entwicklung eines eigenständig programmierten, funktionsfähigen Produkts. Der Verfasser entschied sich für einen Mod für die Java Edition von Minecraft, der einen neuen Gegenstand ins Spiel einfügt: den «Stein der Weisen». Inspiriert wurde die Idee vom ersten Harry-Potter-Film. Die schriftliche Dokumentation von Konzeption, Umgebung und Implementierung ist Teil der eigentlichen Arbeit.

## 2 Funktionsumfang

Der Stein der Weisen ist ein roter, rubinartiger Gegenstand der Kategorie «Mystische Gegenstände». Seine Eigenschaften sind:

- **Funktion:** Er verwandelt einen Block eines Metalls in einen Barren des nächsthöheren Metalls (Kupfer, Eisen, Gold, Netherite).
- **Verhältnis:** 9:1, da ein Block aus neun Barren besteht.
- **Haltbarkeit:** Auf neun Anwendungen begrenzt. Danach ist der Stein verbraucht.
- **Vorkommen:** Er ist in rund 5 % der Wüsten-Pyramiden zu finden.

Die Begrenzungen von Haltbarkeit und Vorkommen dienen dazu, die Nutzung einzuschränken und das Spielgleichgewicht zu erhalten.

## 3 Technische Rahmenbedingungen

- **Spiel:** Minecraft Java Edition 26.1.2
- **Mod-Loader:** Fabric
- **Sprache:** Java 25 (Eclipse Temurin JDK 25)
- **Entwicklungsumgebung:** IntelliJ IDEA

Die Begründung dieser Entscheidungen steht im Kapitel «Implementierung» der Arbeit.

## 4 Voraussetzungen

**Zum Spielen des Mods**

- Minecraft Java Edition 26.1.2
- Fabric Loader für diese Spielversion

**Zur Weiterentwicklung**

1. Eclipse Temurin JDK 25 (Adoptium)
2. IntelliJ IDEA 2025.3 oder neuer
3. Minecraft Development Plugin für IntelliJ IDEA (optional, empfohlen)
4. Git zum Klonen des Repositorys

## 5 Einrichtung und Build

1. Repository klonen:
```bash
   git clone https://github.com/claudighg/matura-mod.git
```
2. Projekt in IntelliJ IDEA öffnen.
3. Temurin 25 als Projekt-JDK festlegen und das Gradle-Projekt laden.
4. Mod-Datei über die Gradle-Aufgabe `build` erstellen.
5. Die erzeugte `.jar`-Datei in den Ordner `mods` der Minecraft-Installation bzw. des Servers legen.

## 6 Quellen

Die technischen Vorgaben (Java 25, JDK 25, IntelliJ IDEA 2025.3) stützen sich auf die offizielle Fabric-Dokumentation. Die vollständigen Quellenangaben stehen im Literaturverzeichnis der Arbeit.

## 7 Lizenz und Urheberschaft

_Dieses Projekt steht unter der MIT-Lizenz (siehe Datei `LICENSE`)_ Minecraft ist eine Marke von Mojang Studios / Microsoft. Dieses Projekt ist nicht offiziell mit Mojang oder Microsoft verbunden. «Harry Potter» ist eine Marke der jeweiligen Rechteinhaber.

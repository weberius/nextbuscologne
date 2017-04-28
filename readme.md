# Public Transport Depart Time Cologne

Das Projekt Public Depart Cologne liest zu einer angefragten Haltestelle die Abfahrtszeiten ein kombiniert sie mit den der Information, wie lange ein Fussgänger ohne Hindernisse bis zur Haltestelle benötigt, und gibt die Informationen in Form einer json Struktur zurück. Für diesen Zweck werden die unter 'Verwendete Services' aufgelisteten Services verwendet.

# Entwicklungsstand

Dieses Projekt befindet sich in der Entwicklung

# Verwendete Technologien/ Bibliotheken

- Java
- [jsoup](https://jsoup.org/)

# Verwendete Services

- kvbabfahrtsmonitor
- feetandbikerouting

# Schnittstellen

## /publicTransportDepartureTimeCologne/service/stop/{id}

Dieses Schnittstelle stellt die aktuellen Abfahrtszeiten für die Haltestelle {id} zur Verfügung. 

Beispiel (Neumarkt):
[/publicTransportDepartureTimeCologne/service/stop/2](https://tom.cologne.codefor.de/publicTransportDepartureTimeCologne/service/stop/2)

## /publicTransportDepartureTimeCologne/service/stop/{id}?datatables

Diese Schnittstelle stellt die aktuellen Abfahrtszeiten für die Haltestelle {id} zur Verfügung. Die Rückgabe ist für die Verwendung der javascript Bibliothek datatables optimiert.

Beispiel (Neumarkt):
[/publicTransportDepartureTimeCologne/service/stop/2?datatables](https://tom.cologne.codefor.de/publicTransportDepartureTimeCologne/service/stop/2?datatables)

## /publicTransportDepartureTimeCologne/service/stop/{id}?fromTo={lat,lng,lat,lng}

Diese Schnittstelle stellt die aktuellen Abfahrtszeiten für die Haltestelle {id} zur Verfügung. Es wird der Fuss-Weg zwischen den Punkten fromTo={lat,lng,lat,lng} berücksichtigt.

Beispiel (Neumarkt):
[/publicTransportDepartureTimeCologne/service/stop/2?fromTo=50.940214,6.953710,50.940356,6.961413](https://tom.cologne.codefor.de/publicTransportDepartureTimeCologne/service/stop/2?fromTo=50.940214,6.953710,50.940356,6.961413)

## /publicTransportDepartureTimeCologne/service/stop/{id}?fromTo={lat,lng,lat,lng}&datatables

Diese Schnittstelle stellt die aktuellen Abfahrtszeiten für die Haltestelle {id} zur Verfügung. Es wird der Fuss-Weg zwischen den Punkten fromTo={lat,lng,lat,lng} berücksichtigt. Die Rückgabe ist für die Verwendung der javascript Bibliothek datatables optimiert.

Beispiel (Neumarkt):
[/publicTransportDepartureTimeCologne/service/stop/2?fromTo=50.940214,6.953710,50.940356,6.961413&datatables](/publicTransportDepartureTimeCologne/service/stop/2?fromTo=50.940214,6.953710,50.940356,6.961413&datatables)

# Installation

1. Checkout Sources
2. Build Application
3. Deploy Application

# Security

Wenn die zugrunde liegenden Services eine https Verbindung anbieten und es zu einer '' Meldung kommt, muss das Certificate der Seite für die JVM im System hinterlegt werden. Eine Beschreibung dazu findet sich hier: [PKIX path building failed: SunCertPathBuilderException: unable to find valid certification path to requested target](http://magicmonster.com/kb/prg/java/ssl/pkix_path_building_failed.html)

# License

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons Lizenzvertrag" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br />Dieses Werk ist lizenziert unter einer <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Namensnennung - Weitergabe unter gleichen Bedingungen 4.0 International Lizenz</a>.

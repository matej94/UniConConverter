Aplikacija se sastoji od 6 Activitya.Prvi Activity sadr�i 4 button,a svaki od njih predstavlja 
jednu kategoriju za pretvorbu.Klikom na button pokre�e se novi Activity(Temperaure,Time,Speed
ili Distance) u kojem se odabire �eljena pretvorba i unose podaci.

Pokretanje novog Activitya vr�i se pomo�u Intenta.Za odabir pretvorbe kori�ten je Spinner.Za dodavanje 
mogu�nosti u Spinner stvoren je novi values u kojem je napravljeno 4 polja s item-ima za svaku kategoriju.
Za popunjavanje Spinnera s mogu�nostima kori�ten je SpinnerAdapter,to�nije ArrayAdapret jer su mogu�nosti 
spremljene u polje.

Nakon �to se odabere pretvorba u EditText se unese �eljena vrijednost i pritiskom na button Convert 
izvr�i se pretvorba.Izra�un za svaku pretvorbu je napravljen pomo�u switch case-a gdje svaki case predstavlja
jednu od mogu�nosti u Spinneru.

Nakon pretvorbe podaci su pomo�u Intenta i putExtra() metode proslije�uju u FinalActivity.U putExtra() metodi 
se nalazi klju� koji je objekt string klase i vrijednost.U FinalActivityu prvo dohvatimo Intent koji je pokrenuo 
Activity pomo�u metode getIntent().Nakon toga pomo�u if-a provjeravamo ima li dohva�eni Intent klju� i ako ima 
podaci �e se prikazati u TextView-u.

Prilikom izrade aplikacije kori�teni su predlo�ci za laboratorijske vje�be te slu�bena android dokumentacija prilikom
kori�tenja Spinnera koja se nalazi na:

https://developer.android.com/guide/topics/ui/controls/spinner.html

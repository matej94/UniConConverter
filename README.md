Aplikacija se sastoji od 6 Activitya.Prvi Activity sadrži 4 button,a svaki od njih predstavlja 
jednu kategoriju za pretvorbu.Klikom na button pokreæe se novi Activity(Temperaure,Time,Speed
ili Distance) u kojem se odabire željena pretvorba i unose podaci.

Pokretanje novog Activitya vrši se pomoæu Intenta.Za odabir pretvorbe korišten je Spinner.Za dodavanje 
moguænosti u Spinner stvoren je novi values u kojem je napravljeno 4 polja s item-ima za svaku kategoriju.
Za popunjavanje Spinnera s moguænostima korišten je SpinnerAdapter,toènije ArrayAdapret jer su moguænosti 
spremljene u polje.

Nakon što se odabere pretvorba u EditText se unese željena vrijednost i pritiskom na button Convert 
izvrši se pretvorba.Izraèun za svaku pretvorbu je napravljen pomoæu switch case-a gdje svaki case predstavlja
jednu od moguænosti u Spinneru.

Nakon pretvorbe podaci su pomoæu Intenta i putExtra() metode proslijeðuju u FinalActivity.U putExtra() metodi 
se nalazi kljuè koji je objekt string klase i vrijednost.U FinalActivityu prvo dohvatimo Intent koji je pokrenuo 
Activity pomoæu metode getIntent().Nakon toga pomoæu if-a provjeravamo ima li dohvaæeni Intent kljuè i ako ima 
podaci æe se prikazati u TextView-u.

Prilikom izrade aplikacije korišteni su predlošci za laboratorijske vježbe te službena android dokumentacija prilikom
korištenja Spinnera koja se nalazi na:

https://developer.android.com/guide/topics/ui/controls/spinner.html

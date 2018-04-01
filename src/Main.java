import java.time.LocalDate;
public class Main {

	public static void main(String[] args) throws Exception {
		
		Muzyk muzyk1 = new Muzyk("Axl", "Rose");
		Muzyk muzyk2 = new Muzyk("Robert", "Plant");
		Muzyk muzyk3 = new Muzyk("Bon", "Scott");
		Muzyk muzyk4 = new Muzyk("Saul", "Hudson");
		
		Zespol zespol1= new Zespol("Guns n Roses");
		Zespol zespol2= new Zespol("AC/DC");
		Zespol zespol3= new Zespol("Led Zeppelin");
		
		
		Wytwornia wytwornia1 =  new Wytwornia("Soul Records");
		Wytwornia wytwornia2 =  new Wytwornia("Atlantic Records");
		Wytwornia wytwornia3 =  new Wytwornia("Geffen Records");
		
		Plyta plyta1= new Plyta("Highway to Hell",1979,zespol2, 20.00);
		Plyta plyta2 = new Plyta("Led Zeppelin I", 1969, zespol3, 30.00);
		Plyta plyta3 = new Plyta("Appetite For Destruction", 1987, zespol1, 35.95);
		
	
		BudynekWytworni.utworzBudynek(wytwornia1,"Polska", "Warszawa", "Koszykowa", 86);
		BudynekWytworni.utworzBudynek(wytwornia2, "USA", "Los Angeles", "Simple Street", 12);
		BudynekWytworni.utworzBudynek(wytwornia3, "Rosja", "Moskwa", "Wladimira", 10);
		BudynekWytworni.utworzBudynek(wytwornia1, "UK", "Londyn", "King Street", 18);
		
		LocalDate a1 = LocalDate.of(2010, 4, 5);
		LocalDate a2 = LocalDate.of(2012, 9, 1);
		LocalDate a3 = LocalDate.of(2015, 1, 10);
		LocalDate a4 = LocalDate.of(2009, 9, 5);
		LocalDate a5= LocalDate.of(2008, 10, 2);
		
		Email email1 = new Email("jano1234@gmail.com");
		Email email2 = new Email("nowak4@gmail.com");
		Email email3 = new Email();
		
		
		Osoba klient1 =  new Klient("Jan", "Kowalski" ,email1, a1);
		Osoba klient2 =  new Klient("Maciej", "Nowak", email2, a2);
		Osoba klient3 =  new Klient("Joanna", "Zalewska", email3, a3);
		
		Osoba pracownik1 =  new Pracownik("Anna", "Kowalska", 19456304895L, 878193084,a4, 3500);
		Osoba pracownik2 =  new Pracownik("Krzysztof", "Stepien", 93750378957L, 824948909,a5, 3200);	
		
		RokZakonczenia zakonczenie1 = new RokZakonczenia(2015);
		RokZakonczenia zakonczenie2 = new RokZakonczenia(1996);
		RokZakonczenia zakonczenie3 = new RokZakonczenia(2010);
		RokZakonczenia zakonczenie4 = new RokZakonczenia();
		
		Zatrudnienie zatrudnienie1 = new Zatrudnienie(1976, zakonczenie1,zespol1, muzyk1);
		Zatrudnienie zatrudnienie2 = new Zatrudnienie(1965, zakonczenie2, zespol2, muzyk2);
		Zatrudnienie zatrudnienie3 = new Zatrudnienie(1987, zakonczenie3, zespol3, muzyk3);
		Zatrudnienie zatrudnienie4 = new Zatrudnienie(1987, zakonczenie4, zespol1, muzyk4);
		
		
		Zakup zakup1 = new Zakup(1, klient1, pracownik1);
		Zakup zakup2 = new Zakup(2, klient2, pracownik1);
		Zakup zakup3= new Zakup(3, klient3, pracownik2);
		Zakup zakup4 = new Zakup(4, klient1, pracownik2);
		
		
		klient1.addZakupKlient(zakup1);
		klient2.addZakupKlient(zakup2);
		klient3.addZakupKlient(zakup3);
		klient1.addZakupKlient(zakup4);
		
		pracownik1.addZakupPracownik(zakup1);
		pracownik1.addZakupPracownik(zakup2);
		pracownik2.addZakupPracownik(zakup3);
		pracownik2.addZakupPracownik(zakup4);
		
		PlytaGatunkuRock.utworzPlyteGatunkuRock(plyta1);
		PlytaGatunkuRock.utworzPlyteGatunkuRock(plyta2);
		
		PlytaGatunkuMetal.utworzPlyteGatunkuMetal(plyta1);
		PlytaGatunkuMetal.utworzPlyteGatunkuMetal(plyta3);
		
		PlytaGatunkuRap.utworzPlyteGatunkuRap(plyta3);
		
		
		zakup1.addPlyta(plyta1);
		zakup1.addPlyta(plyta2);
		zakup1.addPlyta(plyta3);
		zakup2.addPlyta(plyta2);
		zakup3.addPlyta(plyta1);
		zakup4.addPlyta(plyta1);
		zakup4.addPlyta(plyta2);
		
		
		zespol1.addPlyta(plyta3);
		zespol2.addPlyta(plyta1);
		zespol3.addPlyta(plyta2);
		
		
		wytwornia1.addPlytaKwalif(plyta1);
		wytwornia2.addPlytaKwalif(plyta2);
		wytwornia3.addPlytaKwalif(plyta3);
		
		
		System.out.println(klient1);
		System.out.println(klient3);
		System.out.println(pracownik1);
		
	//	System.out.println(klient1.getData());
	//	System.out.println(pracownik1.getData() + "\n");				//polimorfizm
		
		
		System.out.println(zakup1);
		System.out.println(zakup2);
		System.out.println(zakup3);
		System.out.println(zakup4);
		
		System.out.println(wytwornia1);
		System.out.println(wytwornia2);
		System.out.println(wytwornia3);
		
		
		
		System.out.println(zatrudnienie1);
		System.out.println(zatrudnienie2);
		System.out.println(zatrudnienie3);
		System.out.println(zatrudnienie4);
		
		System.out.println(plyta1);
		System.out.println(plyta2);
		System.out.println(plyta3);

		System.out.println(zespol1);
		System.out.println(zespol2);
		System.out.println(zespol3);
		
		System.out.println(muzyk1);
		System.out.println(muzyk2);
		System.out.println(muzyk3);
		System.out.println(muzyk4);
		
		
		Muzyk.SearchByName("Axl");					//szukanie muzyka po imieniu
		Muzyk.SearchBySurname("Scott");
		
		Klient.SearchByName("Jan");					//szukanie klienta po imieniu
		Klient.SearchBySurname("Nowak");
		
		Pracownik.SearchByName("Krzysztof");
		Pracownik.SearchBySurname("Stepien");
		
		Zespol.SearchByBand("AC/DC");
		
		Plyta a = wytwornia1.searchByCDsName("Highway to Hell");	//wyszukiwanie detali plyty po tytule za pomoca asocjacji kwalifikowanej
		System.out.println("Szukales: " + a + "\n");
		
		
		
	
		/*
		Zespol.pokażEkstensjeZespol();
		Zatrudnienie.pokażEkstensjeZatrudnienie();
		Zakup.pokażEkstensjeZakup();
		Wytwornia.pokażEkstensjeWytwornia();
		RokZakonczenia.pokażEkstensjeRokZakonczenia();
		Pracownik.pokażEkstensjePracownik();
		PlytaGatunkuRock.pokażEkstensjeRock();
		Plyta.pokażEkstensjePlyta();
		Osoba.pokażEkstensjOsoba();
		Muzyk.pokażMuzykEkstensja();
		Klient.pokażKlientEkstensja();
		Email.pokażEmailEkstensja();
		BudynekWytworni.pokażBudynekEkstensja();
		*/
		
	
		
	}}

import java.time.LocalDate;
public class Main {

	public static void main(String[] args) throws Exception {
		
		Muzyk muzyk1 = new Muzyk("Axl", "Rose");
		Muzyk muzyk2 = new Muzyk("Robert", "Plant");
		Muzyk muzyk3 = new Muzyk("Bon", "Scott");
		Muzyk muzyk4 = new Muzyk("Saul", "Hudson");
		
		Zespół zespół1= new Zespół("Guns n Roses");
		Zespół zespół2= new Zespół("AC/DC");
		Zespół zespół3= new Zespół("Led Zeppelin");
		
		
		Wytwórnia wytwórnia1 =  new Wytwórnia("Soul Records");
		Wytwórnia wytwórnia2 =  new Wytwórnia("Atlantic Records");
		Wytwórnia wytwórnia3 =  new Wytwórnia("Geffen Records");
		
		Płyta płyta1= new Płyta("Highway to Hell",1979,zespół2, 20.00);
		Płyta płyta2 = new Płyta("Led Zeppelin I", 1969, zespół3, 30.00);
		Płyta płyta3 = new Płyta("Appetite For Destruction", 1987, zespół1, 35.95);
		
	
		BudynekWytwórni.utwórzBudynek(wytwórnia1,"Polska", "Warszawa", "Koszykowa", 86);
		BudynekWytwórni.utwórzBudynek(wytwórnia2, "USA", "Los Angeles", "Simple Street", 12);
		BudynekWytwórni.utwórzBudynek(wytwórnia3, "Rosja", "Moskwa", "Władimira", 10);
		BudynekWytwórni.utwórzBudynek(wytwórnia1, "UK", "Londyn", "King Street", 18);
		
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
		Osoba pracownik2 =  new Pracownik("Krzysztof", "Stępień", 93750378957L, 824948909,a5, 3200);	
		
		RokZakończenia zakończenie1 = new RokZakończenia(2015);
		RokZakończenia zakończenie2 = new RokZakończenia(1996);
		RokZakończenia zakończenie3 = new RokZakończenia(2010);
		RokZakończenia zakończenie4 = new RokZakończenia();
		
		Zatrudnienie zatrudnienie1 = new Zatrudnienie(1976, zakończenie1,zespół1, muzyk1);
		Zatrudnienie zatrudnienie2 = new Zatrudnienie(1965, zakończenie2, zespół2, muzyk2);
		Zatrudnienie zatrudnienie3 = new Zatrudnienie(1987, zakończenie3, zespół3, muzyk3);
		Zatrudnienie zatrudnienie4 = new Zatrudnienie(1987, zakończenie4, zespół1, muzyk4);
		
		
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
		
		PłytaGatunkuRock.utwórzPłytęGatunkuRock(płyta1);
		PłytaGatunkuRock.utwórzPłytęGatunkuRock(płyta2);
		//PłytaGatunkuRock.utwórzPłytęGatunkuRock(płyta2);
		
		PłytaGatunkuMetal.utwórzPłytęGatunkuMetal(płyta1);
		PłytaGatunkuMetal.utwórzPłytęGatunkuMetal(płyta3);
		
		PłytaGatunkuRap.utwórzPłytęGatunkuRap(płyta3);
		
		
		zakup1.addPłyta(płyta1);
		zakup1.addPłyta(płyta2);
		zakup1.addPłyta(płyta3);
		zakup2.addPłyta(płyta2);
		zakup3.addPłyta(płyta1);
		zakup4.addPłyta(płyta1);
		zakup4.addPłyta(płyta2);
		
		
		zespół1.addPłyta(płyta3);
		zespół2.addPłyta(płyta1);
		zespół3.addPłyta(płyta2);
		
		
		wytwórnia1.addPłytaKwalif(płyta1);
		wytwórnia2.addPłytaKwalif(płyta2);
		wytwórnia3.addPłytaKwalif(płyta3);
		
		
		System.out.println(klient1);
		System.out.println(klient3);
		System.out.println(pracownik1);
		
	//	System.out.println(klient1.getData());
	//	System.out.println(pracownik1.getData() + "\n");				//polimorfizm
		
		
		System.out.println(zakup1);
		System.out.println(zakup2);
		System.out.println(zakup3);
		System.out.println(zakup4);
		
		System.out.println(wytwórnia1);
		System.out.println(wytwórnia2);
		System.out.println(wytwórnia3);
		
		
		
		System.out.println(zatrudnienie1);
		System.out.println(zatrudnienie2);
		System.out.println(zatrudnienie3);
		System.out.println(zatrudnienie4);
		
		System.out.println(płyta1);
		System.out.println(płyta2);
		System.out.println(płyta3);

		System.out.println(zespół1);
		System.out.println(zespół2);
		System.out.println(zespół3);
		
		System.out.println(muzyk1);
		System.out.println(muzyk2);
		System.out.println(muzyk3);
		System.out.println(muzyk4);
		
		
		Muzyk.SearchByName("Axl");					//szukanie muzyka po imieniu
		Muzyk.SearchBySurname("Scott");
		
		Klient.SearchByName("Jan");					//szukanie klienta po imieniu
		Klient.SearchBySurname("Nowak");
		
		Pracownik.SearchByName("Krzysztof");
		Pracownik.SearchBySurname("Stępień");
		
		Zespół.SearchByBand("AC/DC");
		
		Płyta a = wytwórnia1.searchByCDsName("Highway to Hell");	//wyszukiwanie detali płyty po tytule za pomocą asocjacji kwalifikowanej
		System.out.println("Szukałeś: " + a + "\n");
		
		
		
	
		/*
		Zespół.pokażEkstensjeZespół();
		Zatrudnienie.pokażEkstensjeZatrudnienie();
		Zakup.pokażEkstensjeZakup();
		Wytwórnia.pokażEkstensjeWytwórnia();
		RokZakończenia.pokażEkstensjeRokZakończenia();
		Pracownik.pokażEkstensjePracownik();
		PłytaGatunkuRock.pokażEkstensjeRock();
		Płyta.pokażEkstensjePłyta();
		Osoba.pokażEkstensjOsoba();
		Muzyk.pokażMuzykEkstensja();
		Klient.pokażKlientEkstensja();
		Email.pokażEmailEkstensja();
		BudynekWytwórni.pokażBudynekEkstensja();
		*/
		
	
		
	}}

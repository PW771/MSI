import java.time.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public abstract class Osoba {
private String imie;
private String nazwisko;
public ArrayList<Zakup>zakup=new ArrayList<Zakup>();
private static HashSet<Zakup>wszystkieZakupy = new HashSet<Zakup>();
public ArrayList<Zakup>zakup2=new ArrayList<Zakup>();
private static HashSet<Zakup>wszystkieZakupy2 = new HashSet<Zakup>();


public String getImie() {
	return imie;
}
public void setImie(String imie) {
	this.imie = imie;
}
public String getNazwisko() {
	return nazwisko;
}
public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
}

public abstract LocalDate getData();

public void addZakupKlient(Zakup noweZakupy) throws Exception {
	if(!zakup.contains(noweZakupy)){
		if(wszystkieZakupy.contains(noweZakupy)){
			
			throw new Exception("Ten zakup już ma dodanego klienta");
		}
		zakup.add(noweZakupy);
		wszystkieZakupy.add(noweZakupy);
		
	}

}
public void addZakupPracownik(Zakup noweZakupy) throws Exception {
	if(!zakup2.contains(noweZakupy)){
		if(wszystkieZakupy2.contains(noweZakupy)){
			
			throw new Exception("Ten zakup już ma dodanego pracownika");
		}
		zakup2.add(noweZakupy);
		wszystkieZakupy2.add(noweZakupy);
		
	}

}

public static Vector<Osoba> ekstensja = new Vector<Osoba>();			//ekstensja

public static void addOsoba(Osoba osoba){
	ekstensja.add(osoba);
	
}

public static void removeOsoba(Osoba osoba){
	ekstensja.remove(osoba);
	
}
public static void pokażOsoba(){
	System.out.println("Ekstensja dla klasy Osoba to: ");
	for(Osoba osoba : ekstensja){
		System.out.println(osoba);
}


}


public Osoba(String imie, String nazwisko){
	setImie(imie);
	setNazwisko(nazwisko);
	addOsoba(this);
	
}
}

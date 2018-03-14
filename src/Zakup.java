import java.util.ArrayList;
import java.util.Vector;

public class Zakup {

	private int id;
	public ArrayList<Płyta>płyta=new ArrayList<Płyta>();
	private Osoba klient;
	private Osoba pracownik;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Osoba getKlient() {
		return klient;
	}
	public void setKlient(Osoba klient) {
		this.klient = klient;
	}
	public Osoba getPracownik() {
		return pracownik;
	}
	public void setPracownik(Osoba pracownik) {
		this.pracownik = pracownik;
	}
	public double getSuma() {
		double suma=0;
		for(Płyta a : płyta){
			suma+=a.getCena();	
		}
		return suma;

	}

	
	public void addPłyta(Płyta nowaPłyta){
		if(!płyta.contains(nowaPłyta)){
			płyta.add(nowaPłyta);
			nowaPłyta.addZakup(this);
		}
		
}
	public static Vector<Zakup> ekstensja = new Vector<Zakup>();			//ekstensja
	
	public static void addZakup(Zakup zakup){
		ekstensja.add(zakup);
		
	}
	
	public static void removeZespół(Zakup zakup){
		ekstensja.remove(zakup);
		
	}
	public static void pokażZakup(){
		System.out.println("Ekstensja dla klasy Zakup to: ");
		for(Zakup zakup : ekstensja){
			System.out.println(zakup);
	}
	
	
	}
	
	public String toString(){
		String result =" ID zakupów: " + getId() + " Łączny koszt tego zakupu: " + getSuma() + " zł " + "\n" + " Lista produktów: " + "\n";
		for(Płyta a : płyta){
			result+=" Płyta: " + a.getNazwa() + " Cena: " + a.getCena() + " zł" + "\n";		
		}
		return result;
	
	}
	public Zakup(int id, Osoba klient, Osoba pracownik){
		setId(id);
		setKlient(klient);
		setPracownik(pracownik);
		addZakup(this);

		
	}
	
	
	
	
	
}

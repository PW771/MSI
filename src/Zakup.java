import java.util.ArrayList;
import java.util.Vector;

public class Zakup {

	private int id;
	public ArrayList<Plyta>plyta=new ArrayList<Plyta>();
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
		for(Plyta a : plyta){
			suma+=a.getCena();	
		}
		return suma;

	}

	
	public void addPlyta(Plyta nowaPlyta){
		if(!plyta.contains(nowaPlyta)){
			plyta.add(nowaPlyta);
			nowaPlyta.addZakup(this);
		}
		
}
	public static Vector<Zakup> ekstensja = new Vector<Zakup>();			//ekstensja
	
	public static void addZakup(Zakup zakup){
		ekstensja.add(zakup);
		
	}
	
	public static void removeZespol(Zakup zakup){
		ekstensja.remove(zakup);
		
	}
	public static void pokażZakup(){
		System.out.println("Ekstensja dla klasy Zakup to: ");
		for(Zakup zakup : ekstensja){
			System.out.println(zakup);
	}
	
	
	}
	
	public String toString(){
		String result =" ID zakupow: " + getId() + " laczny koszt tego zakupu: " + getSuma() + " zl " + "\n" + " Lista produktow: " + "\n";
		for(Plyta a : plyta){
			result+=" Plyta: " + a.getNazwa() + " Cena: " + a.getCena() + " zl" + "\n";		
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

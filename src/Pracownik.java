import java.time.LocalDate;
import java.util.Vector;

public class Pracownik extends Osoba {


	private long PESEL;
	private long telefon;
	private LocalDate data;
	private int pensja;
	
	
	public long getPESEL() {
		return PESEL;
	}
	public void setPESEL(long PESEL) {
		this.PESEL = PESEL;
	}
	public long getTelefon() {
		return telefon;
	}
	public void setTelefon(long telefon) {
		this.telefon = telefon;
	}
	private void setData(LocalDate date) {
		this.data=date;
		
	}
	@Override
	public LocalDate getData() {
		return getDataZatrudnienia();
	}
	public LocalDate getDataZatrudnienia(){
		
		return data;
		
	}
	
	public int getPensja() {
		return pensja;
	}
	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	public static Vector<Pracownik> ekstensja = new Vector<Pracownik>();			//ekstensja
	
	public static void addPracownik(Osoba pracownik){
		ekstensja.add((Pracownik) pracownik);
		
	}
	
	public static void removePracownik(Osoba pracownik){
		ekstensja.remove(pracownik);
		
	}
	public static void pokażEkstensje(){
		System.out.println("Ekstensja dla klasy Pracownik to: ");
		for(Pracownik pracownik : ekstensja){
			System.out.println(pracownik);
	}
	
	
	}
	public static void SearchByName(String i){
		for(Pracownik pracownik : ekstensja){
		if(i.equals(pracownik.getImie())){
		System.out.println("Szukales: " + pracownik);
			}
		}
			
		
	}
	public static void SearchBySurname(String i){
		for(Pracownik pracownik : ekstensja){
		if(i.equals(pracownik.getNazwisko())){
		System.out.println("Szukales: " + pracownik);
		}
		}
	
		
	}
	
	
	public String toString(){
		String result = "Pracownik: " + getImie() + " " + getNazwisko() + " PESEL: " + getPESEL() + " Telefon: " + getTelefon() + " Data zatrudnienia: " + getData() + " Pensja: "+ getPensja() +" zl" + "\n" + " Obslugiwane zakupy:" + "\n";
		for(Zakup a : zakup2){
			result+= " ID zakupu: " + a.getId() + " laczny koszt tego zakupu: " + a.getSuma() + " zl " +"\n";
		}
		return result;
	}
	
	
	public Pracownik(String imie, String nazwisko,long PESEL, long telefon, LocalDate date, int pensja) {
		super(imie, nazwisko);
		setPESEL(PESEL);
		setTelefon(telefon);
		setData(date);
		setPensja(pensja);
		addPracownik(this);
		
	}

	
}

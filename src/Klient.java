import java.time.LocalDate;
import java.util.Vector;

public class Klient extends Osoba {

	private Email email;
	private LocalDate data;
	
	
	
	public boolean isStalyKlient() {			//metoda bool czy klient wydal wystarczajaco pieniedzy by byc kwalifikowanym jako staly klient
		
	if(getIloscZakupow()>1000){
		
		return true;
	}
	else
		return false;
	
	}
	
	public double getIloscZakupow() {
		double ilosczakupow=0;
		for(Zakup a : zakup){
			ilosczakupow+=a.getSuma();
			
		}
		
		return ilosczakupow;
	}

	
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	
	private void setData(LocalDate date) {
		this.data = date;
		
	}
	@Override
	public LocalDate getData() {
		return getDataDodania();
	}
	public LocalDate getDataDodania(){
		return data;
		
	}
	
public static Vector<Klient> ekstensja = new Vector<Klient>();		//ekstensja
	
	public static void addKlient(Osoba klient){
		ekstensja.add((Klient) klient);
		
	}
	
	public static void removeKlient(Osoba klient){
		ekstensja.remove(klient);
		
	}
	public static void pokażKlient(){
		System.out.println("Ekstensja dla klasy Klient to: ");
		for(Klient klient : ekstensja){
			System.out.println(klient);
	}
		
	}
	
	public static void SearchByName(String i){
		for(Klient klient : ekstensja){
		if(i.equals(klient.getImie())){
		System.out.println("Szukales: " + klient);
			}
		}
			
		
	}
	public static void SearchBySurname(String i){
		for(Klient klient : ekstensja){
		if(i.equals(klient.getNazwisko())){
		System.out.println("Szukales: " + klient);
		}
		}
	
		
	}
	
	
	public String toString(){
		String result = ("Klient: " + getImie() + " " + getNazwisko() + " Czy jest stalym klientem: " + 
	isStalyKlient() + " Lacznie wydana kwota do tej pory: " + getIloscZakupow() + " zl " + "Email: " + getEmail() + " Data dodania klienta: "+ getDataDodania() + "\n");
		for(Zakup a : zakup){
			result+= " ID zakupu: " + a.getId() + " Laczny koszt tego zakupu: " + a.getSuma() + " zl " + "\n";
		}
		
		return result;
	}
	
	public Klient(String imie, String nazwisko, Email email, LocalDate date) {
		super(imie, nazwisko);
		setEmail(email);
		setData(date);
		addKlient(this);
	}
	


	
	
	
	
	
}

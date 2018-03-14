import java.time.LocalDate;
import java.util.Vector;

public class Klient extends Osoba {

	private Email email;
	private LocalDate data;
	
	
	
	public boolean isStałyKlient() {			//metoda bool czy klient wydał wystarczająco pieniędzy by być kwalifikowanym jako stały klient
		
	if(getIlośćzakupów()>1000){
		
		return true;
	}
	else
		return false;
	
	}
	
	public double getIlośćzakupów() {
		double ilośćzakupów=0;
		for(Zakup a : zakup){
			ilośćzakupów+=a.getSuma();
			
		}
		
		return ilośćzakupów;
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
		System.out.println("Szukałeś: " + klient);
			}
		}
			
		
	}
	public static void SearchBySurname(String i){
		for(Klient klient : ekstensja){
		if(i.equals(klient.getNazwisko())){
		System.out.println("Szukałeś: " + klient);
		}
		}
	
		
	}
	
	
	public String toString(){
		String result = ("Klient: " + getImie() + " " + getNazwisko() + " Czy jest stałym klientem: " + 
	isStałyKlient() + " Łącznie wydana kwota do tej pory: " + getIlośćzakupów() + " zł " + "Email: " + getEmail() + " Data dodania klienta: "+ getDataDodania() + "\n");
		for(Zakup a : zakup){
			result+= " ID zakupu: " + a.getId() + " Łączny koszt tego zakupu: " + a.getSuma() + " zł " + "\n";
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

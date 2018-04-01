import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

public class Muzyk extends Osoba {

	
	public ArrayList<Zatrudnienie>zatrudniony=new ArrayList<Zatrudnienie>();
	
	
	public void addZatrudnienie(Zatrudnienie noweZatrudnienie){
		if(!zatrudniony.contains(noweZatrudnienie)){
			zatrudniony.add(noweZatrudnienie);
			noweZatrudnienie.addMuzyk(this);
				
		}
	}

	
public static Vector<Muzyk> ekstensja = new Vector<Muzyk>();
	
	public static void addMuzyk(Muzyk muzyk){
		ekstensja.add(muzyk);
		
	}
	
	public static void removeMuzyk(Muzyk muzyk){
		ekstensja.remove(muzyk);
		
	}
	public static void pokażMuzyk(){
		System.out.println("Ekstensja dla klasy Muzyk to: ");
		for(Muzyk muzyk : ekstensja){
			System.out.println(muzyk);
	}
		
	}

	
	public static void SearchByName(String i){
		for(Muzyk muzyk : ekstensja){
		if(i.equals(muzyk.getImie())){
		System.out.println("Szukales: " + muzyk);
			}
		}
			
		
	}
	public static void SearchBySurname(String i){
		for(Muzyk muzyk : ekstensja){
		if(i.equals(muzyk.getNazwisko())){
		System.out.println("Szukales: " + muzyk);
			}
		}
			
		
	}
	
	public String toString(){
		String result = ("Muzyk: " + getImie() + " " + getNazwisko() + "\n");
		
		return result;
	}
	

	
	public Muzyk(String imie, String nazwisko){
		super(imie, nazwisko);
		addMuzyk(this);
		
		
	}

	public LocalDate getData() {
		
		return null;
	}



	

	
	
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Wytwornia {
	String nazwa;
	private  TreeMap<String, Plyta> plytaKwalif = new TreeMap<String, Plyta>();
	private HashSet<Plyta>wszystkiePlyty = new HashSet<Plyta>();
	private ArrayList<BudynekWytworni> budynekWytworni = new ArrayList<BudynekWytworni>();
		
	
	public String getNazwa(){
	return nazwa;
	
	}
	public void setNazwa(String nazwa){
	this.nazwa=nazwa;
	
	
	}
	
	public void addPlytaKwalif(Plyta nowaPlyta) throws Exception{
		if(!plytaKwalif.containsKey(nowaPlyta.getNazwa())){
			if(wszystkiePlyty.contains(nowaPlyta)){
				 throw new Exception ("Ta plyta już ma wytwornie!");
				
			}
			plytaKwalif.put(nowaPlyta.getNazwa(), nowaPlyta);
			nowaPlyta.addWytwornia(this);
			wszystkiePlyty.add(nowaPlyta);
		}
	}
		
		
	public Plyta searchByCDsName(String nazwa) throws Exception{
		if(!plytaKwalif.containsKey(nazwa)){
			throw new Exception("Nie odnaleziono plyty o tej nazwie " + nazwa);
		}
		return plytaKwalif.get(nazwa);
		
	}
	
	
	public void addBudynekWytworni(BudynekWytworni budynek) throws Exception{
		if(!budynekWytworni.contains(budynek)){
			budynekWytworni.add(budynek);
		}
			else{
				throw new Exception("Wytwornia już jest dodana do tego budynku");
			}
			
		}
	
		
	
	public String toString(){
		String result = "Wytwornia: " + getNazwa() +  "\n";
		for(BudynekWytworni a : budynekWytworni){
			result+= " Lokalizacja budynku: " + a.getKraj() + " "+ a.getMiasto()+ " " + a.getUlica() + " " + a.getNumerUlicy() + "\n";
		}
		for(Map.Entry<String,Plyta> entry : plytaKwalif.entrySet()) {
			  String NazwaPlyty = entry.getKey();

			  result += " Plyta: " + NazwaPlyty + "\n";
			}

		return result;
		
	}
	public static Vector<Wytwornia> ekstensja = new Vector<Wytwornia>();			//ekstensja
	
	public static void addWytwornia(Wytwornia wytwornia){
		ekstensja.add(wytwornia);
		
	}
	
	public static void removeWytwornia(Wytwornia  wytwornia){
		ekstensja.remove(wytwornia);
		
	}
	public static void pokażEkstensje(){
		System.out.println("Ekstensja dla klasy Wytwornia to: ");
		for(Wytwornia wytwornia : ekstensja){
			System.out.println(wytwornia);
	}
	
	
	}

	
	public Wytwornia(String nazwa){
		setNazwa(nazwa);
		addWytwornia(this);
	}
}

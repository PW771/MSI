import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Wytwórnia {
	String nazwa;
	private  TreeMap<String, Płyta> płytaKwalif = new TreeMap<String, Płyta>();
	private HashSet<Płyta>wszystkiePłyty = new HashSet<Płyta>();
	private ArrayList<BudynekWytwórni> budynekWytwórni = new ArrayList<BudynekWytwórni>();
		
	
	public String getNazwa(){
	return nazwa;
	
	}
	public void setNazwa(String nazwa){
	this.nazwa=nazwa;
	
	
	}
	
	public void addPłytaKwalif(Płyta nowaPłyta) throws Exception{
		if(!płytaKwalif.containsKey(nowaPłyta.getNazwa())){
			if(wszystkiePłyty.contains(nowaPłyta)){
				 throw new Exception ("Ta płyta już ma wytwórnię!");
				
			}
			płytaKwalif.put(nowaPłyta.getNazwa(), nowaPłyta);
			nowaPłyta.addWytwórnia(this);
			wszystkiePłyty.add(nowaPłyta);
		}
	}
		
		
	public Płyta searchByCDsName(String nazwa) throws Exception{
		if(!płytaKwalif.containsKey(nazwa)){
			throw new Exception("Nie odnaleziono płyty o tej nazwie " + nazwa);
		}
		return płytaKwalif.get(nazwa);
		
	}
	
	
	public void addBudynekWytwórni(BudynekWytwórni budynek) throws Exception{
		if(!budynekWytwórni.contains(budynek)){
			budynekWytwórni.add(budynek);
		}
			else{
				throw new Exception("Wytwórnia już jest dodana do tego budynku");
			}
			
		}
	
		
	
	public String toString(){
		String result = "Wytwórnia: " + getNazwa() +  "\n";
		for(BudynekWytwórni a : budynekWytwórni){
			result+= " Lokalizacja budynku: " + a.getKraj() + " "+ a.getMiasto()+ " " + a.getUlica() + " " + a.getNumerUlicy() + "\n";
		}
		for(Map.Entry<String,Płyta> entry : płytaKwalif.entrySet()) {
			  String NazwaPłyty = entry.getKey();

			  result += " Płyta: " + NazwaPłyty + "\n";
			}

		return result;
		
	}
	public static Vector<Wytwórnia> ekstensja = new Vector<Wytwórnia>();			//ekstensja
	
	public static void addWytwórnia(Wytwórnia wytwórnia){
		ekstensja.add(wytwórnia);
		
	}
	
	public static void removeWytwórnia(Wytwórnia  wytwórnia){
		ekstensja.remove(wytwórnia);
		
	}
	public static void pokażEkstensje(){
		System.out.println("Ekstensja dla klasy Wytwórnia to: ");
		for(Wytwórnia wytwórnia : ekstensja){
			System.out.println(wytwórnia);
	}
	
	
	}

	
	public Wytwórnia(String nazwa){
		setNazwa(nazwa);
		addWytwórnia(this);
	}
}

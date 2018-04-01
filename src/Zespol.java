import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Zespol {
	private String nazwa;

	public ArrayList<Plyta>plyta=new ArrayList<Plyta>();
	private static HashSet<Plyta>wszystkiePlyty = new HashSet<Plyta>();
	public ArrayList<Zatrudnienie>zatrudniony=new ArrayList<Zatrudnienie>();
	
	public String getNazwa(){
		return nazwa;
	}
	public void setNazwa(String nazwa){
		this.nazwa=nazwa;
		
	}
	
	
	public void addZatrudnienie(Zatrudnienie noweZatrudnienie){
		if(!zatrudniony.contains(noweZatrudnienie)){
			zatrudniony.add(noweZatrudnienie);
			noweZatrudnienie.addZespol(this);
				
		}
	}
		

		public void addPlyta(Plyta nowaPlyta) throws Exception{
			if(!plyta.contains(nowaPlyta)){
				if(wszystkiePlyty.contains(nowaPlyta)){
					 throw new Exception ("Ta plyta już ma zespol!");
					
				}
				plyta.add(nowaPlyta);
				wszystkiePlyty.add(nowaPlyta);
			}
			
	}

	
	public static Vector<Zespol> ekstensja = new Vector<Zespol>();			//ekstensja
	
	public static void addZespol(Zespol zespol){
		ekstensja.add(zespol);
		
	}
	
	public static void removeZespol(Zespol zespol){
		ekstensja.remove(zespol);
		
	}
	public static void pokażZespol(){
		System.out.println("Ekstensja dla klasy Zespol to: ");
		for(Zespol zespol : ekstensja){
			System.out.println(zespol);
	}
	
	
	}
	
	public static void SearchByBand(String i){
		for(Zespol zespol : ekstensja){
		if(i.equals(zespol.getNazwa())){
			System.out.println("Szukales: " + zespol);
			}
		}
			
	}
	
	
	public String toString(){
		String result = "Zespol: " + getNazwa() + "\n";	
		for(Plyta a : plyta){
			result+= " Plyty zespolu: " + a.getNazwa() + " Czas od wydania: " + a.getCzas_od_wydania() + " lat" + "\n";
		}
		return result;
		
		
	}
	
	public Zespol(String nazwa){
		
		setNazwa(nazwa);
		addZespol(this);

		
	}
	

	
}	
		





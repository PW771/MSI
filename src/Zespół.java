import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Zespół {
	private String nazwa;

	public ArrayList<Płyta>płyta=new ArrayList<Płyta>();
	private static HashSet<Płyta>wszystkiePłyty = new HashSet<Płyta>();
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
			noweZatrudnienie.addZespół(this);
				
		}
	}
		

		public void addPłyta(Płyta nowaPłyta) throws Exception{
			if(!płyta.contains(nowaPłyta)){
				if(wszystkiePłyty.contains(nowaPłyta)){
					 throw new Exception ("Ta płyta już ma zespół!");
					
				}
				płyta.add(nowaPłyta);
				wszystkiePłyty.add(nowaPłyta);
			}
			
	}

	
	public static Vector<Zespół> ekstensja = new Vector<Zespół>();			//ekstensja
	
	public static void addZespół(Zespół zespół){
		ekstensja.add(zespół);
		
	}
	
	public static void removeZespół(Zespół zespół){
		ekstensja.remove(zespół);
		
	}
	public static void pokażZespół(){
		System.out.println("Ekstensja dla klasy Zespół to: ");
		for(Zespół zespół : ekstensja){
			System.out.println(zespół);
	}
	
	
	}
	
	public static void SearchByBand(String i){
		for(Zespół zespół : ekstensja){
		if(i.equals(zespół.getNazwa())){
			System.out.println("Szukałeś: " + zespół);
			}
		}
			
	}
	
	
	public String toString(){
		String result = "Zespół: " + getNazwa() + "\n";	
		for(Płyta a : płyta){
			result+= " Płyty zespołu: " + a.getNazwa() + " Czas od wydania: " + a.getCzas_od_wydania() + " lat" + "\n";
		}
		return result;
		
		
	}
	
	public Zespół(String nazwa){
		
		setNazwa(nazwa);
		addZespół(this);

		
	}
	

	
}	
		





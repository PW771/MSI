import java.util.HashSet;
import java.util.Vector;

public class PlytaGatunkuRock {

	private static HashSet<Plyta>wszystkiePlytyGatunkuRock = new HashSet<Plyta>();
	
	public static PlytaGatunkuRock utworzPlyteGatunkuRock(Plyta plyta) throws Exception{
		
		if(plyta==null){
			
			throw new Exception("Brak plyty");
		}
		
		if(wszystkiePlytyGatunkuRock.contains(plyta)){
			throw new Exception("Ta plyta a już przypisany gatunek rock");
		}
			wszystkiePlytyGatunkuRock.add(plyta);
	PlytaGatunkuRock a = new PlytaGatunkuRock(plyta);		
	
	
	plyta.addPlytaGatunkuRock(a);
	
	return a;
}
	
	public static Vector<PlytaGatunkuRock> ekstensja = new Vector<PlytaGatunkuRock>();			//ekstensja
	
	public static void addRock(PlytaGatunkuRock rock){
		ekstensja.add(rock);
		
	}
	
	public static void removeRock(PlytaGatunkuRock rock){
		ekstensja.remove(rock);
		
	}
	public static void pokażRock(){
		System.out.println("Ekstensja dla klasy PlytaGatunkuRock to: ");
		for(PlytaGatunkuRock rock : ekstensja){
			System.out.println(rock);
	}
	
	
	}
	public String toString(){

		String result= "Gatunek: Rock";
		return result;
	
}
	
public PlytaGatunkuRock(Plyta plyta) throws Exception{
	if(plyta==null){
		
		throw new Exception("Brak plyty");
	}
	addRock(this);

	
}
}

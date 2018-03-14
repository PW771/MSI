import java.util.HashSet;
import java.util.Vector;

public class PłytaGatunkuRock {

	private static HashSet<Płyta>wszystkiePłytyGatunkuRock = new HashSet<Płyta>();
	
	public static PłytaGatunkuRock utwórzPłytęGatunkuRock(Płyta płyta) throws Exception{
		
		if(płyta==null){
			
			throw new Exception("Brak płyty");
		}
		
		if(wszystkiePłytyGatunkuRock.contains(płyta)){
			throw new Exception("Ta płyta a już przypisany gatunek rock");
		}
			wszystkiePłytyGatunkuRock.add(płyta);
	PłytaGatunkuRock a = new PłytaGatunkuRock(płyta);		
	
	
	płyta.addPłytaGatunkuRock(a);
	
	return a;
}
	
	public static Vector<PłytaGatunkuRock> ekstensja = new Vector<PłytaGatunkuRock>();			//ekstensja
	
	public static void addRock(PłytaGatunkuRock rock){
		ekstensja.add(rock);
		
	}
	
	public static void removeRock(PłytaGatunkuRock rock){
		ekstensja.remove(rock);
		
	}
	public static void pokażRock(){
		System.out.println("Ekstensja dla klasy PłytaGatunkuRock to: ");
		for(PłytaGatunkuRock rock : ekstensja){
			System.out.println(rock);
	}
	
	
	}
	public String toString(){

		String result= "Gatunek: Rock";
		return result;
	
}
	
public PłytaGatunkuRock(Płyta płyta) throws Exception{
	if(płyta==null){
		
		throw new Exception("Brak płyty");
	}
	addRock(this);

	
}
}

import java.util.HashSet;
import java.util.Vector;

public class PłytaGatunkuMetal {
	
private static HashSet<Płyta>wszystkiePłytyGatunkuMetal = new HashSet<Płyta>();

public static PłytaGatunkuMetal utwórzPłytęGatunkuMetal(Płyta płyta) throws Exception{
	
	if(płyta==null){
		
		throw new Exception("Brak płyty");
	}
PłytaGatunkuMetal a = new PłytaGatunkuMetal(płyta);	

if(wszystkiePłytyGatunkuMetal.contains(płyta)){
	throw new Exception("Ta płyta a już przypisany gatunek metal");
}
	wszystkiePłytyGatunkuMetal.add(płyta);


płyta.addPłytaGatunkuMetal(a);

return a;
}
public static Vector<PłytaGatunkuMetal> ekstensja = new Vector<PłytaGatunkuMetal>();			//ekstensja

public static void addMetal(PłytaGatunkuMetal metal){
	ekstensja.add(metal);
	
}

public static void removeMetal(PłytaGatunkuMetal metal){
	ekstensja.remove(metal);
	
}
public static void pokażMetal(){
	System.out.println("Ekstensja dla klasy PłytaGatunkuMetal to: ");
	for(PłytaGatunkuMetal metal : ekstensja){
		System.out.println(metal);
	
	}
}

public String toString(){

	String result= "Gatunek: Metal";
	return result;

}

public PłytaGatunkuMetal(Płyta płyta) throws Exception{
if(płyta==null){
	
	throw new Exception("Brak płyty");
}
addMetal(this);


}
}

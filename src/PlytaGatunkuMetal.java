import java.util.HashSet;
import java.util.Vector;

public class PlytaGatunkuMetal {
	
private static HashSet<Plyta>wszystkiePlytyGatunkuMetal = new HashSet<Plyta>();

public static PlytaGatunkuMetal utworzPlyteGatunkuMetal(Plyta plyta) throws Exception{
	
	if(plyta==null){
		
		throw new Exception("Brak plyty");
	}
PlytaGatunkuMetal a = new PlytaGatunkuMetal(plyta);	

if(wszystkiePlytyGatunkuMetal.contains(plyta)){
	throw new Exception("Ta plyta a już przypisany gatunek metal");
}
	wszystkiePlytyGatunkuMetal.add(plyta);


plyta.addPlytaGatunkuMetal(a);

return a;
}
public static Vector<PlytaGatunkuMetal> ekstensja = new Vector<PlytaGatunkuMetal>();			//ekstensja

public static void addMetal(PlytaGatunkuMetal metal){
	ekstensja.add(metal);
	
}

public static void removeMetal(PlytaGatunkuMetal metal){
	ekstensja.remove(metal);
	
}
public static void pokażMetal(){
	System.out.println("Ekstensja dla klasy PlytaGatunkuMetal to: ");
	for(PlytaGatunkuMetal metal : ekstensja){
		System.out.println(metal);
	
	}
}

public String toString(){

	String result= "Gatunek: Metal";
	return result;

}

public PlytaGatunkuMetal(Plyta plyta) throws Exception{
if(plyta==null){
	
	throw new Exception("Brak plyty");
}
addMetal(this);


}
}

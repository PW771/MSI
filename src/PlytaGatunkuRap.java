import java.util.HashSet;
import java.util.Vector;

public class PlytaGatunkuRap {
	
private static HashSet<Plyta>wszystkiePlytyGatunkuRap = new HashSet<Plyta>();

public static PlytaGatunkuRap utworzPlyteGatunkuRap(Plyta plyta) throws Exception{
	
	if(plyta==null){
		
		throw new Exception("Brak plyty");
	}
PlytaGatunkuRap a = new PlytaGatunkuRap(plyta);	

if(wszystkiePlytyGatunkuRap.contains(plyta)){
	throw new Exception("Ta plyta ma już przypisany gatunek rap");
}
	wszystkiePlytyGatunkuRap.add(plyta);


plyta.addPlytaGatunkuRap(a);

return a;
}
public static Vector<PlytaGatunkuRap> ekstensja = new Vector<PlytaGatunkuRap>();			//ekstensja

public static void addRap(PlytaGatunkuRap rap){
	ekstensja.add(rap);
	
}

public static void removeRap(PlytaGatunkuRap rap){
	ekstensja.remove(rap);
	
}
public static void pokażRap(){
	System.out.println("Ekstensja dla klasy PlytaGatunkuRap to: ");
	for(PlytaGatunkuRap rap : ekstensja){
		System.out.println(rap);
	
	}
}

public String toString(){

	String result= "Gatunek: Rap";
	return result;

}

public PlytaGatunkuRap(Plyta plyta) throws Exception{
if(plyta==null){
	
	throw new Exception("Brak plyty");
}
addRap(this);


}
}

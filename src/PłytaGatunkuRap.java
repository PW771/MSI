import java.util.HashSet;
import java.util.Vector;

public class PłytaGatunkuRap {
	
private static HashSet<Płyta>wszystkiePłytyGatunkuRap = new HashSet<Płyta>();

public static PłytaGatunkuRap utwórzPłytęGatunkuRap(Płyta płyta) throws Exception{
	
	if(płyta==null){
		
		throw new Exception("Brak płyty");
	}
PłytaGatunkuRap a = new PłytaGatunkuRap(płyta);	

if(wszystkiePłytyGatunkuRap.contains(płyta)){
	throw new Exception("Ta płyta ma już przypisany gatunek rap");
}
	wszystkiePłytyGatunkuRap.add(płyta);


płyta.addPłytaGatunkuRap(a);

return a;
}
public static Vector<PłytaGatunkuRap> ekstensja = new Vector<PłytaGatunkuRap>();			//ekstensja

public static void addRap(PłytaGatunkuRap rap){
	ekstensja.add(rap);
	
}

public static void removeRap(PłytaGatunkuRap rap){
	ekstensja.remove(rap);
	
}
public static void pokażRap(){
	System.out.println("Ekstensja dla klasy PłytaGatunkuRap to: ");
	for(PłytaGatunkuRap rap : ekstensja){
		System.out.println(rap);
	
	}
}

public String toString(){

	String result= "Gatunek: Rap";
	return result;

}

public PłytaGatunkuRap(Płyta płyta) throws Exception{
if(płyta==null){
	
	throw new Exception("Brak płyty");
}
addRap(this);


}
}

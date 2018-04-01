import java.util.Vector;

public class RokZakonczenia {
private int rok;

public int getRok() {
	return rok;
}

public void setRok(int rok) {
	this.rok = rok;
}

public String toString(){
	if(rok==0){
		return "aktualnie";
	}
	else

		return ""+ rok;
	
}

public static Vector<RokZakonczenia> ekstensja = new Vector<RokZakonczenia>();			//ekstensja

public static void addRokZakonczenia(RokZakonczenia rok){
	ekstensja.add(rok);
	
}

public static void removeRokZakonczenia(RokZakonczenia rok){
	ekstensja.remove(rok);
	
}
public static void pokażRokZakonczenia(){
	System.out.println("Ekstensja dla klasy RokZakonczenia to: ");
	for(RokZakonczenia rok : ekstensja){
		System.out.println(rok);
}


}

public RokZakonczenia(int rok){
	
	setRok(rok);
	addRokZakonczenia(this);

	
}
public RokZakonczenia(){
	addRokZakonczenia(this);
	
	


	
}
}

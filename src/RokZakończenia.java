import java.util.Vector;

public class RokZakończenia {
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

public static Vector<RokZakończenia> ekstensja = new Vector<RokZakończenia>();			//ekstensja

public static void addRokZakończenia(RokZakończenia rok){
	ekstensja.add(rok);
	
}

public static void removeRokZakończenia(RokZakończenia rok){
	ekstensja.remove(rok);
	
}
public static void pokażRokZakończenia(){
	System.out.println("Ekstensja dla klasy RokZakończenia to: ");
	for(RokZakończenia rok : ekstensja){
		System.out.println(rok);
}


}

public RokZakończenia(int rok){
	
	setRok(rok);
	addRokZakończenia(this);

	
}
public RokZakończenia(){
	addRokZakończenia(this);
	
	


	
}
}

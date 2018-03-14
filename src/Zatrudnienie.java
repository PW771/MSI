import java.util.Vector;

public class Zatrudnienie {
private int rokRozpoczęcia;
RokZakończenia rokZakończenia;
private Zespół zespół;
private Muzyk muzyk;


public int getRozpoczęcie(){			
	return rokRozpoczęcia;
}

public void setRozpoczęcie(int rokRozpoczęcia){
	
	this.rokRozpoczęcia=rokRozpoczęcia;
}

public RokZakończenia getZakończenie(){			
	return rokZakończenia;
}

public void setZakończenie(RokZakończenia rokZakończenia){
	
	this.rokZakończenia=rokZakończenia;
}


public void addZespół(Zespół Nowyzespół){
	Nowyzespół.addZatrudnienie(this);
}
public void addMuzyk(Muzyk Nowymuzyk){
	Nowymuzyk.addZatrudnienie(this);
}


public Zespół getZespół(){			
	return zespół;
}

public void setZespół(Zespół zespół){
	
	this.zespół = zespół;
}
public Muzyk getMuzyk(){			
	return muzyk;
}

public void setMuzyk(Muzyk muzyk){
	
	this.muzyk = muzyk;
}

private static Vector<Zatrudnienie> ekstensja = new Vector<Zatrudnienie>();		//ekstensja

public static void addZatrudnienie(Zatrudnienie zatrudnienie){
	ekstensja.add(zatrudnienie);
	
}

public static void removeZatrudnienie(Zatrudnienie zatrudnienie){
	ekstensja.remove(zatrudnienie);
	
}
public static void pokażZatrudnienie(){
	System.out.println("Ekstensja dla klasy Zatrudnienie to: ");
	for(Zatrudnienie zatrudnienie : ekstensja){
		System.out.println(zatrudnienie);
}


}

	
	
	



public String toString(){
	String result = "Zatrudnienie: " + getRozpoczęcie() + "-" + getZakończenie() +  "\n";
	result += " " + getZespół() + " " + getMuzyk();
	

	
		return result;
	
}


public Zatrudnienie(int rokRozpoczęcia, RokZakończenia rokZakończenia,Zespół zespół, Muzyk muzyk){
	setRozpoczęcie(rokRozpoczęcia);
	setZakończenie(rokZakończenia);
	setZespół(zespół);
	setMuzyk(muzyk);
	addZatrudnienie(this);
	zespół.addZatrudnienie(this);
	muzyk.addZatrudnienie(this);
	
	
}

}


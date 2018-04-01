import java.util.Vector;

public class Zatrudnienie {
private int rokRozpoczecia;
RokZakonczenia rokZakonczenia;
private Zespol zespol;
private Muzyk muzyk;


public int getRozpoczecie(){			
	return rokRozpoczecia;
}

public void setRozpoczecie(int rokRozpoczecia){
	
	this.rokRozpoczecia=rokRozpoczecia;
}

public RokZakonczenia getZakonczenie(){			
	return rokZakonczenia;
}

public void setZakonczenie(RokZakonczenia rokZakonczenia){
	
	this.rokZakonczenia=rokZakonczenia;
}


public void addZespol(Zespol Nowyzespol){
	Nowyzespol.addZatrudnienie(this);
}
public void addMuzyk(Muzyk Nowymuzyk){
	Nowymuzyk.addZatrudnienie(this);
}


public Zespol getZespol(){			
	return zespol;
}

public void setZespol(Zespol zespol){
	
	this.zespol = zespol;
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
	String result = "Zatrudnienie: " + getRozpoczecie() + "-" + getZakonczenie() +  "\n";
	result += " " + getZespol() + " " + getMuzyk();
	

	
		return result;
	
}


public Zatrudnienie(int rokRozpoczecia, RokZakonczenia rokZakonczenia,Zespol zespol, Muzyk muzyk){
	setRozpoczecie(rokRozpoczecia);
	setZakonczenie(rokZakonczenia);
	setZespol(zespol);
	setMuzyk(muzyk);
	addZatrudnienie(this);
	zespol.addZatrudnienie(this);
	muzyk.addZatrudnienie(this);
	
	
}

}


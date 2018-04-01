
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;


public class Plyta{

	private String nazwa;
	private int rok_wydania;
	private Zespol zespol;	
	private  ArrayList<Wytwornia> wytwornia = new ArrayList<Wytwornia>();	
	public ArrayList<Zakup>zakup=new ArrayList<Zakup>();
	private Vector<PlytaGatunkuRock> rock = new Vector<PlytaGatunkuRock>();
	private Vector<PlytaGatunkuRap> rap = new Vector<PlytaGatunkuRap>();
	private Vector<PlytaGatunkuMetal> metal = new Vector<PlytaGatunkuMetal>();
	private double cena;
	
	
	public String getNazwa(){			
		return nazwa;
	}

	public void setNazwa(String nazwa){
		
		this.nazwa=nazwa;
	}

	public int getCzas_od_wydania(){
		int data = Calendar.getInstance().get(Calendar.YEAR);
		int czas_od_wydania=data-rok_wydania;
		return czas_od_wydania;
	}
	public void setRok_Wydania(int rok_wydania){
		this.rok_wydania=rok_wydania;	

	}
	
	
	public Zespol getZespol(){
		return zespol;
		
	}
	
	public void setZespol( Zespol zespol){
	this.zespol=zespol;
		
}
	
	public double getCena(){
		
		return cena;
	}
	public void setCena(double cena){
		
		this.cena=cena;
	}
	
	public void addWytwornia(Wytwornia nowaWytwornia) throws Exception{
		if(!wytwornia.contains(nowaWytwornia)){
			wytwornia.add(nowaWytwornia);
			nowaWytwornia.addPlytaKwalif(this);
		}
		}
	
	public void addZakup(Zakup noweZakupy){
		if(!zakup.contains(noweZakupy)){
			zakup.add(noweZakupy);
			noweZakupy.addPlyta(this);
		}
		
}
	public void addPlytaGatunkuRap(PlytaGatunkuRap nowyRap){
		if(!rap.contains(nowyRap)){
			rap.add(nowyRap);
		}	
		}
	public void addPlytaGatunkuMetal(PlytaGatunkuMetal nowyMetal){
		if(!metal.contains(nowyMetal)){
			metal.add(nowyMetal);
		}	
		}
	
	public void addPlytaGatunkuRock(PlytaGatunkuRock nowyRock){
		if(!rock.contains(nowyRock)){
			rock.add(nowyRock);
		}		
		}

public static Vector<Plyta> ekstensja= new Vector<Plyta>();		//ekstensja
	
	public static void addPlyta(Plyta plyta) {
		ekstensja.add(plyta);
		
	}
	public static void remove(Plyta plyta) {
		ekstensja.remove(plyta);
		
	}
	public static void pokażPlyta(){
		System.out.println("Ekstensja dla klasy Plyty to: ");
		for(Plyta plyta : ekstensja){
			System.out.println(plyta);
			
		}
		
		}
	
	


	
	public String toString(){

			String result =  " " + getZespol();
		
			for(Wytwornia a : wytwornia){
				result += "  Wytwornia: "  + a.getNazwa() +  "\n";
			}
			if(!rock.isEmpty()){
				result += rock + "\n";
			}
			if(!metal.isEmpty()){
				result += metal + "\n";
			}
			if(!rap.isEmpty()){
				result += rap + "\n";
			}
			return result;
		
	}
	
	
	

	public Plyta(String nazwa, int rok_wydania, Zespol zespol, double cena){
		setNazwa(nazwa);
		setRok_Wydania(rok_wydania);
		setZespol(zespol);
		setCena(cena);
		addPlyta(this);
		
		
	}
	
	
}

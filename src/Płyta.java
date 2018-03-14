
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;


public class Płyta{

	private String nazwa;
	private int rok_wydania;
	private Zespół zespół;	
	private  ArrayList<Wytwórnia> wytwórnia = new ArrayList<Wytwórnia>();	
	public ArrayList<Zakup>zakup=new ArrayList<Zakup>();
	private Vector<PłytaGatunkuRock> rock = new Vector<PłytaGatunkuRock>();
	private Vector<PłytaGatunkuRap> rap = new Vector<PłytaGatunkuRap>();
	private Vector<PłytaGatunkuMetal> metal = new Vector<PłytaGatunkuMetal>();
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
	
	
	public Zespół getZespół(){
		return zespół;
		
	}
	
	public void setZespół( Zespół zespół){
	this.zespół=zespół;
		
}
	
	public double getCena(){
		
		return cena;
	}
	public void setCena(double cena){
		
		this.cena=cena;
	}
	
	public void addWytwórnia(Wytwórnia nowaWytwórnia) throws Exception{
		if(!wytwórnia.contains(nowaWytwórnia)){
			wytwórnia.add(nowaWytwórnia);
			nowaWytwórnia.addPłytaKwalif(this);
		}
		}
	
	public void addZakup(Zakup noweZakupy){
		if(!zakup.contains(noweZakupy)){
			zakup.add(noweZakupy);
			noweZakupy.addPłyta(this);
		}
		
}
	public void addPłytaGatunkuRap(PłytaGatunkuRap nowyRap){
		if(!rap.contains(nowyRap)){
			rap.add(nowyRap);
		}	
		}
	public void addPłytaGatunkuMetal(PłytaGatunkuMetal nowyMetal){
		if(!metal.contains(nowyMetal)){
			metal.add(nowyMetal);
		}	
		}
	
	public void addPłytaGatunkuRock(PłytaGatunkuRock nowyRock){
		if(!rock.contains(nowyRock)){
			rock.add(nowyRock);
		}		
		}

public static Vector<Płyta> ekstensja= new Vector<Płyta>();		//ekstensja
	
	public static void addPłyta(Płyta płyta) {
		ekstensja.add(płyta);
		
	}
	public static void remove(Płyta płyta) {
		ekstensja.remove(płyta);
		
	}
	public static void pokażPłyta(){
		System.out.println("Ekstensja dla klasy Płyty to: ");
		for(Płyta płyta : ekstensja){
			System.out.println(płyta);
			
		}
		
		}
	
	


	
	public String toString(){

			String result =  " " + getZespół();
		
			for(Wytwórnia a : wytwórnia){
				result += "  Wytwórnia: "  + a.getNazwa() +  "\n";
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
	
	
	

	public Płyta(String nazwa, int rok_wydania, Zespół zespół, double cena){
		setNazwa(nazwa);
		setRok_Wydania(rok_wydania);
		setZespół(zespół);
		setCena(cena);
		addPłyta(this);
		
		
	}
	
	
}

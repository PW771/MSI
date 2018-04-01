import java.util.Vector;

public class BudynekWytworni {

	private String kraj;
	private String miasto;
	private String ulica;
	private int numerulicy;
	
	public String getKraj(){
		return kraj;
	}
	public void setKraj(String kraj){
		this.kraj=kraj;		
	}
	
	public String getMiasto(){
		return miasto;
	}	
	public void setMiasto(String miasto){
		this.miasto=miasto;	
	}
	
	public String getUlica(){
		return ulica;
	}
	
	public void setUlica(String ulica){
		this.ulica=ulica;
		
	}
	public int getNumerUlicy(){
		return numerulicy;
	}
	
	
	public void setNumerUlicy(int numerulicy){
		this.numerulicy=numerulicy;	
	}
	
	public static BudynekWytworni utworzBudynek(Wytwornia wytwornia, String kraj, String miasto, String ulica, int numerulicy) throws Exception{
		
		if(wytwornia==null){
			
			throw new Exception("Brak wytworni");
		}
	BudynekWytworni b = new BudynekWytworni(wytwornia, kraj, miasto, ulica, numerulicy);		
	
	
	wytwornia.addBudynekWytworni(b);
	
	return b;
}
	
	public String toString(){
	String result = "" + getKraj() + " " + getMiasto() + " " + getMiasto() + " " + getUlica() + " " + getNumerUlicy();
	return result;
		
	}
public static Vector<BudynekWytworni> ekstensja = new Vector<BudynekWytworni>();		//ekstensja
	
	public static void addBudynek(BudynekWytworni budynek){
		ekstensja.add(budynek);
		
	}
	
	public static void removeBudynek(BudynekWytworni budynek){
		ekstensja.remove(budynek);
		
	}
	public static void pokażBudynek(){
		System.out.println("Ekstensja dla klasy Budynek to: ");
		for(BudynekWytworni budynek : ekstensja){
			System.out.println(budynek);
	}
		
	}

	
public BudynekWytworni(Wytwornia wytwornia, String kraj, String miasto, String ulica, int numerulicy) throws Exception{
	if(wytwornia==null){
		
		throw new Exception("Brak wytworni");
	}
	setKraj(kraj);
	setMiasto(miasto);
	setUlica(ulica);
	setNumerUlicy(numerulicy);
	addBudynek(this);
	
}
	
}

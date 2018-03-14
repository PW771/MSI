import java.util.Vector;

public class BudynekWytwórni {

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
	
	public static BudynekWytwórni utwórzBudynek(Wytwórnia wytwórnia, String kraj, String miasto, String ulica, int numerulicy) throws Exception{
		
		if(wytwórnia==null){
			
			throw new Exception("Brak wytwórni");
		}
	BudynekWytwórni b = new BudynekWytwórni(wytwórnia, kraj, miasto, ulica, numerulicy);		
	
	
	wytwórnia.addBudynekWytwórni(b);
	
	return b;
}
	
	public String toString(){
	String result = "" + getKraj() + " " + getMiasto() + " " + getMiasto() + " " + getUlica() + " " + getNumerUlicy();
	return result;
		
	}
public static Vector<BudynekWytwórni> ekstensja = new Vector<BudynekWytwórni>();		//ekstensja
	
	public static void addBudynek(BudynekWytwórni budynek){
		ekstensja.add(budynek);
		
	}
	
	public static void removeBudynek(BudynekWytwórni budynek){
		ekstensja.remove(budynek);
		
	}
	public static void pokażBudynek(){
		System.out.println("Ekstensja dla klasy Budynek to: ");
		for(BudynekWytwórni budynek : ekstensja){
			System.out.println(budynek);
	}
		
	}

	
public BudynekWytwórni(Wytwórnia wytwórnia, String kraj, String miasto, String ulica, int numerulicy) throws Exception{
	if(wytwórnia==null){
		
		throw new Exception("Brak wytwórni");
	}
	setKraj(kraj);
	setMiasto(miasto);
	setUlica(ulica);
	setNumerUlicy(numerulicy);
	addBudynek(this);
	
}
	
}

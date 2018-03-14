import java.util.Vector;

public class Email {
private String email;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
public String toString(){
	if(email==null){
		return "brak emaila";
	}
	else

		return email;
	
}

public static Vector<Email> ekstensja = new Vector<Email>();

public static void addEmail(Email email){
	ekstensja.add(email);
	
}

public static void removeEmail(Email email){
	ekstensja.remove(email);
	
}
public static void pokażEmail(){
	System.out.println("Ekstensja dla klasy Email to: ");
	for(Email email: ekstensja){
		System.out.println(email);
}
	
}

public Email(String email){
	
	setEmail(email);
	addEmail(this);

	
}
public Email(){
	addEmail(this);
	


	
}
}

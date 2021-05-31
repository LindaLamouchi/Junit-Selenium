package Entite;

public class UniteDistincteException extends Exception {
	
	private Convertisseur convertisseur;
	
	public UniteDistincteException(Convertisseur c) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Le convertisseur a rencontré une exception";
	}
	
}

package Entite;

public class Convertisseur {
	
	//Interface
	
	private double Montant;
	private double Resultat;
	
	//Implementation
	public Convertisseur() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param montant
	 */
	public Convertisseur(double montant) {
		Montant = montant;
	}

	public double getMontant() {
		return Montant;
	}
	public void setMontant(double montant) {
		Montant = montant;
	}
	public double getResultat() {
		return Resultat;
	}
	public void setResultat(double resultat) {
		Resultat = resultat;
	}
	
	public void Convertir(double Taux) throws UniteDistincteException {
		
		if(Taux==0) throw new UniteDistincteException(this);
		else
			this.Resultat=this.Montant*Taux; 
	}
			
}

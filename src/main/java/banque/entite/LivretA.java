package banque.entite;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;



@Entity
public class LivretA extends Compte{

	@Column(name="TAUX")
	Double taux;
	
	/**
	 * 
	 */
	public LivretA() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param operations
	 */
	public LivretA(String numero, Double solde, Set<Client> clients, Set<Operation> operations) {
		super(numero, solde, clients, operations);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}
}

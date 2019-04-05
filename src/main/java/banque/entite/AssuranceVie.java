package banque.entite;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class AssuranceVie extends Compte{
	
	@Column(name="DATE_FIN")
	LocalDate dateFin;
	
	@Column(name="TAUX")
	Double taux;

	/**
	 * 
	 */
	public AssuranceVie() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param operations
	 */
	public AssuranceVie(String numero, Double solde, Set<Client> clients, Set<Operation> operations) {
		super(numero, solde, clients, operations);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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

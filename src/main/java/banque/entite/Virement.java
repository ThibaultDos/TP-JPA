package banque.entite;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Virement extends Operation{
	
	@Column(name="BENEFICIAIRE")
	String beneficiaire;
	
	/**
	 * 
	 */
	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param date
	 * @param montant
	 * @param motif
	 */
	public Virement(Integer id, LocalDateTime date, Double montant, String motif) {
		super(id, date, montant, motif);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
}

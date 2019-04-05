package banque.entite;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPERATION")
public class Operation {
	@Id
	@Column(name="ID")
	Integer id;
	
	@Column(name="DATE")
	LocalDateTime date;
	
	@Column(name="MONTANT")
	Double montant;
	
	@Column(name="MOTIF")
	String motif;
	
	
	@ManyToOne //Operation <-> Compte
	@JoinColumn(name="OPERATION_ID")
	private Operation operation_id;
	
	/**
	 * 
	 */
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param date
	 * @param montant
	 * @param motif
	 */
	public Operation(Integer id, LocalDateTime date, Double montant, String motif) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}


	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}


	/**
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}


	/**
	 * @return the operation_id
	 */
	public Operation getOperation_id() {
		return operation_id;
	}


	/**
	 * @param operation_id the operation_id to set
	 */
	public void setOperation_id(Operation operation_id) {
		this.operation_id = operation_id;
	}
}

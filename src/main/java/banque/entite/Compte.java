package banque.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="COMPTE")
public class Compte {
	@Id
	@Column(name="NUMERO")
	String numero;
	
	@Column(name="SOLDE")
	Double solde;
	
	/* Aucune classe n'est maître ou esclave
	@ManyToMany//Compte<->Client
	@JoinTable(name="NUMERO_COMPTE",
	joinColumns=@JoinColumn(name="ID_NUMERO", referencedColumnName="NUMERO"),
	inverseJoinColumns=@JoinColumn(name="ID_CLIENT", referencedColumnName="ID")
	)
	private Set<Client>clients;
	*/
	
	//la classe Compte est esclave :
	@ManyToMany(mappedBy="comptes")
		private Set<Client>clients;
	
	@OneToMany(mappedBy="operation_id")//Compte<->Operation
	private Set<Operation>operations;
	
	public Compte(){
		operations = new HashSet<Operation>();
	}
	
	/**
	 * @param numero
	 * @param solde
	 */
	public Compte(String numero, Double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param operations
	 */
	public Compte(String numero, Double solde, Set<Client> clients, Set<Operation> operations) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.clients = clients;
		this.operations = operations;
	}



	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**
	 * @return the clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	/**
	 * @return the operations
	 */
	public Set<Operation> getOperations() {
		return operations;
	}

	/**
	 * @param operations the operations to set
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

}

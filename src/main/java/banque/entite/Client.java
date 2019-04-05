package banque.entite;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="PRENOM")
	private String prenom;
	
	@Column(name="DATE_NAISSANCE")
	private LocalDate dateNaissance;	
	
	@ManyToMany //Client <-> Compte
	@JoinTable(name="NUMERO_COMPTE",
	joinColumns=@JoinColumn(name="ID_CLIENT", referencedColumnName="ID"),
	inverseJoinColumns=@JoinColumn(name="ID_NUMERO", referencedColumnName="NUMERO")
	)
	private Set<Compte>comptes;
	
	@Column(name="BANQUE")
	private int client;
	
	@ManyToOne // Client <-> Banque
	@JoinColumn(name="CLIENT_ID")
	private Client client_id;
	
	@Embedded // Adresse
	private Adresse adresse;

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param comptes
	 * @param client
	 * @param adresse
	 */
	public Client(String nom, String prenom, LocalDate dateNaissance, Set<Compte> comptes, int client,
			Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.comptes = comptes;
		this.client = client;
		this.adresse = adresse;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the client
	 */
	public int getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(int client) {
		this.client = client;
	}

	/**
	 * @return the client_id
	 */
	public Client getClient_id() {
		return client_id;
	}

	/**
	 * @param client_id the client_id to set
	 */
	public void setClient_id(Client client_id) {
		this.client_id = client_id;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	

}

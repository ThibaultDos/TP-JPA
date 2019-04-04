package dev;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // obligatoire
@Table(name="CLIENT")

public class Client {
	
	
	@Id // obligatoire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="PRENOM")
	private String prenom;
	
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunts;
	
	public Client(){
		emprunts = new HashSet<Emprunt>();
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String Nom) {
		this.nom = Nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String Prenom) {
		this.prenom = Prenom;
	}


	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}


	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	

}

package dev;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity // obligatoire
@Table(name="LIVRE")
public class Livre {

	@Id // obligatoire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="TITRE")
	private String titre;
	
	@Column(name="AUTEUR")
	private String auteur;

	@ManyToMany
	@JoinTable(name="COMPO",
			joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID")
			)
			private Set<Emprunt> emprunts;
	
	
//	public Livre findBookByTitle(String title){
//		
//		TypedQuery<Livre> requestByTitle = em1.createQuery("select l from Livre l where TITRE = :reference",Livre.class);
//		requestByTitle.setParameter("reference", title);
//		Livre book = requestByTitle.getSingleResult();
//		return book;
//	}
//	
//	public void addBook() {
//		Livre livre1 = new Livre();
//		livre1.setId(id);
//		livre1.setAuteur(auteur);
//		livre1.setTitre(titre);
//		em1.persist(livre1);
//		
//	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur  + "]";
	}

	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	
	
	
}
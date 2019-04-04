package dev;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="EMPRUNT")


public class Emprunt {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DATE_DEBUT")
	private LocalDate dateDebut;
	
	@Column(name="DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name="DELAI")
	private Integer delai;

	@Column(name="ID_CLIENT")
	private Integer id_client;
	
	
	
	@ManyToMany(mappedBy="emprunts")
	private Set<Livre> livres;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT",referencedColumnName="ID",insertable=false,updatable=false)
	private Client client;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public Set<Livre> getLivre() {
		return livres;
	}

	public void setLivre(Set<Livre> livres) {
		this.livres = livres;
	}

	@Override
	public String toString() {
		return "Emprunt [id_client=" + id_client + ", livres=" + livres + ", client=" + client + "]";
	}



	
	
	

}

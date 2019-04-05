package dev;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {

	public static void main(String[] args) {

		// Etape 1 - Créer une instance d'EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bkydtpcpbtry5bzfdsvs");
		
		// Début d'une unité de travail
		EntityManager em1 = emf.createEntityManager();
		
		// création d'une requête
		
		
		TypedQuery<Livre> requete = em1.createQuery("select l from Livre l", Livre.class);
		
		
		TypedQuery<Emprunt> requete2 = em1.createQuery("select e from Emprunt e", Emprunt.class); //requête qui permet d’extraire un emprunt et tous ses livres associés.
		
		TypedQuery<Client> requete3 = em1.createQuery ("select c from Client c", Client.class); //requête qui permet d’extraire tous les emprunts d’un client donné.
		
		List<Livre> listeLivres = requete.getResultList();
		List<Emprunt> emprunts = requete2.getResultList();
		List<Client> clients = requete3.getResultList();
		
		
		
		StringBuilder affichage = new StringBuilder();
		StringBuilder affichage2 = new StringBuilder();
		StringBuilder affichage3 = new StringBuilder();
		
		
		System.out.println("• Liste des Livres :");
		listeLivres.forEach(unLivre -> {
			affichage
			.append(unLivre.getId()).append(" - ").append(unLivre.getTitre()).append(" - ").append(unLivre.getAuteur())
			.append("\n");
				
		});
		System.out.println(affichage+"\n\n");
		
		
		System.out.println("• Liste des emprunts :");
		emprunts.forEach(unEmprunt -> {
			affichage2
			//.append("\n\n")
				.append("> Emprunté du : ").append(unEmprunt.getDateDebut()).append(" - au : ").append(unEmprunt.getDateFin())
				.append("\n");
			
			unEmprunt.getLivre().forEach(unLivre -> {
				affichage2.append(">> titre=").append(unLivre.getTitre()).append("\n\n");
				
			});
				
		});
		System.out.println(affichage2+"\n\n");
		
		System.out.println("• Emprunts par client :");
		clients.forEach(unClient -> {
			affichage3
			.append("\nPrénom : ").append(unClient.getPrenom())
			.append("\nNom : ").append(unClient.getNom())
			.append("\n");
			
			unClient.getEmprunts().forEach(e -> {
				affichage3.append(e.getLivre())
				.append("\n");
			});
			
				
		});
		System.out.println(affichage3+"\n\n");
		
		
		
		// Fin d'une unité de travail
		em1.close();
		
		emf.close();			
		
	}

}
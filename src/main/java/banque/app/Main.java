package banque.app;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import banque.entite.Adresse;
import banque.entite.Banque;
import banque.entite.Client;
import banque.entite.Compte;
//import javax.persistence.TypedQuery;

public class Main {

	public static void main(String[] args) {

		// Etape 1 - Créer une instance d'EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bit7dtchnhmkj1xmnebd");
		// Début d'une unité de travail
		EntityManager em1 = emf.createEntityManager();
		
		Compte surmoi = new Compte("123456789", 0.0);
		Set<Compte> comptes= new HashSet() ;
		
		Adresse adresse = new Adresse(42, "rue de l'infini", 66666, "Lucix");
		
		Client pigeon = new Client("M.", "Pigeon", LocalDate.of(1666, 02, 30), comptes, 666, adresse);
		Set<Client> clients= new HashSet() ;
		
		Banque bancale = new Banque(); // Création d'une banque
		bancale.setNom("La Banque Bancale");
		bancale.setClients(clients);
		
		
		
		// création d'une requête
		
		
		//TypedQuery<> requete = em1.createQuery("", .class);
		//TypedQuery<> requete = em1.executeQuery ("", .class);
		
		//List<> liste = requete.getResultList();
		//StringBuilder affichage = new StringBuilder();
		//System.out.println("• réponse pertinente :");
		
		
		//Mise en page :
		/*liste.forEach(a -> {
			affichage
			.append(a.getMethode()).append(" - ").append(a.getMethode2()).append(" - ").append(unLivre.getMethode3())
			.append("\n");
				
		});
		System.out.println(affichage+"\n\n");
		*/
		
		
		
		// Fin d'une unité de travail
		em1.close();
		
		emf.close();			
		
	}

}
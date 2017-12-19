/**
 * 
 */
package conception.collection;

import conception.interfaces.ICollection;
import conception.compte.Compte;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import conception.carte.Carte;
import conception.interfaces.ICarte;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3776546
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Collection implements ICollection {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Compte joueur;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer nbcartes;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Carte> Carte;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<ICarte> cards;

	
	
	public Collection(Compte joueur) {
		this.joueur = joueur;
		this.nbcartes = 0;
		this.cards = new ArrayList<>();
	}

	/** 
	 * (non-Javadoc)
	 * @see ICollection#filtrerCartes(String champ, String valeur)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<ICarte> filtrerCartes(String champ, String valeur) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICollection#afficherSuggestion()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void afficherSuggestion() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICollection#detruireCarte(String nom)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean detruireCarte(String nom) {
		// begin-user-code
		Optional<ICarte> card = cards.stream()
				.filter(c -> c.getNom().equals(nom))
				.findAny();
		if (card.isPresent()) {
			if (card.get().getCategorie().getPrixDetruire() < 0) {
				return false;
			}
			joueur.setJoyaux(joueur.getJoyaux() 
					+ card.get().getCategorie().getPrixDetruire());
			return cards.remove(card.get());
		}
		return false;
		// end-user-code
	}


	/** 
	 * (non-Javadoc)
	 * @see ICollection#ajouterCarte(String nom)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean ajouterCarte(String nom) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	public Boolean ajouterCarte(ICarte card) {
		// begin-user-code
		int joyaux = joueur.getJoyaux();
		int prix = card.getCategorie().getPrixAchat();
		if (prix <= joyaux && prix > 0) {
			joueur.setJoyaux(joyaux - prix);
			return cards.add(card);
		}
		return false;

		// end-user-code
	}
	/** 
	 * (non-Javadoc)
	 * @see ICollection#listerCartes()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<ICarte> listerCartes() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return cards;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICollection#trierCartes(String champ, Boolean decroissant)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<ICarte> trierCartes(String champ, Boolean decroissant) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}
}
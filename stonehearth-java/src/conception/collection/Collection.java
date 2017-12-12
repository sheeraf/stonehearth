/**
 * 
 */
package conception.collection;

import conception.interfaces.ICollection;
import conception.compte.Compte;
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
	private Set<ICarte> iCarte;

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
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICollection#enleverCarte(String nom)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean enleverCarte(String nom) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
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

	/** 
	 * (non-Javadoc)
	 * @see ICollection#listerCartes()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<ICarte> listerCartes() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
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
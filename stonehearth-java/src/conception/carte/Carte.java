/**
 * 
 */
package conception.carte;

import conception.interfaces.ICarte;

import java.util.Set;

import conception.deck.Deck;
import conception.pack.Pack;
import conception.collection.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3776546
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Carte implements ICarte {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Categorie Categorie;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Deck> Deck;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer attaque;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer defense;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String nom;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Pack> Pack;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String imageUri;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Collection Collection;

	public Carte(conception.carte.Categorie categorie, Integer attaque,
			Integer defense, String nom, String description, String imageUri) {

		Categorie = categorie;
		this.attaque = attaque;
		this.defense = defense;
		this.nom = nom;
		this.description = description;
		this.imageUri = imageUri;
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getAttaque()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getAttaque() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return attaque;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getDefense()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getDefense() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return defense;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getNom()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNom() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return nom;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getDescription()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDescription() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return description;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getImage()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getImage() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return imageUri;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getCategorie()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Categorie getCategorie() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return Categorie;
		// end-user-code
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attaque == null) ? 0 : attaque.hashCode());
		result = prime * result + ((defense == null) ? 0 : defense.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((imageUri == null) ? 0 : imageUri.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		if (attaque == null) {
			if (other.attaque != null)
				return false;
		} else if (!attaque.equals(other.attaque))
			return false;
		if (defense == null) {
			if (other.defense != null)
				return false;
		} else if (!defense.equals(other.defense))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (imageUri == null) {
			if (other.imageUri != null)
				return false;
		} else if (!imageUri.equals(other.imageUri))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	
}
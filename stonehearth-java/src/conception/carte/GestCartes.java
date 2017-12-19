/**
 * 
 */
package conception.carte;

import conception.interfaces.ICartes;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import conception.interfaces.ICarte;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3776546
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GestCartes implements ICartes {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<ICarte> cards;

	
	public GestCartes(List<ICarte> cards) {
		this.cards = cards;
	}


	/** 
	 * (non-Javadoc)
	 * @see ICartes#getCarte(String nom)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ICarte getCarte(String nom) {
		// begin-user-code
		Optional<ICarte> card = cards.stream()
				.filter(c -> c.getNom().equals(nom)).findAny();
		if (card.isPresent()) {
			return card.get();
		}
		return null;
		// end-user-code
	}
}
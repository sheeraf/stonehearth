package conception.factory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import conception.carte.Categorie;
import conception.collection.Collection;
import conception.compte.Compte;
import conception.interfaces.ICarte;
import conception.interfaces.ICollection;
import conception.ui.MonsterGenerator;

public class Factory {

	public static final List<Categorie> CATEGORIES = Arrays.asList(
			new Categorie("Basic", -1, -1),
			new Categorie("Common", 20, 2),
			new Categorie("Rare", 50, 5),
			new Categorie("Legendary", 200, 20));
	
	public static final Compte BOB =  new Compte(13, 3000, 2, "Bob");
	
	public static final ICollection BOB_COLLECTION = createBobCollection(50);
	
	public static ICollection createBobCollection(int numOfElements) {
		Collection collection = new Collection(BOB);
		BOB.setCollection(collection);
		List<ICarte> copy = MonsterGenerator.getMonsters()
				.stream().collect(Collectors.toList());
		Collections.shuffle(copy);
		numOfElements = Math.min(numOfElements, copy.size());
		copy = copy.subList(0, numOfElements);
		
		copy.forEach(collection::ajouterCarte);
		BOB.setJoyaux(100);
		return collection;
	}


} 

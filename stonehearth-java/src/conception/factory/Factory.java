package conception.factory;

import java.util.Arrays;
import java.util.List;

import conception.carte.Categorie;
import conception.collection.Collection;
import conception.interfaces.ICollection;

public class Factory {

	public static ICollection createBobCollection() {
		Collection ret = new Collection();
		// ret.addCarte(  )???
		return ret;
	}

	public static final List<Categorie> CATEGORIES = Arrays.asList(
			new Categorie("Basic", -1, -1),
			new Categorie("Common", 20, 2),
			new Categorie("Rare", 50, 5),
			new Categorie("Legendary", 200, 20));
} 

package conception.factory;

import conception.collection.Collection;
import conception.interfaces.ICollection;

public class Factory {

	public static ICollection createBobCollection() {
		Collection ret = new Collection();
		// ret.addCarte(  )???
		return ret;
	}

}

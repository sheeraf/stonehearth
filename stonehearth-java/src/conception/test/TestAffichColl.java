package conception.test;

import static org.junit.Assert.*;

import org.junit.Test;

import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.interfaces.ICollection;

public class TestAffichColl {

	@Test
	public void test() {
		ICollection laColl = Factory.BOB_COLLECTION;
		
		assertFalse(laColl.listerCartes().isEmpty());
		
		for (  ICarte carte : laColl.listerCartes()) {
			System.out.println(carte.getNom());
		}
		
	}
	
	@Test
	public void testNoNulls() {
		ICollection laColl = Factory.BOB_COLLECTION;
		
		for (  ICarte carte : laColl.listerCartes()) {
			assertNotNull(carte.getAttaque());
			assertNotNull(carte.getDefense());
			assertNotNull(carte.getDescription());
			assertNotNull(carte.getImage());
			assertNotNull(carte.getNom());
			assertNotNull(carte.getCategorie());
		}

		
	}

}

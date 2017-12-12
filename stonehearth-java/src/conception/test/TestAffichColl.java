package conception.test;

import static org.junit.Assert.*;

import org.junit.Test;

import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.interfaces.ICollection;

public class TestAffichColl {

	@Test
	public void test() {
		ICollection laColl = Factory.createBobCollection();
		
		
		for (  ICarte carte : laColl.listerCartes()) {
			System.out.println(carte.getDescription());
		}
		
		
	}

}

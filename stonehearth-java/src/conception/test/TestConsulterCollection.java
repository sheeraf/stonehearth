package conception.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import conception.carte.Carte;
import conception.carte.GestCartes;
import conception.compte.Compte;
import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.interfaces.ICollection;
import conception.ui.MonsterGenerator;

public class TestConsulterCollection {

	ICollection laColl = Factory.BOB_COLLECTION;
	
	Compte bob = Factory.BOB;
	
	GestCartes gestCartes = new GestCartes(MonsterGenerator.getMonsters()); 
	
	@Test
	public void testDetruireCarte() {
		List<ICarte> cards = laColl.listerCartes();
		
		String selected = cards.stream()
				.filter(c -> c.getCategorie().getPrixDetruire() > 0)
				.findAny()
				.get()
				.getNom();
		
		ICarte card = gestCartes.getCarte(selected);
		
		int prize = card.getCategorie().getPrixDetruire();
		int numOfJoyaux = 500;
		bob.setJoyaux(numOfJoyaux);
		int size =cards.size();
		
		assertTrue(laColl.detruireCarte(card.getNom()));
		assertEquals(size - 1, cards.size());
		assertEquals(numOfJoyaux + prize,  (int)bob.getJoyaux());

	}
	
	@Test
	public void testDetruireCarteCantDestroyBasic() {
		List<ICarte> cards = laColl.listerCartes();
		
		ICarte basic = new Carte(
				Factory.CATEGORIES.get(0), 1, 1, "Basic Monkey", "Test", "-"); 
		cards.add(basic);
		MonsterGenerator.getMonsters().add(basic);
		
		String selected = cards.stream()
				.filter(c -> c.getCategorie().getPrixDetruire() < 0)
				.findAny()
				.get()
				.getNom();
		
		ICarte card = gestCartes.getCarte(selected);
		
		int prize = card.getCategorie().getPrixDetruire();
		int numOfJoyaux = 500;
		bob.setJoyaux(numOfJoyaux);
		int size =cards.size();
		
		assertFalse(laColl.detruireCarte(card.getNom()));
		assertEquals(size, cards.size());
		assertEquals(numOfJoyaux,  (int)bob.getJoyaux());

	}
	
	@Test
	public void testAjouterCarte() {
		List<ICarte> cards = laColl.listerCartes();
		List<ICarte> allCards = MonsterGenerator.getMonsters();
		
		String selected = allCards.stream()
				.filter(c -> c.getCategorie().getPrixAchat() > 0)
				.findAny()
				.get()
				.getNom();
		
		ICarte card = gestCartes.getCarte(selected);

		int price = card.getCategorie().getPrixAchat();
		int numOfJoyaux = 500;
		bob.setJoyaux(numOfJoyaux);
		
		int size =cards.size();
		
		assertTrue(laColl.ajouterCarte(card));
		assertEquals(size + 1, cards.size());
		assertEquals(numOfJoyaux - price,  (int)bob.getJoyaux());

	}
	
	@Test
	public void testAjouterCarteNotEnoughFunds() {
		List<ICarte> cards = laColl.listerCartes();
		List<ICarte> allCards = MonsterGenerator.getMonsters();
		
		String selected = allCards.stream()
				.filter(c -> c.getCategorie().getPrixAchat() > 0)
				.findAny()
				.get()
				.getNom();
		
		ICarte card = gestCartes.getCarte(selected);

		int price = card.getCategorie().getPrixAchat();
		int numOfJoyaux = 0;
		bob.setJoyaux(numOfJoyaux);
		
		int size =cards.size();
		
		assertFalse(laColl.ajouterCarte(card));
		assertEquals(size, cards.size());
		assertEquals(numOfJoyaux,  (int)bob.getJoyaux());

	}

}

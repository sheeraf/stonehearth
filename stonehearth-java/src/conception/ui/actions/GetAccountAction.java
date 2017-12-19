package conception.ui.actions;

import java.util.List;
import java.util.stream.Collectors;

import conception.compte.Compte;
import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.ui.CliUi;
import conception.ui.Finals;
import conception.ui.MonsterGenerator;

public class GetAccountAction extends CommandAction {

	// TODO get from factory
	Compte bob = Factory.BOB;

	@Override
	public String perform(String params) {

		return drawAccount(bob);
	}

	public String drawAccount(Compte compte) {
		StringBuilder sb = new StringBuilder();
		sb.append("===========================");
		sb.append(Finals.NEWLINE);
		sb.append("Name: " + compte.getNom());
		sb.append(Finals.NEWLINE);
		sb.append("Coins: " + compte.getJoyaux());
		sb.append(Finals.NEWLINE);
		sb.append("Rank: " + compte.getRang());
		sb.append(Finals.NEWLINE);
		sb.append("Number of cards: " + compte
				.getCollection().listerCartes().size());
		sb.append(Finals.NEWLINE);
		sb.append("===========================");
		sb.append(Finals.NEWLINE);
		return sb.toString();
	}
}
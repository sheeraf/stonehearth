package conception.ui.actions;

import java.util.List;
import java.util.Optional;

import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.interfaces.ICollection;
import conception.ui.Finals;

public class DestroyCardAction extends CommandAction {

	ICollection collection = Factory.BOB_COLLECTION;
	List<ICarte> cards = collection.listerCartes();

	@Override
	public String perform(String params) {

		if (params == null || params.isEmpty()) {
			throw new UiUserException(
					"Must give card name as parameter to command");
		}

		StringBuilder sb = new StringBuilder();

		Optional<ICarte> card = cards
				.stream()
				.filter(c -> c.getNom().toLowerCase()
						.equals(params.toLowerCase())).findFirst();

		if (card.isPresent() && collection.detruireCarte(card.get().getNom())) {
			sb.append(card.get().getNom());
			sb.append(" successfully destroyed");

		} else {
			sb.append("No card was destroyed");
		}

		sb.append(Finals.NEWLINE);
		return sb.toString();
	}

}
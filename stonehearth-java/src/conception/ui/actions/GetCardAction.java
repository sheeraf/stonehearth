package conception.ui.actions;

import java.util.List;
import java.util.stream.Collectors;

import conception.interfaces.ICarte;
import conception.ui.CliUi;
import conception.ui.Finals;
import conception.ui.MonsterGenerator;

public class GetCardAction extends CommandAction {

	// TODO get from factory
	List<ICarte> cards = MonsterGenerator.getMonsters();

	@Override
	public String perform(String params) {
		
		if (params == null || params.isEmpty()) {
			throw new UiUserException("Must give card name as parameter to command");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Getting card:");
		sb.append(Finals.NEWLINE);
		
		cards.stream()
			.filter(c -> c.getNom().toLowerCase().contains(params.toLowerCase()))
			.forEach(c -> sb.append(drawCard(c)));
		
		sb.append(Finals.NEWLINE);
		return sb.toString();
	}

	public String drawCard(ICarte card) {
		StringBuilder sb = new StringBuilder();
		sb.append("===========================");
		sb.append(Finals.NEWLINE);
		sb.append("Name: " + card.getNom());
		sb.append(Finals.NEWLINE);
		sb.append("Attack: " + card.getAttaque());
		sb.append(Finals.NEWLINE);
		sb.append("Defence: " + card.getDefense());
		sb.append(Finals.NEWLINE);
		sb.append("Description: " + card.getDescription());
		sb.append(Finals.NEWLINE);
		sb.append("Category: " + card.getCategorie().getNom());
		sb.append(Finals.NEWLINE);
		sb.append("Image: " + card.getImage());
		sb.append(Finals.NEWLINE);
		sb.append("===========================");
		sb.append(Finals.NEWLINE);
		return sb.toString();
	}
}
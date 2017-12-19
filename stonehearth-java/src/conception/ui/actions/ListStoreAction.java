package conception.ui.actions;

import java.util.List;

import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.ui.CliUi;
import conception.ui.Finals;
import conception.ui.MonsterGenerator;

public class ListStoreAction extends CommandAction {

	// TODO get from factory
	List<ICarte> cards = MonsterGenerator.getMonsters();

	@Override
	public String perform(String params) {
		StringBuilder sb = new StringBuilder();
		sb.append("Following cards in store:");
		sb.append(Finals.NEWLINE);
		for (ICarte c : cards) {
			sb.append(String.format("%s - attack %d defence %d", c.getNom(),
					c.getAttaque(), c.getDefense()));
			sb.append(Finals.NEWLINE);
		}
		return sb.toString();
	}

}

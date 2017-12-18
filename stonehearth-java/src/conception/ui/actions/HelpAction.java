package conception.ui.actions;

import java.util.Arrays;
import java.util.Collections;

import conception.ui.Finals;

public class HelpAction extends CommandAction {

	@Override
	public String perform(String params) {
		StringBuilder sb = new StringBuilder();
		sb.append("Following commands can be used:");
		sb.append(Finals.NEWLINE);
		for (UiCommand cmd : UiCommand.values()) {
			sb.append(cmd.name());
			if (cmd.shortCuts.length > 0) {
				sb.append(" - aliases - ");
				sb.append(String.join(", ", cmd.shortCuts));
			}
			sb.append(Finals.NEWLINE);
			sb.append("\tdescription: " + cmd.description);
			sb.append(Finals.NEWLINE);
		}
		return sb.toString();
	}

}

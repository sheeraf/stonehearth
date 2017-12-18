package conception.ui.actions;

import java.util.HashMap;
import java.util.Map;

public enum UiCommand {

	QUIT(new ExitAction(), "Exit game", "q", "exit"), 
	HELP(new HelpAction(), "Get help", "h"),
	LIST(new ListCollectionAction(), "List player collection of cards", "l"),
	GET_CARD(new GetCardAction(), 
			"Get card by name for example: get_card dragon", "card");

	private static Map<String, UiCommand> aliases = new HashMap<>();

	public final String[] shortCuts;
	public final String description;
	public final CommandAction action;

	private UiCommand(CommandAction action, String description, String... shortCuts) {
		this.shortCuts = shortCuts;
		this.action = action;
		this.description = description;
	}

	static {
		for (UiCommand command : values()) {
			// aliases.put(command.name().toLowerCase().substring(0,1),
			// command);
			for (String shortCut : command.shortCuts) {
				aliases.put(shortCut.toUpperCase(), command);
			}
		}
	}

	public static UiCommand get(String cmdOriginal) {
		UiCommand command;
		String cmdUpper = cmdOriginal.toUpperCase();
		try {
			command = valueOf(cmdUpper);
		} catch (IllegalArgumentException e) {
			command = aliases.get(cmdUpper);
		}
		if (command == null) {
			throw new UiUserException("No such command found: " + cmdOriginal);
		}
		return command;
	}

}
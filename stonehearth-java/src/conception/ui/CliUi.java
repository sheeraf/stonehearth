package conception.ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import conception.carte.Carte;
import conception.factory.Factory;
import conception.interfaces.ICarte;
import conception.ui.actions.UiCommand;
import conception.ui.actions.UiUserException;

public class CliUi {

	private Scanner scanner = new Scanner(System.in);

	private static final Logger LOG = Logger.getLogger(CliUi.class
			.getSimpleName());

	static {
//		loadLoggerConf();
	}

	public void start() {
		System.out.println("StoneHearth");
		System.out.println("Hello, " + Factory.BOB.getNom());
		System.out.println("Enter command, for example help");

		while (true) {
			try {
				String userInput = scanner.nextLine();
				userInput.trim();
				String cmdName = userInput.split(" ")[0];
				UiCommand com = UiCommand.get(cmdName);
				String params = userInput.substring(cmdName.length()).trim();
				String result = com.action.perform(params);
				
				System.out.println(result);

			} catch (UiUserException uue) {
				System.out.println(uue.getMessage());
			} catch (Exception e) {
				LOG.log(Level.SEVERE, e.getMessage(), e);
				System.out.println("Something went wrong.. ");
			} catch (Error err) {
				LOG.log(Level.INFO, err.getMessage(), err);
				System.out.println("Exiting");
				break;
			}

		}

	}

	
	private static void loadLoggerConf() {
		final InputStream inputStream = Main.class
				.getResourceAsStream("/logging.properties");
		try {
			LogManager.getLogManager().readConfiguration(inputStream);
		} catch (final IOException e) {
			Logger.getAnonymousLogger().severe(
					"Could not load default logging.properties file");
			Logger.getAnonymousLogger().severe(e.getMessage());
		}
	}
}

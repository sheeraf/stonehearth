package conception.ui.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayAction extends CommandAction {

	private static Logger LOG = Logger.getLogger(PlayAction.class.getName());

	@Override
	public String perform(String params) {
		System.out.print("Looking for opponent..");
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(i * 500L);
				System.out.print(".");
			} catch (InterruptedException e) {
				LOG.log(Level.INFO, e.getMessage(), e);
			}
		}
		System.out.println();
		return "Could not find any opponent, maybe try again later";
	}

}
package conception.ui.actions;

import java.util.Arrays;
import java.util.Collections;

import conception.ui.Finals;

public class ExitAction extends CommandAction {

	@Override
	public String perform(String params) {
		throw new Error("Exit app");
	}

}

package de.litigame;

import de.gurkenlabs.litiengine.gui.Menu;
import de.gurkenlabs.litiengine.gui.screens.Screen;

public class MenuScreen extends Screen {
	Menu menu;

	protected MenuScreen() {
		super("menu");
		menu = new Menu(0, 0, 100, 100, "dumbGAY", "SAME", "BITCH");
		getComponents().add(menu);
	}
}

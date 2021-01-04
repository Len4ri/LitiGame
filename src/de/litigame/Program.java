package de.litigame;

import java.io.File;
import java.io.IOException;

import de.gurkenlabs.litiengine.Game;

public class Program {

	public static void main(String[] args) {
		// start
		Game.init(args);

		try {
			Images.loadImages(new File("directions.txt"));
		} catch (final IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		PlayerInput.init();

		Game.screens().add(new GameScreenA());
		Game.screens().add(new MenuScreen());
		Game.screens().display("menu");
		Game.start();
	}
}

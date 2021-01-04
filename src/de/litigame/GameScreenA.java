package de.litigame;

import java.awt.Graphics2D;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.environment.CreatureMapObjectLoader;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.ImageRenderer;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.resources.Resources;

public class GameScreenA extends GameScreen {

	Hotbar hotbar = new Hotbar();

	public GameScreenA() {
		super("ingame");
		Resources.load("game.litidata");
		CreatureMapObjectLoader.registerCustomCreatureType(Joe.class);
		Game.world().loadEnvironment("MapTry2");
		Game.world().getEnvironment("MapTry2").getSpawnpoint("enter").spawn(Joe.instance());
		final Camera camera = new PositionLockCamera(Joe.instance());
		camera.setZoom(2, 3000);
		Game.world().setCamera(camera);
	}

	public void initGame() {
		Game.world().loadEnvironment("MapTry2");
	}

	@Override
	public void render(Graphics2D g) {
		super.render(g);
		final double centerX = Game.window().getResolution().getWidth() / 2;
		final double centerY = Game.window().getResolution().getHeight() / 2;
		hotbar.loadGraphics();
		ImageRenderer.render(g, hotbar.hotbarImage, (centerX - hotbar.hotbarImage.getWidth() / 2), centerY * 1.8);
	}
}
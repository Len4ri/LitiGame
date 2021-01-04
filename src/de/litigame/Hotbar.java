package de.litigame;

import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;

public class Hotbar {

	public static int slot = 0;
	private final String[] hotbar = new String[9];
	private final String[] startHotbar = { "item", "item", "item", "item", "empty", "empty", "empty", "empty",
			"empty" };
	BufferedImage hotbarImage;

	public Hotbar() {

	}

	public static void changeSlot(MouseWheelEvent e) {
		if (slot >= 0 && e.getWheelRotation() > 0 && slot < 8 || slot > 0 && slot < 9 && e.getWheelRotation() < 0) {
			slot += e.getWheelRotation();
		}
	}

	public void loadGraphics() {
		final int width = Images.get("hotbar").getWidth();
		final int height = Images.get("hotbar").getHeight();
		hotbarImage = new BufferedImage(width, height, Images.get("hotbar").getType());
		hotbarImage.createGraphics().drawImage(Images.get("hotbar"), 0, 0, null);
		hotbarImage.createGraphics().drawImage(Images.get("slot"), slot * width / 9, 0, null);
		for (int i = 0; i < 9; i++) {
			hotbarImage.createGraphics().drawImage(Images.get(startHotbar[i]), (i * (width / 9)) + 3, 3, null);
		}
	}
}

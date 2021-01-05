package de.litigame;

import java.awt.event.KeyEvent;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.input.Input;

public final class PlayerInput {
	public static void init() {
		Input.keyboard().onKeyPressed(KeyEvent.VK_X, e -> Game.screens().display("ingame"));
		Input.keyboard().onKeyPressed(KeyEvent.VK_1, e -> Hotbar.slot = 0);
		Input.keyboard().onKeyPressed(KeyEvent.VK_2, e -> Hotbar.slot = 1);
		Input.keyboard().onKeyPressed(KeyEvent.VK_3, e -> Hotbar.slot = 2);
		Input.keyboard().onKeyPressed(KeyEvent.VK_4, e -> Hotbar.slot = 3);
		Input.keyboard().onKeyPressed(KeyEvent.VK_5, e -> Hotbar.slot = 4);
		Input.keyboard().onKeyPressed(KeyEvent.VK_6, e -> Hotbar.slot = 5);
		Input.keyboard().onKeyPressed(KeyEvent.VK_7, e -> Hotbar.slot = 6);
		Input.keyboard().onKeyPressed(KeyEvent.VK_8, e -> Hotbar.slot = 7);
		Input.keyboard().onKeyPressed(KeyEvent.VK_9, e -> Hotbar.slot = 8);
		Input.mouse().onWheelMoved(e -> Hotbar.changeSlot(e));
	}
}

package de.litigame;

import de.gurkenlabs.litiengine.entities.AnimationInfo;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.entities.EntityInfo;
import de.gurkenlabs.litiengine.entities.MovementInfo;
import de.gurkenlabs.litiengine.input.KeyboardEntityController;

@EntityInfo(width = 16, height = 32)
@MovementInfo(velocity = 70)
@AnimationInfo(spritePrefix = "Joe")

public class Joe extends Creature {
	private static Joe obj = new Joe();

	private Joe() {
		super("Joe");
		addController(new KeyboardEntityController<>(this));
	}

	public static Joe instance() {
		return obj;
	}

}
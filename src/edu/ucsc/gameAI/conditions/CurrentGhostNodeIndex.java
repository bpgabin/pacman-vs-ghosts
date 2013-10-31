package edu.ucsc.gameAI.conditions;

import pacman.game.Constants.GHOST;
import pacman.game.Game;
import edu.ucsc.gameAI.ICondition;

public class CurrentGhostNodeIndex implements ICondition {

	GHOST ghost;
	int index;
	
	public CurrentGhostNodeIndex(GHOST ghost, int index) {
		// TODO Auto-generated constructor stub
		this.ghost = ghost;
		this.index = index;
	}

	@Override
	public boolean test(Game game) {
		// TODO Auto-generated method stub
		return game.getGhostCurrentNodeIndex(ghost) == index;
	}

}
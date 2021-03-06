package edu.ucsc.gameAI.fsm;

import pacman.game.Game;
import edu.ucsc.gameAI.IAction;
import edu.ucsc.gameAI.ICondition;

public class Transition implements ITransition {

	IState targetState;
	IAction action;
	ICondition condition;
	
	@Override
	public IState getTargetState() {
		// TODO Auto-generated method stub
		return targetState;
	}

	@Override
	public void setTargetState(IState targetState) {
		// TODO Auto-generated method stub
		this.targetState = targetState;
	}

	@Override
	public IAction getAction() {
		// TODO Auto-generated method stub
		return action;
	}

	@Override
	public void setAction(IAction action) {
		// TODO Auto-generated method stub
		this.action = action;
	}

	@Override
	public void setCondition(ICondition condition) {
		// TODO Auto-generated method stub
		this.condition = condition;
	}

	@Override
	public boolean isTriggered(Game game) {
		// TODO Auto-generated method stub
		return condition.test(game);
	}

}

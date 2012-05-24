package com.echoeight.oa.states;

import com.echoeight.bison.states.BaseState;
import com.echoeight.bison.Game;

public class TestState extends BaseState {

	static Game game;
	
    public TestState(Game game, int id) {
		super(game, id);
	}

	@Override
	public void init() {
		System.out.println("INITING!");		
	}

	@Override
	public void update() {
		System.out.println("UPDATING!");
	}
}
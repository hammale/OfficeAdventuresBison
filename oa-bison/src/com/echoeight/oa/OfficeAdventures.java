package com.echoeight.oa;

import com.echoeight.bison.states.BaseState;
import com.echoeight.bison.Game;

public class OfficeAdventures extends BaseState {

	static Game game;
	
    public OfficeAdventures(Game game, int id, String name) {
		super(game, id, name);
	}

	static int WIDTH = 640;
    static int HEIGHT = 480;
    
	public static void main(String[] argv) {
		game = new Game();
		new OfficeAdventures(game, 1, "Test");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
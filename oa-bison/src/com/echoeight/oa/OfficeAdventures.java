package com.echoeight.oa;

import com.echoeight.bison.states.BaseState;
import com.echoeight.bison.Game;

public class OfficeAdventures extends BaseState {

	Game game;
	
    public OfficeAdventures(int id, String name) {
		super(id, name);
		game = new Game();
	}

	static int WIDTH = 640;
    static int HEIGHT = 480;
    
	public static void main(String[] argv) {
		new OfficeAdventures(1, "Test");
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
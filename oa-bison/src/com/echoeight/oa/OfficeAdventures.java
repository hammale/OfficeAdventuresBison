package com.echoeight.oa;

import com.echoeight.bison.Game;
import com.echoeight.bison.states.StateManager;
import com.echoeight.oa.states.TestState;

public class OfficeAdventures extends Game {
	
	static int WIDTH = 640;
    static int HEIGHT = 480;
	
	static Game game;
    
	StateManager sm;
	
    public OfficeAdventures(int height, int width, String name) {
		super(height, width, name);
		sm = new StateManager(game);
		initStates();
	}
    
    public void initStates(){
    	sm.enterState(new TestState(game, 0));
    }
    
	public static void main(String[] argv) {
		game = new Game(480, 640, "Office Adventures BISON");
		new OfficeAdventures(WIDTH, HEIGHT, "Test");
	}
}
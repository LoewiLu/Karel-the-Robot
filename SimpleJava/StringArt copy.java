/*
 * File: StringArt.java
 * -----------------------------
 * Draws a cool curve using straight lines! An extra example of using
 * the for loop variable.
 */

import acm.graphics.*;
import acm.program.*;

public class StringArt extends GraphicsProgram {
	
	private static final int NUM_STRINGS = 10;
	
	public static final int APPLICATION_WIDTH = 500;
	public static final int APPLICATION_HEIGHT = 500;
	
	public void run() {
		double gap = getHeight() / NUM_STRINGS;
	    for(int i = 1; i < NUM_STRINGS; i++) {
	    	double delta = i * gap;
			GLine l = new GLine(getWidth(), delta, getHeight()-delta, getHeight());
			add(l);
	}
	}

}

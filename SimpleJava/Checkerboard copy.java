/*
 * File: CheckerBoard.java
 * -----------------
 * Draws a checkerboard with alternating black and white tiles.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {	

	/* The size of a single square on the board */
	private static final int SQUARE_SIZE = 50;

	/* Number of rows */
	private static final int NROWS = 5;

	/* Number of cols */
	private static final int NCOLS =5;

	public void run() {
		for (int i=0;i<NROWS;i++) {
			for (int j=0;j<NCOLS;j++) {
				GRect sqr= new GRect(i*SQUARE_SIZE,j*SQUARE_SIZE,SQUARE_SIZE, SQUARE_SIZE);
				sqr.setFilled((i+j)%2==0);
				add(sqr);
			}
		}//for
		
	}//run
}

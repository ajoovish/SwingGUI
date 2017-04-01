package edu.neu.csye6200.cacrystal;
/**
 * @Assignment 5A
 * @author Ajay Vishwanathan
 * @NUID 001279209
 */

public class CARule {
	/**
	 * Rules to Followed According to which the Cellular Automata can create the Flake Structure
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	void border()
	{
		
	}
	int rules (int a, int b, int c,int d) 
	{
		/**
		 * The neighbor cells around the target namely top, down, left, right .
		 * Checking if 1 or 3 cells around the target cell are dark
		 * in order to return 1 else return a white cell
		 */
		if(a+b+c+d == 1 || a+b+c+d == 3) return 1; 
		else return 0;

	}

}
package edu.neu.csye6200.cacrystal;
/**
 * @Assignment 5A
 * @author Ajay Vishwanathan
 * @NUID 001279209
 */

public class CAFlake {
	/**
	 * Class to Generate Flakes from Singular cells
	 * 
	 */
	private int cells[][];
	public CAFlakeCell CAF = new CAFlakeCell();
	public CAFlake()
	{
		cells = new int[65][65]; // Creating a Grid of size 65x 65
		for(int i=0;i<cells.length;i++)
		{
			for(int j=0;j<cells.length;j++)
			{
				cells[i][j]= CAF.getFlakeCell();
			}
		}
		cells[cells.length/2][cells.length/2] =1; // Assigning the central cell as 1 for beginning crystal growth
		
	}
	//Getters and Setters for other classes to access the cell Flake
	public int[][] getCells() {
		return cells;
	}

	public void setCells(int[][] cells) {
		this.cells = cells;
	}
	// Returning the length of the cell Grid Structure
	public int cellength()
	{
		return cells.length;
	}

}

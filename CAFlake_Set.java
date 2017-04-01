package edu.neu.csye6200.cacrystal;

import java.util.ArrayList;
import java.util.List;
/**
 * @Assignment 5A
 * @author Ajay Vishwanathan
 * @NUID 001279209
 */

public class CAFlake_Set {
	/**
	 * @CAFlake_Set class to store the various flakes generated and display it to the user
	 */
	static List<int[][]> CellList = new ArrayList<int[][]>();
	// ArrayList of the 2D integer array type to hold the flakes
	CARule  cr = new CARule();
	public static CAFlakeCell CAF = new CAFlakeCell();
	public static CAFlake CA = new CAFlake();
	public static int[][] cellFlake ;
	//int generation variable used for relating various stages of flake
	public static int generation;
	/**
	 * Default constructor to instantiate values
	 */
	CAFlake_Set()
	{
		generation=0;
		cellFlake = CA.getCells();
	}
	/**
	 * Generate function is used to generate new flakes based on the previous flake
	 */
	public void generate()
	{
		//temporary array to hold new values from the previous cellular structure
		int tempFlake[][] = new int[cellFlake.length][cellFlake.length];

		for(int i=1;i<cellFlake.length-1;i++)
		{
			for(int j=1;j<cellFlake.length-1;j++)
			{int left, top, right, down;
			left = cellFlake[i][j-1];
			right = cellFlake[i][j+1];
			top = cellFlake[i-1][j];
			down = cellFlake[i+1][j];
			if(cellFlake[i][j] == 1)
			{
				CAF.setFlakeCell(1);
				tempFlake[i][j] = CAF.getFlakeCell();
				CellList.add(generation, cellFlake);
				CA.setCells(cellFlake);
			}
			else
			{
				CAF.setFlakeCell(cr.rules(left, right, top, down));
				tempFlake[i][j] = CAF.getFlakeCell();
				//	tempFlake[i][j] = cr.rules(left, right, top, down);
				CellList.add(generation, cellFlake);
				CA.setCells(cellFlake);
			}
			}
		}
		cellFlake = tempFlake;
		generation++;
		// Generation variable is used to track the various stages of the flake development 

	}
	public static void main(String args[])
	{
		CAFlake_Set cas = new CAFlake_Set();
		do{
			cas.generate();
			int[][] tempCell = CellList.get(generation);
			//Displays the Flake set Stage 
			System.out.println("\nFlake Set no. :"+generation);
			for(int i=0;i<tempCell.length;i++)
			{
				for(int j=0;j<tempCell.length;j++)
				{
					if(tempCell[i][j]==0)
					{
						System.out.print("□ ");
					}
					else
					{
						System.out.print("■ ");
					}
				}
				System.out.println();
			}
		}while(generation!=30);
	}

}

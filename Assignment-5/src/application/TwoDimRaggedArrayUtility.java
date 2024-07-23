package application;


import java.io.*;
import java.util.Scanner;

public final class TwoDimRaggedArrayUtility {
	
	 /**
	    * Passes in 2d array
	    * @param data
	    * @return total/number of elements
	    */ 
	public static double getAverage(double[][] data)
	   {
	       double total=0;
	       
	       int numOfElements=0;
	       
	       //find the sum of the values of the 2D array
	       for(int i=0;i<data.length;i++)
	       {
	           for(int j=0;j<data[i].length;j++)
	           {
	               total += data[i][j];
	               //to keep track of the elements in the array.
	               numOfElements += 1;
	           }
	       }
	       //find and return the average
	       return (total/numOfElements);
	   }
	   /**
	    * @param data
	    * @param col
	    * @return The total amount/number in of column
	    */ 
	   public static double getColumnTotal(double[][] data,int col)
	   {
	       double total=0;
	       
	       for(int i=0;i<data.length;i++)
	       {
	           if(col<data[i].length)
	               total += data[i][col];
	       }
	       return total;
	   }
	   /**
	    * it returns the highest in array.
	    * @param data
	    * @return highest
	    */
	   static double	getHighestInArray(double[][] data) {
			
			double highest= data[0][0];
			for (int i = 0; i < data.length; i++) {
				for (int col = 0; col < data[i].length; col++) {
					if (highest< data[i][col])
						highest= data[i][col];
				}
			}
			return highest;
	}

	   /**Finds the largest and returns it
	    * @param data
	    * @param col
	    * @return Highest in column
	    */
	   
	   public static double getHighestInColumn(double[][] data,int col)
	   {
		   double highest = Double.MIN_VALUE;
		   
		   for(int i =0; i < data.length; i++)
		   {
			   if(col < data[i].length)
			   {
				   if (data[i][col]>highest)
				   {
					  highest = data[i][col];
				   }
			   }
			   
		   }
		   return highest;
	   }
	   /**
	    * It returns the highest in column index
	    * @param data
	    * @param col
	    * @return Highest index in the column
	    */
	   
	   public static int getHighestInColumnIndex(double[][] data, int col)
		{	
			   int highestIndex = 0;
			   double highest = Double.MIN_VALUE;
			   for(int i =0; i<data.length; i++)
			   {
				   if (col < data[i].length)
				   {
					   if (data[i][col]>highest)
					   {
						   highestIndex = i;
						   highest = data[i][col];
					   }
				   }
			   }
	         return highestIndex;
		}
	   /**
	    *returns the largest elemnt in the row.
	    * @param data
	    * @param row
	    * @return The highest element in the row 
	    */
	   
	   public static double getHighestInRow(double[][] data,int row)
	   {
	       double highest=0;
	       
	       for(int j=0;j<data[row].length;j++)
	       {
	           if(data[row][j]>highest)
	        	   
	               highest= data[row][j];

	       }
	       return highest;
	   }
	   /**
	    *returns largest element in an specific selected row.
	    * @param data
	    * @param row
	    * @return Highest row index.
	    */

	   public static int getHighestInRowIndex(double[][] data, int row)
	   {  
		   double max_Elem = data[row][0];
		   int highestRowIndex=0;
		   
		   for(int i=0; i < data[row].length; i++)
		   {
			   if(data[row][i] > max_Elem) 
			   {
				   max_Elem = data[row][i];
			       highestRowIndex=i;
			   }
		   }
		   return highestRowIndex; 
	   }
	   /**
	    * This is the opposite of the highest. Which is the smallest
	    * @param data
	    * @return lowest ement in array.
	    */
	  
	   static double	getLowestInArray(double[][] data) {
			
			double lowest = 0;
			for (int r = 0; r < data.length; r++) {
				for (int c = 0; c < data[r].length; c++) {
					if (lowest == 0 || data [r][c] < lowest) { 
						lowest = data[r][c]; }
				}
			}
			return lowest;
		}

	   /**
	    *  Returns the smallest in column.
	    * @param data
	    * @param col
	    * @return The lowest element in the column.
	    */
	   public static double getLowestInColumn(double[][] data,int col)
	   {
		   double lowest_Elem = Double.MAX_VALUE;
		   
		   for(int i=0; i < data.length; i++)
		   {
			   if(col < data[i].length && data[i][col] < lowest_Elem)
			   
				   lowest_Elem = data[i][col];
		   }
		   return lowest_Elem;    
	   }
	   /**
	    * Returns the index of the smallest element of an selected.
	    * @param data
	    * @param col
	    * @return The lowest index in the column
	    */
	   public static int getLowestInColumnIndex(double[][] data, int col) 
	   {
		   double lowin_col = Double.MAX_VALUE;
		   int lowin_col_indx=0;
		   	for(int i=0; i < data.length; i++)
		   	{
		   		if(col < data[i].length && data[i][col] < lowin_col)
		   		{
		   			lowin_col = data[i][col];
		   			lowin_col_indx=i;
		   		}
		   	}
		  return lowin_col_indx;
	  }
	   /**
	    * smallest element in the row.
	    * @param data
	    * @param row
	    * @return Lowest element in row
	    */
	  
	   public static double getLowestInRow(double[][] data,int row)
	   {
	       double lowest = data[row][0];
	       
	       for(int j=0;j<data[row].length;j++)
	       {
	           if(data[row][j]<lowest)
	        	   
	               lowest = data[row][j];

	       }
	       return lowest;
	   }
	   /**
	    * returns the lowest in row index.
	    * @param data
	    * @param row
	    * @return Lowest index in the row
	    */
	   public static int getLowestInRowIndex(double[][] data, int row)
		{
		   double lowest_Elem = data[row][0];
		   
		   int lowest_row =0;
		   for(int i=0; i < data[row].length; i++)
		   {
			   if(data[row][i] < lowest_Elem)
			   {
				   
				   lowest_Elem = data[row][i];
			   
				   lowest_row=i;
			   }
		   }
		   return lowest_row; 
		}
	   /**
	    * @param data
	    * @param row
	    * @return The total of the row
	    */
	 
	   public static double getRowTotal(double[][] data,int row)
	   {
	       double total=0;
	       
	       for(int j=0;j<data[row].length;j++)
	       {
	           total += data[row][j];

	       }
	       return total;
	   }
	   /**
	    * @param data
	    * @return total elem in the array
	    */
	   public static double getTotal(double[][] data)
	   {
	       double total=0;
	       //find the sum of the values of the 2D array
	       for(int i=0;i<data.length;i++)
	       {
	           for(int j=0;j<data[i].length;j++)
	           {
	               total += data[i][j];
	           }
	       }
	       return total;
	   }
	   /**
		 * @param file
		 * @return  array of double if its not empty, if it is the file is null
		 * @throws FileNotFoundException
		 */
		public static double[][] readFile(File file) throws FileNotFoundException
		{
			double[][] array = new double[0][];
			try 
			{
				BufferedReader readFile= new BufferedReader(new FileReader(file));
				
				int lines = 0;
		
				while (readFile.readLine() != null) 
				{
					lines++;
				}
				readFile.close();
			
				String line;
				int i=0;
				
				array = new double[lines][];
				
				readFile = new BufferedReader(new FileReader(file));
				
				while ((line=readFile.readLine())!=null)
			{
					String[]str= line.split(" ");
					
					int arrlength=str.length;
					
					array[i]=new double[arrlength];
			
					for(int j=0; j<arrlength; j++)
					{
						array[i][j]= Double.parseDouble(str[j]);
			
					}
							i++;
			}
				readFile.close();
			}
				catch(Exception ep)
					{
					
					ep.printStackTrace();
					
					}
			return array;
		}
	   
		/**
		 * @param raggedArr
		 * @param file
		 * @throws FileNotFoundException
		 */
	   public static void writeToFile(double[][] raggedArr,File file) throws FileNotFoundException
	   {
		   try (PrintWriter file1 = new PrintWriter(file))
		   {
			   	for (int i = 0; i < raggedArr.length; i++) 
			   	{
			   		for (int j = 0; j < raggedArr[i].length; j++) 
			   		{
			   			file1.print(raggedArr[i][j] + " ");
			   		}
			   		file1.println();
			   	}
			   	file1.close();
		   }
	 }
	   
}

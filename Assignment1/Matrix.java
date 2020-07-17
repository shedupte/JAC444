import java.lang.reflect.Constructor;

public class Matrix {



	private int nrow = 2;
	private int ncol = 2;

	/*
	 * The matrix is represented by two-dimensional array called mat.
	 */
	private int[][] mat;

	/*
	 * The class Matrix also contains a static constant value called N = 10 that
	 * represents the maximum number of column and rows that a matrix can have.
	 * •Also, the matrix has a counter static variable that the total number of
	 * Matrices created and different from zero Matrix
	 */
	private static final int N=10;
	
	//A no-argument constructor that sets all matrix values to zero with default number of rows and column
	
	
	public Matrix(int x, int y) {
		nrow=x;
		ncol=y;
		mat = new int[x][y];
		

	}
	
	//• A copy constructor 
	private Matrix(int[][] mat) { 
		this.mat= mat.clone();
		nrow=this.mat.length;
		ncol=this.mat[0].length;
		}
	

}

package Matrix;
//The number of rows nrow and the number of columns ncol. The default number of rows and columns is 2.
//The matrix is represented by two-dimensional array called mat. 
public class Matrix {
    private int nrow;             
    private  int ncol;            
    private int[][] mat;   
    
	//A no-argument constructor that sets all matrix values to zero with default number of rows and column
    public Matrix(){
		nrow=2;
		ncol=2;
		mat = new int[0][0];
	}
    
    // A two-argument constructor that takes two arguments nrow and rcol to initialize
    //the instance variable nrow and ncol. 
    public Matrix(int nrow, int ncol) {
        this.nrow = nrow;
        this.ncol = ncol;
        mat = new int[nrow][ncol];
    }

    // create matrix based on 2d array
    public Matrix(int[][] mat) {
        nrow = mat.length;
        ncol = mat[0].length;
        this.mat = new int[nrow][ncol];
        for (int i = 0; i < nrow; i++)
            for (int j = 0; j < ncol; j++)
                    this.mat[i][j] = mat[i][j];
    }

    // copy constructor
	private Matrix(Matrix A) { 
    	this(A.mat);
    	}

    // Transpose current Matrix
	//used for matrix symmetry 
    public Matrix transpose() {
        Matrix A = new Matrix(ncol, nrow);
        for (int i = 0; i < nrow; i++)
            for (int j = 0; j < ncol; j++)
                A.mat[j][i] = this.mat[i][j];
        return A;
    }

    //Sum of two Matrix 
    public Matrix sum(Matrix B) {
        Matrix A = this;
        if (B.nrow != A.nrow || B.ncol != A.ncol) ;
        Matrix C = new Matrix(nrow, ncol);
        for (int i = 0; i < nrow; i++)
            for (int j = 0; j < ncol; j++)
                C.mat[i][j] = A.mat[i][j] + B.mat[i][j];
        return C;
    }

    // Is matrix symmetrical?
    // This is done by comparing matrix A and transpose Matrix b
    //If equal then matrix is symmetrical
    public boolean equal(Matrix B) {
        Matrix A = this;
        if (B.nrow != A.nrow || B.ncol != A.ncol);
        for (int i = 0; i < nrow; i++)
            for (int j = 0; j < ncol; j++)
                if (A.mat[i][j] != B.mat[i][j]) return false;
        return true;
    }


    // print matrix to standard output
    public void show() {
        for (int i = 0; i < nrow; i++) {
            for (int j = 0; j < ncol; j++) 
            	  System.out.printf("%9.4f ", mat[i][j]);
            System.out.println();
        }
    }

}
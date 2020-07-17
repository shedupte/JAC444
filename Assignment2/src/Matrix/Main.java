package Matrix;

public class Main {
	// driver Class
    public static void main(String[] args) {
        int[][] d = { { 1, 2, 3 }, { 4, 2, 7 }, { 9, 0, 7} };
        Matrix D = new Matrix(d);
        int[][] e = { { 1, 3, 5 }, { 3, 2, 1 }, { 5, 1, 7} };
        Matrix E = new Matrix(e);
        D.show();
        E.show();
        
        
    }
}

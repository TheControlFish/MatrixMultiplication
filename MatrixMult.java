public class MatrixMult {
	private static int [][]m;
	private static int num;
	public static int [][] mult(int [][]a, int [][]b){
		if (a.length < b.length && a[0].length < b[0].length){
			m = new int [a.length][a[0].length];
			num = b.length;
		}
		else if (a.length < b.length && a[0].length > b[0].length){
			m = new int [a.length][b[0].length];
			num = b.length;
		}
		else if (a.length > b.length && a[0].length < b[0].length){
			m = new int [b.length][a[0].length];
			num = a.length;
		}
		else {
			m = new int [b.length][b[0].length];
			num = a.length;
		}
		for (int row = 0; row < m.length; row++){
			for (int col = 0; col < m[row].length; col++){
				for (int n = 0; n < num; n++){
					m[row][col] += a[row][n] * b[n][col];
				}
			}
		}
		return m;
	}
}

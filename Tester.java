
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
		int [][]b = {{-1,3},{0,9},{1,-11},{4,-5}};
		int [][]m = MatrixMult.mult(a,b);
		for (int row = 0; row < m.length; row ++){
			for (int col = 0; col < m[row].length; col++){
				System.out.print(m[row][col] + "\t");
			}
			System.out.println();
		}
	}

}

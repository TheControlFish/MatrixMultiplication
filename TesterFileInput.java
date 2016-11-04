import java.io.*;
import java.util.*;
public class TesterFileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int [][]a = new int [3][4];
		int [][]b = new int [4][2];
		Scanner sf = new Scanner(new File("E:\\AP Comp Sci\\MatrixMultiplication\\src\\MatrixData.txt"));
		while (sf.hasNext()){
			for (int n = 0; n < 3; n++){
				for (int i = 0; i < 4; i++){
					a[n][i] = sf.nextInt();
				}
			}
			for (int n = 0; n < 4; n++){
				for (int i = 0; i < 2; i++){
					b[n][i] = sf.nextInt();
				}
			}
		}
		sf.close();
		int [][]m = MatrixMult.mult(a,b);
		for (int row = 0; row < m.length; row ++){
			for (int col = 0; col < m[row].length; col++){
				System.out.print(m[row][col] + "\t");
			}
			System.out.println();
		}
	}

}

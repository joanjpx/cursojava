package cursojava;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[4][4];
		
		/*
		matrix[0][0]=1;
		matrix[0][1]=1;
		matrix[0][2]=1;
		matrix[0][3]=1;
		
		matrix[1][0]=1;
		matrix[1][1]=1;
		matrix[1][2]=1;
		matrix[1][3]=1;

		matrix[2][0]=1;
		matrix[2][1]=2;
		matrix[2][2]=1;
		matrix[2][3]=1;

		matrix[3][0]=1;
		matrix[3][1]=1;
		matrix[3][2]=1;
		matrix[3][3]=1;
		*/
		
		for(int x = 0; x < matrix.length ; x++) {
			
			for(int y = 0; y < matrix[x].length ; y++) {
				
				matrix[x][y] = (int)(Math.random()*100);
				
				System.out.println(matrix[x][y]);
			}
		}
		
		
	}

}

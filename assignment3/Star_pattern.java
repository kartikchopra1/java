class Star_pattern{
	public static void main(String a[]){
		int row, col;
		for(row=0; row<5; row++){
			for(col=0; col<row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

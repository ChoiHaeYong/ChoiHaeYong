package ch99;

public class Test02_Star {
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=(4-i);j++){
				System.out.print(" ");
			}//inner-for
			for(int k=1;k<=i*2-1;k++){
				System.out.print("*");
			}//inner-for
			System.out.println();
		}//out-for
	}//main-end
}//class-end

package ch99;
//****
// ***
//  **
//   *
public class Test06 {
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}//inner
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}//inner
			System.out.println();
		}//out
	}//main-end
}//class-end

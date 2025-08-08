package _004_Expressions;

public class ModuloPractice {
	//TODO
	//ADD in class exercises
	public static void main(String[] args) {
		//Find which of the following feels most incorrect.
		try {
			mathPredictions();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			moduloPredictions();
		}catch(Exception e) {
			System.out.println(e);
		}
        

		
	}
	

	public static void mathPredictions() {
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 / 2);
		System.out.println(5.0 + 2);
		System.out.println(5 - 2.0);
		System.out.println(5.0 * 2.0);
		System.out.println(5.0 / 2);
		System.out.println(5.0 / 0);
		System.out.println(5 / 0);
	}
	
	public static void moduloPredictions() {
		// DO NOT CHANGE THIS LINE
		Out systemGrader = new Out();//Object-Oriented-Programming, we will learn this 2nd quarter, its not spooky.	
		systemGrader.out.predict("A",null,45%6);
		systemGrader.out.predict("B",null,2%2);
		systemGrader.out.predict("C",null,8%20);
		systemGrader.out.predict("D",null,11%0);
		
	}
	
	
}

package search;

public class Start {

	static int[] testArray = {2,5,4,3,11,8,7,10};
	
	public static void main(String[] args) {
		
		MaxSearch searchMax = new MaxSearch();
		System.out.println("Groesstes Element ist "+searchMax.max_element(testArray));
		
	}

}

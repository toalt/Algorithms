package search;

public class MaxSearch {

	public int max_element(int[] a)
	{
		int x = a[0];   //Hält Maximum von a[0...i]
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > x) {
				x = a[i];
				System.out.println("Aktuelle Zahl: "+x);
			}
			else {
				System.out.println("Aktuelle Zahl:"+a[i]);
			}
		}
		
		return x;
	}
	
}

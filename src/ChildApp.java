
public class ChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildBubbleSort arr = new ChildBubbleSort(5);
		
		arr.addChild("Ian", "Mumo", 3);
		arr.addChild("Beti", "Mutinda", 8);
		arr.addChild("Sheillah", "Ndanu", 5);
		arr.addChild("Grace", "Ndanu", 7);
		arr.addChild("Loy", "Ndotu", 6);
		
		arr.displayChildren();
		System.out.println("After sorting");
		arr.sortChilrenByAge();
		arr.displayChildren();
	}

}

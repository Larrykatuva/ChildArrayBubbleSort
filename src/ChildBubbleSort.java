
public class ChildBubbleSort {
	private Child[] children;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildBubbleSort(int size) {
		this.children = new Child[size];
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting new child into the children array
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void addChild(String firstName, String lastName, int age) {
		this.children[this.nItems] = new Child(firstName, lastName, age);
		this.nItems ++;
	}
	
	/**
	 * Displaying all the children in the array
	 */
	public void displayChildren() {
		for(Child child: this.children) {
			System.out.println("Fullname: "+child.getFullName()+" | Age: "+child.getAge());
		}
	}
	
	/**
	 * Sorting children array by age using bubble sort algorithm 
	 */
	public void sortChilrenByAge() {
		int innerChild, outerChild;
		for(outerChild = nItems - 1; outerChild > 1; outerChild --) {
			for(innerChild = 0; innerChild < outerChild; innerChild ++) {
				if(this.children[innerChild].getAge() > this.children[innerChild + 1].getAge()) {
					swap(innerChild, innerChild + 1);
				}
			}
		}
	}
	
	
	/**
	 * Swap two children in the array
	 * @param innerChild
	 * @param outerChild
	 */
	public void swap(int innerChild, int outerChild) {
		Child temp = this.children[innerChild];
		this.children[innerChild] = this.children[outerChild];
		this.children[outerChild] = temp;
	}
}


public class Node {

	private String Name;
	private int StN; // student number

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getStN() {
		return StN;
	}

	public void setStN(int stN) {
		StN = stN;
	}

	public Node(String name, int stN) {
		super();
		this.Name = name;

		this.StN = stN;
	}

	public String toString() {
		return "Student name: " + Name + " and his number: " + StN;
	}

}

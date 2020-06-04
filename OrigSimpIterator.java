import java.util.ArrayList;
import java.util.Iterator;

public class OrigSimpIterator<T> implements Iterable<T> {

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

		ArrayList<Node> arr = new ArrayList<Node>();

		for (int StN = 1; StN <= 10; StN++) {
			String name = "Student" + StN;
			Node Student = new Node(name, StN);

			arr.add(Student);
		}

		Iterator<Node> n = arr.iterator();

		while (n.hasNext()) {
			System.out.println(n.next());
		}

	}

}

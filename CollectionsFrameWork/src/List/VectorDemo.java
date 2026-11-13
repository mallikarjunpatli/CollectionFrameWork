package List;



import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		// Add elements
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(20);

		System.out.println(v);

		// Access an element
		System.out.println(v.get(1));

		// Update an element
		v.set(0, 100);
		System.out.println(v);

		// Remove an element by index
		v.remove(1);
		System.out.println(v);

		// Check whether an element exists
		System.out.println(v.contains(30));

		// Get the size
		System.out.println(v.size());

		// Get the capacity
		System.out.println(v.capacity());

		// Traverse the Vector
		for (Integer number : v) {
			System.out.println(number);
		}

		// Remove all elements
		v.clear();
		System.out.println(v);
	}
}


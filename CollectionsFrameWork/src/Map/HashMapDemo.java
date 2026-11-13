package Map;

	import java.util.HashMap;
	import java.util.Map;

		public class HashMapDemo {
	    public static void main(String[] args) {

	        Map<Integer, String> students = new HashMap<>();

	        students.put(101, "Ravi");
	        students.put(102, "Priya");
	        students.put(103, "Amit");

	        System.out.println(students);
	    }
	}


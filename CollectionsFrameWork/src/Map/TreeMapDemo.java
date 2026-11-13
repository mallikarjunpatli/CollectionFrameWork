package Map;

	import java.util.Map;
	import java.util.TreeMap;

	public class TreeMapDemo {
	    public static void main(String[] args) {

	        Map<Integer, String> students = new TreeMap<>();

	        students.put(103, "Amit");
	        students.put(101, "Ravi");
	        students.put(102, "Priya");

	        System.out.println(students);
	    }
	}


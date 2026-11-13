package Map;

	import java.util.Map;
	import java.util.LinkedHashMap;

	public class LinkedHashMapDemo {
	    public static void main(String[] args) {

	        Map<Integer, String> students = new LinkedHashMap<>();

	        students.put(103, "Amit");
	        students.put(101, "Ravi");
	        students.put(102, "Priya");

	        System.out.println(students);
	    }
	}



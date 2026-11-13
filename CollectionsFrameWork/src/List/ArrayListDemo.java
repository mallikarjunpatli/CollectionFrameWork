package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListDemo {


	public static void main(String[] args) {
		
		
		// -These are the object in the Wrapper class 
		// -each wrapper class have has part and does part
		
		// -int is the object of Integer wrapper class
		
		// -float is the object of Float wrapper class
		
		Integer b=new Integer(10); //-Integer is the wrapper class and this is called boxing 
		 int c=b.intValue();//if you want to make primitive data type use the method   intValue, It is inside the Integer class inbuilt method by using this we can convert the object to primitive data type 
		 // int c=b this will also work 
		 //int c=10 autoUnboxing if want assign the direct to value called autounboxing 
		
		int a=b.intValue();
		System.out.println(a);
		

		 ArrayList<Integer> al = new ArrayList<>();

	        al.add(10);
	        al.add(10);  // Duplicates allowed
	        al.add(30);
	        al.add(null);

	        al.add(1, 100);
	        al.set(0, 20);

	        // Forward traversal using for-each
	        for (Object value : al) {
	            System.out.println(value);
	        }

	        // Backward traversal using ListIterator
	        ListIterator<Integer> cursor =
	                al.listIterator(al.size());

	        while (cursor.hasPrevious()) {
	            System.out.println(cursor.previous());
	        }

	        // Forward traversal using Iterator
	        Iterator<Integer> cursor1 = al.iterator();

	        while (cursor1.hasNext()) {
	            System.out.println(cursor1.next());
	        }

	        // Using a normal for loop
	        for (int i = 0; i < al.size(); i++) {
	            System.out.println(al.get(i));
	        }

	        System.out.println(al.lastIndexOf(10));
	        System.out.println(al.indexOf(10));
	        System.out.println(al.contains(10));
	        System.out.println(al.subList(2, 4));
	        System.out.println(al);
	        System.out.println(al.get(0));
	        System.out.println(al.size());

	        ArrayList<Integer> al1 = new ArrayList<>();

	        al1.add(100);
	        al1.add(200);
	        al1.add(300);
	        al1.add(null);

	        al.addAll(1, al1);
	        al.retainAll(al1);
	        al.remove(0);
	        al.removeAll(al1);
	        al.trimToSize();

	        System.out.println(al);
	    }
	}
//
//
//Iterable
//   |
//Collection
//   |
//------------------------------------------------
//|               |               |              |
//List             Set            Queue           Deque
//|               |               |              |
//|               |               |              |
//List Impl        Set Impl        Queue Impl      Deque Impl
//|               |               |              |
//ArrayList        HashSet         PriorityQueue   ArrayDeque
//LinkedList       LinkedHashSet
//Vector           TreeSet
//
//Map   (Separate from Collection)
// |
//------------------------------------------------
//|                 |                |
//HashMap        LinkedHashMap       TreeMap
// |
//Hashtable
// |
//Properties
//
//
//### Complete Hierarchy of Java Collection Framework (Simple Diagram)
//
//```
//Iterable
//   |
//Collection
//   |
//------------------------------------------------
//|               |               |              |
//List             Set            Queue           Deque
//|               |               |              |
//|               |               |              |
//List Impl        Set Impl        Queue Impl      Deque Impl
//|               |               |              |
//ArrayList        HashSet         PriorityQueue   ArrayDeque
//LinkedList       LinkedHashSet
//Vector           TreeSet
//
//Map   (Separate from Collection)
// |
//------------------------------------------------
//|                 |                |
//HashMap        LinkedHashMap       TreeMap
// |
//Hashtable
// |
//Properties
//```
//
//### Easy Understanding
//
//* `Iterable` → top level
//* `Collection` → parent of List, Set, Queue
//* `List` → ArrayList, LinkedList, Vector
//* `Set` → HashSet, LinkedHashSet, TreeSet
//* `Queue` → PriorityQueue
//* `Deque` → ArrayDeque
//* `Map` → Separate family (key–value)
//
//
//1) Iterable (interface)
//
//Main purpose: allow looping
//
//Important methods:
//
//iterator()
//forEach()
//spliterator()
//
//
//2) Collection (interface)
//
//Base for List, Set, Queue
//
//Important methods:
//
//add(), addAll()
//remove(), removeAll(), retainAll()
//clear()
//size()
//isEmpty()
//contains(), containsAll()
//iterator()
//toArray()
//equals(), hashCode()
//
//3) List (interface)
//
//Ordered, allows duplicates
//
//Extra methods:
//
//get(), set()
//add(index), remove(index)
//indexOf(), lastIndexOf()
//listIterator()
//subList()
//
//5) Queue (interface)
//
//FIFO
//
//Extra methods:
//
//offer()
//poll()
//peek()
//remove()
//element()
//
//6) Deque (interface)
//
//Double-ended queue
//
//Extra methods:
//
//addFirst(), addLast()
//removeFirst(), removeLast()
//peekFirst(), peekLast()
//offerFirst(), offerLast()
//pollFirst(), pollLast()
//
//
//Classes
//
//Interfaces define methods,
//Classes implement them and may add more.
//
//7) ArrayList (class)
//
//Implements: List
//
//Methods:
//
//All List + Collection methods
//
//Some extra utility methods
//
//Total: about 35–40 methods
//
//8) LinkedList (class)
//
//Implements: List, Deque
//
//Methods:
//
//List + Queue + Deque methods
//
//Total: about 40+ methods
//
//9) Vector (class)
//
//Implements: List
//
//Like ArrayList but thread-safe.
//
//Total: about 40+ methods
//
//10) HashSet (class)
//
//Implements: Set
//
//Methods:
//
//Only Collection methods
//
//Total: about 15–17 methods
//
//11) LinkedHashSet (class)
//
//Implements: Set
//
//Same methods as HashSet, but ordered.
//
//Total: about 15–17 methods
//
//12) TreeSet (class)
//
//Implements: Set, NavigableSet
//
//Adds sorted-related methods:
//
//first(), last()
//higher(), lower()
//ceiling(), floor()
//
//
//Total: about 25+ methods
//
//13) PriorityQueue (class)
//
//Implements: Queue
//
//Methods:
//
//Queue + Collection methods
//
//Total: about 20+ methods
//
//14) ArrayDeque (class)
//
//Implements: Deque
//
//Methods:
//
//Deque + Queue + Collection
//
//Total: about 30+ methods
//
//15) Map (interface)
//
//Key–value
//
//Important methods:
//
//put(), putAll()
//get()
//remove()
//containsKey(), containsValue()
//keySet(), values(), entrySet()
//size(), isEmpty(), clear()
//replace()
//
//
//Total: about 15+ methods
//
//16) HashMap (class)
//
//Implements: Map
//
//Methods:
//
//All Map methods + some extras
//
//Total: about 20+ methods
//
//17) LinkedHashMap (class)
//
//Implements: Map
//
//Same as HashMap, but ordered.
//
//Total: about 20+ methods
//
//18) TreeMap (class)
//
//Implements: NavigableMap
//
//Adds sorted-map methods:
//
//firstKey(), lastKey()
//higherKey(), lowerKey()
//ceilingKey(), floorKey()
//
//
//Total: about 25+ methods
//
//Easy Rule
//
//Don’t try to remember exact numbers.
//Remember:
//
//Interfaces define base methods
//
//Classes just implement them
//
//Most real programs use only:
//
//add, remove, get, put, size, contains, clear
//
//i want every class and interface complete method
//package List;



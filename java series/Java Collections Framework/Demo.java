import java.util.*;


public class Demo {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		List<Integer> linkedList= new LinkedList<>();
		
		//instead of stack use Deque
		
		List<Integer> vector= new Vector<>();
		
		
		Set<Integer> treeset= new TreeSet<>();
		Set<Integer> hashset= new HashSet<>();
		Set<Integer> linkedset= new LinkedHashSet<>();
		
		
		Queue<Integer> queue = new PriorityQueue<>();
		Deque<Integer> deck2 = new LinkedList<>();
		Deque<Integer> deck = new ArrayDeque<Integer>();
		
		Map<Integer, Integer> treemap= new TreeMap<>();
		Map<Integer, Integer> hashmap= new HashMap<>();
		Map<Integer, Integer> linkedmap= new LinkedHashMap<>();
		
		
		
		
		//add appends to end of list
		list.add(3);
		//add element at index of list, shifts elements at that position at subsequent ones to the right
		list.add(0, 5);
		//gets the zeroth element
		list.get(0);
		
		//removes the ith elment from list
		list.remove(1);
		
		
		//returns true if add is successfull, returns false if value is already on set
		boolean addSuccedded = linkedset.add(5);
		
		//returns true if object is in set, returns false if object is not in set
		//remove will remove the object if it is in the set
		boolean removeSuccedded = linkedset.remove(5);
		boolean contains = linkedset.contains(5);
		
		
		//add to the front and end of deck
		deck.addFirst(6);
		deck.addLast(5);//
		
		
		//look at the front and the end of the deck
		int peek1 = deck.getFirst();
		int peek2 = deck.getLast();
		
		//retrieves and removes from the front and the end of the deck
		int first =deck.removeFirst();
		int last= deck.removeLast();
		
		
		//associates the key 8 with the value 7
		linkedmap.put(8, 7);
		//gets the value associated with the key 8
		linkedmap.get(8);
		
		
		//iterates through list 1 by 1
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()){
			int i= iter.next();
		}
		
		
		
	}

}

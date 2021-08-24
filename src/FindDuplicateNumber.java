import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateNumber {
	
	
	
	public static void main(String arr[]) {
		
		
		String infra = "java is java langugae programming langugae";
		
		
		String blocks[] = infra.split(" ");
		
		//1. using hash map
		
		
		Map<String, Integer> store = new  HashMap<String, Integer> ();
		
		for (String e : blocks) {
			
			Integer count = store.get(e);
			
			if(count==null) {
				store.put(e, 1);
			}
			else {
				store.put(e, ++count);
			}
		}
		
		
		System.out.println(store);
		
		Set<Entry<String, Integer>> traverse = store.entrySet();
		
		for (Entry<String,Integer> entry : traverse) {
			if(entry.getValue()>1) {
				System.out.println("duplicte word is : " + entry.getKey());
			}
		}
		
		// using set
		System.out.println("****************************");
		
		
		Set<String> storeOne = new HashSet<String> ();
		for (String e : blocks) {
			if (storeOne.add(e) == false) {
				System.out.println("duplicte word is : " + e);
			}
		}
		
		System.out.println("****************************");
		
		// brute force
		
		for (int i = 0; i<blocks.length; i++) {
			for (int j = i+1; j<blocks.length; j++) {
				
				if(blocks[i].equals(blocks[j])) {
					System.out.println("duplicte word is : " + blocks[i]);
				}
				
			}
		}
		
		
		
	}

}

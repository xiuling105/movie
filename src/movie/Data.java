package movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {
	
	private List<Titles> detail; // I am using the interface here.
	
	public Data() {
		detail = new ArrayList<>();
		
	} 
	
	public void add (Titles titles) {
		detail.add(titles);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Titles titles: detail){
			result.append(titles.toString() + "\n");
		}
		return result.toString();
	}
	
	public void sortByTitle() {
		Collections.sort(detail);
	}
	
	public Titles findByName(String name) {
		Titles t = new Titles("", name);
		int index = Collections.binarySearch(detail, t);
		return detail.get(index);
		
	}
}


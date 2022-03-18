import java.util.ArrayList;

public class Score {
	
	public static void main(String[] args) {
		
		//ArrayList of integers
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		System.out.println(scores.size()); //Arrays we used .length attribute
		
		scores.add(2); //Autoboxing // Adding Integer 2 into the arraylist
		
		scores.add(5);
		
		scores.add(2);
		
		scores.add(3);
		
		scores.add(0, 56); //Insert element  at index 0
		
		//System.out.println(scores.size()); //ArrayLists are dynamic
		
		//An example of how arrays are different from arrayList
		
		int[] scoresArray = new int[5];
		//System.out.println(scoresArray.length); //this will print 5 since size is predetermined
		
		//scores.remove(2) removes element from that index
		
		//for-each loop
		//for(TypeThatArray
		
		//for(Integer score : scores) {
		// s.o.p(score);
		//for(int i =0; i <= scores.size()-1; i++: {
		//s.o.p(scores.get(i)); 
		
		ArrayList<String> students = new ArrayList<String>(); //() <--calls constructor
		
		students.add("Ashley");
		
		students.add("Jason");
		
		students.add("Madison");
		
		System.out.println(students.size()); //<-- () here calls method
		
		System.out.println(students.isEmpty()); // asking if the arrayList is empty
		
		students.set(1, "Linda");
		
		students.remove("Madison"); //you can remove by putting an int for index or the string name
		
		System.out.println(students.size());
		
		System.out.println(students.get(1)); //get element at index 2
	}

}

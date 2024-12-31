// Ian Mwai Gachoki
//3132394

package griffith;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main (String[] args) {
		
		// Create a list of People as Objects
		List<Person> people =Arrays.asList(
				
			new Person("Ian", "Gachoki"),
			new Person("Jinpachi", "Ego"),
			new Person("Hayley", "Davies"),
			new Person("Jermaine","Davies"),
			new Person("Saturo", "Gojo"),
			new Person("Sergio", "Aguero"),
			new Person("Coby", "Lopez")
				
		);
		
		// Create two Friends collections, one using HashSet and one using TreeSet
		Friends friendsFirstSet = new Friends(false);// HashSet
		Friends friendsSecondSet = new Friends(true);// TreeSet
		
		// Add all people to both sets
		for (Person p : people) {
			friendsFirstSet.add(p);
			friendsSecondSet.add(p);
		}
		
		// Display all friends in the first set
		System.out.println("Friends in the first set:");
		friendsFirstSet.display();
		
		// Display all friends in the second set
		System.out.println("\nFriends in the second set:");
		friendsSecondSet.display();
		
		// Display friends sorted by surname from the first set
		System.out.println("\nList of sorted friends in the first set:");
		System.out.println(friendsFirstSet.sort());
		
		// Display friends sorted by surname from the second set
		System.out.println("\nList of sorted friends in the second set:");
		System.out.println(friendsSecondSet.sort());
		
		// Search for a specific person in the first set
		System.out.println("\nSearch for Saturo Gojo in the first set:");
		System.out.println(friendsFirstSet.search(new Person("Saturo", "Gojo")));
		
		// Search for all people with the surname "Davies" in the first set
		System.out.println("\nSearch for people with the surname Davies in the first set:");
		System.out.println(friendsFirstSet.getSurname("Davies"));
		
		// Remove a specific person from the first set
		System.out.println("\nRemoving Ian Gachoki from the first set:");
		System.out.println(friendsFirstSet.remove(new Person("Ian","Gachoki")));
		friendsFirstSet.display();
		
		// Check for duplicates between the two sets
		System.out.println("\nCheck for duplicates in both sets:");
		for (Person p : people) {
			if (friendsFirstSet.search(p)&&friendsSecondSet.search(p)) {
				System.out.println(p + " is in both sets");
			}
		}
		
	}

}

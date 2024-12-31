// Ian Mwai Gachoki
//3132394

package griffith;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Friends {
	
	// A Set to hold the friends
	private final Set<Person> friends;
	
	// Constructor that accepts a boolean to decide whether to use a TreeSet (sorted) or HashSet (unordered)
	public Friends (boolean useTreeSet) {
		
		// Choose between a TreeSet (sorted by the natural order of Person) and a HashSet (unordered)
		friends = useTreeSet ? new TreeSet<>() : new HashSet<>();
		
	}
	
	 // Method to add a Person to the friends set
	public void add (Person person) {
		
		// If the person is null, throw an exception
		if (person == null) {
			throw new IllegalArgumentException("Person should not be null");
		}
		
		 // Add the person to the set
		friends.add(person);
		
	}
	
	// Method to check if a Person is in the friends set
	public boolean search (Person person) {
		
		 // If the person is null, throw an exception
		if (person == null) {
			throw new IllegalArgumentException("Person should not be null");
		}
		
		// Return whether the person is contained in the set
		return friends.contains(person);
		
	}
	
	// Method to get all friends with the specified first name (case-insensitive)
	public Set<Person> getFirstName (String firstName){
		
		// Create a new set to hold the results
		Set<Person> result = new HashSet<>();
		
		// Iterate over the friends set and check if the first name matches
		for (Person p : friends) {
			if (p.firstName().equalsIgnoreCase(firstName)) {
				result.add(p);// Add matching friends to the result set
			}
		}
		
		// Return the result set
		return result;
	}
	
	// Method to get all friends with the specified surname (case-insensitive)
	public Set<Person> getSurname(String surname) {
		
		// Create a new set to hold the results
		Set<Person> result = new HashSet<>();
		
		// Iterate over the friends set and check if the surname matches
		for (Person p: friends) {
			
			if(p.surname().equalsIgnoreCase(surname)) {
				result.add(p);
			}
			
		}
		
		return result;
		
	}
	
	// Method to remove a person from the friends set
	public boolean remove (Person person) {
		
		// If the person is null, throw an exception
		if(person == null) {
			throw new IllegalArgumentException("People should not be null");
		}
		
        // Remove the person from the set and return whether the removal was successful
		return friends.remove(person);
		
	}
	
	// Method to return a list of friends sorted by their natural ordering 
	public List<Person> sort() {
		
		 // Create a list from the set of friends
		List<Person> sortedNames = new ArrayList<>(friends);
		// Sort the list using the natural ordering of Person
		Collections.sort(sortedNames);
		// Return the sorted list
		return sortedNames;
		
	}
	
	// Method to display all friends in the set
	public void display() {
		// Print the friends set
		System.out.println(friends);
		
	}

}

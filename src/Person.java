/**
 * A simple model for a person with a name.
 * 
 * @author Wanchanapon Thanwaranurak
 */
public class Person {
	/** the person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Get the person's full name.
	 * @return the person's full name.
     */
	public String getName() {
		return this.name;
	}

	/**
	 * Set or change the person's full name.
	 * @param newname to change the person's full name.
     */
	public void setName(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Person other) {
		if( other != null){
			if( other.getClass() == this.getClass()){
				if ( this.getName() == other.getName() ){
					return true ;
				}
			}
		}
		return false ;
	}
	
	/**
	 * Get a string representation of this Person.
	 */
	public String toString() {
		return "Person " + this.name;
	}
}

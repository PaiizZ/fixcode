/**
 * A simple model for a student with a id.
 *
 * @author Wanchanapon Thanwaranurak
 */
public class Student extends Person {
	/** the student id. */
	private long id;

	/**
	 * Initialize a new Student object.
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student by id.
	 * They are equal if the id matches.
	 * @param other is another Student to compare to this one.
	 * @return true if the id is same, false otherwise.
     */
	public boolean equals(Student other) {
		if( other != null ){
			if( other.getClass() == this.getClass() ){
				if ( this.getId() == other.getId() ){
					return true ;
				}
			}
		}
		return false ;
	}

	/**
	 * Get the student id.
	 * @return the student id.
     */
	public long getId() {
		return this.id;
	}

	/**
	 * Set or change the student id.
	 * @param id to change the student id.
     */
	public void setId(long id) {
		this.id = id;
	}
}

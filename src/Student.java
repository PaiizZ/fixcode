//TODO Write class Javadoc
public class Student extends Person {
	private long id;
	
	//TODO Write constructor Javadoc
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

	//TODO Fix the parameter!
	//TODO Write Javadoc and fix equals: two objects are equal if
	//TODO they are both Students, have same name, *and* have same id.
	//TODO Use the 4-step template for equals in the Fundamental Methods handout.
	public boolean equals(Student other) {
		return this.id == other.id;
	}

	//TODO Write getter and setter for id.  Write Javadoc, of course.
}

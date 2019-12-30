package NewsPaper;

import java.util.ArrayList;

public class Person implements Subscriber{
	   private String name;
	    private ArrayList<Readable> readables = new ArrayList<>();

	public Person(String name) {
			this.name = name;
		}

	@Override
	public void update(Readable r) {
		readables.add(r);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((readables == null) ? 0 : readables.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (readables == null) {
			if (other.readables != null)
				return false;
		} else if (!readables.equals(other.readables))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person (  name= "  +  name +  ", readables="  
	 + readables  +  ")";
	}
	

}

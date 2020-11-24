
public class CorpEmployee implements Comparable{

	private int id;
	private String name;
	private String location;
	
	public CorpEmployee(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String toString() {
		return id+"---"+name;
	}
	@Override
	public int compareTo(Object obj) {
		int id1 = this.id;
		CorpEmployee emp=(CorpEmployee)obj;
		int id2 = emp.getId();
		
		if(id1 > id2) 
			return 1;
		 else if (id1 < id2) 
			return -1;
		 else 
			return 0;
		
	}
	
}

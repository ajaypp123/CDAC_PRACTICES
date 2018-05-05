package emppkg;

public class Emp {
	private int id;
	private String name;
	
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString(){
		return "Name : " + name + " Id : " + id;
	}
}

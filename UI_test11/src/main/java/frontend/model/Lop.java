package frontend.model;



public class Lop {
	

	private int id;
	

	private String name;

	private String block;

	private String type;
	
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
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Lop(int id, String name, String block, String type) {
		super();
		this.id = id;
		this.name = name;
		this.block = block;
		this.type = type;
	}
	public Lop() {
		
	}
	
	
	
}

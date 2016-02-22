package master;

public class Element {
	private int x;
	private int y;
	private String type;
	
	public Element(int x, int y, String type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	
	public String type() {
		return this.type;
	}
}
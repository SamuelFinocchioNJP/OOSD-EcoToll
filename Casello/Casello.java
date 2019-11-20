package Casello;

public class Casello {
	private String position;
	private int km;
	
	public Casello(String position, int km) {
		this.position = position;
		this.km = km;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
}

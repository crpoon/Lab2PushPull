
public class Main {
	
	private int x;
	private int y;
	private double z;
	
	public Main() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y + (int) this.z;
	}
	
	public void setX(int number){
		this.x = number;
	}
	
	public void setY(int number){
		this.y = number;
	}

}

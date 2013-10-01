import java.util.ArrayList;
import java.util.List;



public class Main {
	
	private int x;
	private int y;
	private List<Integer> loi;
	
	public Main() {
		this.x = 0;
		this.y = 0;
		loi = new ArrayList<Integer>();
	}
	
	public int getX(){
		return this.x;
	}
	
	public void getY(){
		for (int j = 0; j < 10; j++){
			loi.add(j,j);
		}
		for (Integer i : loi) {
			y += i;
		}
	}
	
	public void setX(int number){
		this.x = number;
	}
	
	public void setY(int number){
		this.y = number;
	}

}

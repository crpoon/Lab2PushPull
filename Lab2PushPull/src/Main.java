
public class Main {
	

	private int time;
	private String name;
	
	public Main() {
		time = 5;
		name = "Bob";
	}
	
	public int getTime(){
		return time;
	}
	

	public String getName(){
		return name;
	}
	
	public void tick(){
		time++;
	}
	
	public boolean areYouLate(int number){
		if (time > number){
			return true;
		}
		return false;
	}
	
	public int howMuchTimeLeft(int number){
		int timeLeft = 0;
		while(!areYouLate(number)){
			tick();
			timeLeft++;
		}
		return timeLeft;
	}

}

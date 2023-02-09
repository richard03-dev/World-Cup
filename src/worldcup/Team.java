package worldcup;

public class Team {
	
	String name;
	int points;
	int gd;
	
	public Team(String name, int points, int gd) {
		this.name = name;
		this.points = points;
		this.gd = gd;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getGD() {
		return this.gd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setGD(int gd) {
		this.gd = gd;
	}
	
	public String toString() {
		String output;
		output = this.name;
		for (int i = 0; i < 14 - this.name.length(); i++) {
			output += " ";
		}
		output += "  ";
		output += this.points + "        " + this.gd;
		return output;
	}

}

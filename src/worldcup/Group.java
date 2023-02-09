package worldcup;

public class Group {
	
	Team[] teams;
	String name;
	
	public Group(Team[] teams, String name) {
		this.teams = teams;
		this.name = name;
	}
	
	public String toString() {
		String output;
		output = this.name + "\n";
		output += "Team            Points   GD\n";
		output += "--------------  -------  -------\n";
		for (int i = 0; i < 4; i++) {
			output += teams[i].toString() + "\n";
		}
		
		return output;
	}

}

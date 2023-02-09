package worldcup;
import java.util.*;

public class wc_predictor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Team[] teams = new Team[4];
		Team team;
		
		System.out.println("Enter the group name");
		String groupName = scan.nextLine();

		for (int i = 0; i < 4; i++) {
			int j = i+1;
			System.out.println("Enter team " + j + ": ");
			String team1 = scan.nextLine();
			System.out.println("Enter team " + j +" points: ");
			int team1Points = scan.nextInt();
			System.out.println("Enter team "+ j + " goal difference: ");
			int team1GD = scan.nextInt();
			scan.nextLine();
			team = new Team(team1, team1Points, team1GD);
			teams[i] = team; 
		}
		
		Group group = new Group(teams, groupName);
		System.out.println(group.toString());
		

	}

}

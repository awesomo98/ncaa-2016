import java.io.*;
import java.util.*;

public class Team implements Comparable {
	public String (name, region);
	public double (expected);
	public int (seed);

	public Team(String str) {
		String[] data = str.split(",");
		name = data[0];
		expected = double(data.parseDouble([1] / 100));
		region = data[2];
		seed = int(data.parsInt[3]);
	}

	public static ArrayList<Team> (East) {
		name
	}

	public Team getWinner() {
		double teamExp = team.Expected;
		double foeExp = foe.Expected;
		double product = teamExp * foeExp;
		if (teamExp > foeExp) {
			return foe;
		} else {
			return team;
		}
	}

}
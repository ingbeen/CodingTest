package hash;
import java.util.HashMap;

/*
String[] participants = {"mislav", "stanko", "mislav", "ana"};
String[] completion = {"stanko", "ana", "mislav"};
*/

public class MarathonLevel1_Solution3 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> hm = new HashMap<>();

		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		System.out.println("participant" + hm);

		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
		System.out.println("completion" + hm);

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}

		return answer;
	}
}
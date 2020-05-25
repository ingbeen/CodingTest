package hash;
/*
String[] participants = {"mislav", "stanko", "mislav", "ana"};
String[] completion = {"stanko", "ana", "mislav"};
*/

public class MarathonLevel1_Solution1 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		// 해당 선수가 통과했는지에 대한 key값
		boolean key;
		
		// 완주명단에서 선수의 이름을 불러온다
		for (int i = 0; i < completion.length; i++) {
			key = false;
			int j;
			
			// 참가자명단에서 선수의 이름을 불러온다
			for (j = 0; j < participant.length; j++) {
				
				// 완주한 선수의 이름이 참가자 명단에 있을시
				// key값을 true로 변경 후 for문을 빠져나온다
				if (completion[i].equals(participant[j])) {
					key = true;
					break;
				}
			}
			
			// 완주를 했으므로 참가자명단에서 지운다
			if (key) {
				participant[j] = "";
			}
		}
		
		// 완주 하지 못한 선수를 answer에 저장한다
		for(String non_complete : participant) {
			answer += non_complete;
		}
		
		return answer;
	}
}
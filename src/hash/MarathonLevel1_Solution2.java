package hash;
import java.util.Arrays;

/*
String[] participants = {"mislav", "stanko", "mislav", "ana"};
String[] completion = {"stanko", "ana", "mislav"};
*/

public class MarathonLevel1_Solution2 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		// 참가자 명단과 완주자 명단을 정렬
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i;
		for (i = 0; i < completion.length; i++) {

			// 정렬된 참가자 명단과 완주자 명단을 순차적으로 비교
			// 일치하지 않을시에 해당 선수가 미완주
			if (!completion[i].equals(participant[i])) {
				break;
			}
		}

		// 위 for문에서 나온 선수를 답변에 저장
		answer += participant[i];

		return answer;
	}
}
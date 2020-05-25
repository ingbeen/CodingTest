package hash;
import java.util.Arrays;

/*
String[] participants = {"mislav", "stanko", "mislav", "ana"};
String[] completion = {"stanko", "ana", "mislav"};
*/

public class MarathonLevel1_Solution2 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		// ������ ��ܰ� ������ ����� ����
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i;
		for (i = 0; i < completion.length; i++) {

			// ���ĵ� ������ ��ܰ� ������ ����� ���������� ��
			// ��ġ���� �����ÿ� �ش� ������ �̿���
			if (!completion[i].equals(participant[i])) {
				break;
			}
		}

		// �� for������ ���� ������ �亯�� ����
		answer += participant[i];

		return answer;
	}
}
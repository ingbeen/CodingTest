package hash;
/*
String[] participants = {"mislav", "stanko", "mislav", "ana"};
String[] completion = {"stanko", "ana", "mislav"};
*/

public class MarathonLevel1_Solution1 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		// �ش� ������ ����ߴ����� ���� key��
		boolean key;
		
		// ���ָ�ܿ��� ������ �̸��� �ҷ��´�
		for (int i = 0; i < completion.length; i++) {
			key = false;
			int j;
			
			// �����ڸ�ܿ��� ������ �̸��� �ҷ��´�
			for (j = 0; j < participant.length; j++) {
				
				// ������ ������ �̸��� ������ ��ܿ� ������
				// key���� true�� ���� �� for���� �������´�
				if (completion[i].equals(participant[j])) {
					key = true;
					break;
				}
			}
			
			// ���ָ� �����Ƿ� �����ڸ�ܿ��� �����
			if (key) {
				participant[j] = "";
			}
		}
		
		// ���� ���� ���� ������ answer�� �����Ѵ�
		for(String non_complete : participant) {
			answer += non_complete;
		}
		
		return answer;
	}
}
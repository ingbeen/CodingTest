package CompleteSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
int[] answers = { 1, 2, 3, 4, 5 };
int[] answers = { 1, 3, 2, 4, 2 };
*/

public class TestLevel1_Solution1 {
	public static int[] solution(int[] answers) {
		int[] answer = null;
		
		// �����ڵ��� �������� �Ҵ�
		ArrayList<int[]> users = new ArrayList<int[]>();
		users.add(new int[]{1, 2, 3, 4, 5});
		users.add(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
		users.add(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
		
		// 1, 2, 3�� �л����� ���������� �� ����
		HashMap<Integer, Integer> userPoint = new HashMap<Integer, Integer>();
		
		// �����ڵ� �ο���ŭ ����
		for (int i = 0; i < users.size(); i++) {
			
			int point = 0; // ���� ����
			int cnt = 0; // ������ ����
			
			// �� �л��� ���������� ���� ����
			for (int j = 0; j < users.get(i).length; j++) {
				
				// ù��°�� ������ �������� ���� ��
				// ���ٸ� point�� +1
				if (users.get(i)[j] == answers[cnt]) {
					point++;
				}
				
				// �������� ������ �ѹ����� üũ�Ҷ����� +1�� ���ְ�
				// 5�� �Ǿ������� �ٽ� 0���� ����
				cnt++;
				if (cnt == 5) {
					cnt = 0;
				}
			}
			// ���� üũ�� ���� ��
			// ?�� �л��� ������ �ؽ��ʿ� �߰��Ѵ�
			userPoint.put(i, point);
		}
		
		// �ش� hashmap�� value�� �� ���� ū ���� �����´�
		int maxPoint = Collections.max(userPoint.values());
		
		// hashmap���� arraylist�� �ű�� ���� ��������(���� ������ ���ֱ� ����)
		ArrayList<Integer> maxPointInUser = new ArrayList<Integer>();
		
		// �ش� hashmap�� value�� �ϳ��� ������ maxPoint�� ���ٸ�
		// maxPointInUser�� �Ѹ��� �߰����ش�
		for(Integer user : userPoint.keySet()) {
			if (userPoint.get(user) == maxPoint) {
				maxPointInUser.add(user + 1);
			}
		}
		
		// �������� ����
		Collections.sort(maxPointInUser);
		
		// ���� �� �ϳ��� ������ �迭�� ����
		answer = new int[maxPointInUser.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = maxPointInUser.get(i).intValue();
		}
		
		return answer; // 14.28��
	}
}
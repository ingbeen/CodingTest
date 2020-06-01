package CompleteSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
int[] answers = { 1, 2, 3, 4, 5 };
int[] answers = { 1, 3, 2, 4, 2 };
*/

public class TestLevel1_Solution2 {
	public static int[] solution(int[] answers) {
		int[] answer = null;
		
		// �����ڵ��� �������� �Ҵ�
		int[] supoja1 = { 1, 2, 3, 4, 5 };
		int[] supoja2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] supoja3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		// �� �����ڵ��� ������ 0������ �Ҵ�
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(0);
		}
		
		// ���� �������ϸ�ŭ �ݺ�
		for (int i = 0; i < answers.length; i++) {
			// supoja1�� �������ϸ�ŭ �ݺ�
			if (answers[i] == supoja1[i%supoja1.length]) {
				list.set(0, list.get(0)+1);
			}
			
			// supoja2�� �������ϸ�ŭ �ݺ�
			if (answers[i] == supoja2[i%supoja2.length]) {
				list.set(1, list.get(1)+1);
			}
			
			// supoja3�� �������ϸ�ŭ �ݺ�
			if (answers[i] == supoja3[i%supoja3.length]) {
				list.set(2, list.get(2)+1);
			}
		}
		
		// �ִ밪(���� ������)
		int max = Collections.max(list);
		
		// ������ ���� �ִ밪�� ���� ������ ���� ������� ��ȣ��
		// returnList�� �Ҵ��Ѵ�
		List<Integer> returnList = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++) {
			if(max == list.get(i)) {
				returnList.add(i+1);
			}
		}
		
		// �������� ����
		Collections.sort(returnList);
		
		// ���� �� �ϳ��� ������ �迭�� ����
		answer = new int[returnList.size()];
		for(int i=0; i<returnList.size(); i++) {
			answer[i] = returnList.get(i);
		}
		
		return answer;
	}
}
package sort;

/*
int[] array = {1, 5, 2, 6, 3, 7, 4};
int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
*/

import java.util.ArrayList;
import java.util.Collections;

public class KthLevel1_Solution1 {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = null;
		
		// commands ����(��) ���� ��ŭ �迭ũ�� ���� 
		answer = new int[commands.length];
		
		// ù��° ����, �ι�° ����, ����° ���� �� �迭
		int[] command = new int[3];
		
		// [ù��° ����, �ι�° ����](����)�� �ش��ϴ� ���ڵ��� �� �迭
		ArrayList<Integer> rangeExtraction = new ArrayList<Integer>();
		
		// 1-1 for�� : �Ķ���ͷ� ���� commands�� ������ ����(��)��ŭ ����
		for (int i = 0; i < commands.length; i++) {
			
			// 2-1 for�� : �� ���� ���Ǹ� ����
			for (int j = 0; j < 3; j++) {
				command[j] = commands[i][j] - 1;
			}
			
			// 2-2 for�� : ���ǿ� ���� ������ �ش��ϴ� ���ڸ� ����
			for (int k = command[0]; k <= command[1]; k++) {
				rangeExtraction.add(array[k]);
			}
			
			// �ø����� ����
			Collections.sort(rangeExtraction);
			
			// ������ ���ǿ� �ش��ϴ� ���� �Ѱ� ����
			answer[i] = (rangeExtraction.get(command[2]));
			
			// �ʱ�ȭ
			rangeExtraction .clear();
		}
		
        return answer;
	}
}
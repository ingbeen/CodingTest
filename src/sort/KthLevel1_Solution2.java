package sort;

/*
int[] array = {1, 5, 2, 6, 3, 7, 4};
int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
*/

import java.util.Arrays;

public class KthLevel1_Solution2 {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
        	// �ӽù迭�� ���ǿ� �ش�Ǵ� ������ŭ ���� ����
        	// Arrays.copyOf(�����迭, ������ ����);
        	// Arrays.copyOfRange(���� �迭, ������ �����ε���, ������ ���ε���) �ε����� 0���� �����ϴ°� ����
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            // ����
            Arrays.sort(temp);
            
            // �ӽù迭���� ���������ǿ� �ش�Ǵ� �� ����
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
	}
}
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
        	// 임시배열에 조건에 해당되는 범위만큼 숫자 추출
        	// Arrays.copyOf(원본배열, 복사할 길이);
        	// Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            // 정렬
            Arrays.sort(temp);
            
            // 임시배열에서 마지막조건에 해당되는 값 추출
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
	}
}
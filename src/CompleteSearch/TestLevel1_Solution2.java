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
		
		// 수포자들의 정답패턴 할당
		int[] supoja1 = { 1, 2, 3, 4, 5 };
		int[] supoja2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] supoja3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		// 각 수포자들의 점수를 0점으로 할당
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(0);
		}
		
		// 실제 정답패턴만큼 반복
		for (int i = 0; i < answers.length; i++) {
			// supoja1의 정답패턴만큼 반복
			if (answers[i] == supoja1[i%supoja1.length]) {
				list.set(0, list.get(0)+1);
			}
			
			// supoja2의 정답패턴만큼 반복
			if (answers[i] == supoja2[i%supoja2.length]) {
				list.set(1, list.get(1)+1);
			}
			
			// supoja3의 정답패턴만큼 반복
			if (answers[i] == supoja3[i%supoja3.length]) {
				list.set(2, list.get(2)+1);
			}
		}
		
		// 최대값(가장 고득점)
		int max = Collections.max(list);
		
		// 위에서 구한 최대값과 같은 점수를 가진 사람들의 번호를
		// returnList에 할당한다
		List<Integer> returnList = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++) {
			if(max == list.get(i)) {
				returnList.add(i+1);
			}
		}
		
		// 오름차순 정렬
		Collections.sort(returnList);
		
		// 정렬 후 하나씩 꺼내어 배열로 저장
		answer = new int[returnList.size()];
		for(int i=0; i<returnList.size(); i++) {
			answer[i] = returnList.get(i);
		}
		
		return answer;
	}
}
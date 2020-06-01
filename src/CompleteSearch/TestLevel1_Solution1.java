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
		
		// 수포자들의 정답패턴 할당
		ArrayList<int[]> users = new ArrayList<int[]>();
		users.add(new int[]{1, 2, 3, 4, 5});
		users.add(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
		users.add(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
		
		// 1, 2, 3번 학생들의 맞춘점수가 들어갈 변수
		HashMap<Integer, Integer> userPoint = new HashMap<Integer, Integer>();
		
		// 수포자들 인원만큼 루프
		for (int i = 0; i < users.size(); i++) {
			
			int point = 0; // 맞춘 갯수
			int cnt = 0; // 정답지 순번
			
			// 각 학생의 정답패턴의 길이 루프
			for (int j = 0; j < users.get(i).length; j++) {
				
				// 첫번째와 문제와 정답지랑 같은 비교
				// 같다면 point에 +1
				if (users.get(i)[j] == answers[cnt]) {
					point++;
				}
				
				// 정답지의 순번은 한문제를 체크할때마다 +1를 해주고
				// 5가 되었을때는 다시 0으로 리셋
				cnt++;
				if (cnt == 5) {
					cnt = 0;
				}
			}
			// 정답 체크가 끝난 후
			// ?번 학생의 점수를 해쉬맵에 추가한다
			userPoint.put(i, point);
		}
		
		// 해당 hashmap의 value값 중 가장 큰 값을 가져온다
		int maxPoint = Collections.max(userPoint.values());
		
		// hashmap에서 arraylist로 옮기기 위한 변수선언(추후 정렬을 해주기 위해)
		ArrayList<Integer> maxPointInUser = new ArrayList<Integer>();
		
		// 해당 hashmap의 value을 하나씩 꺼내어 maxPoint와 같다면
		// maxPointInUser에 한명씩 추가해준다
		for(Integer user : userPoint.keySet()) {
			if (userPoint.get(user) == maxPoint) {
				maxPointInUser.add(user + 1);
			}
		}
		
		// 오름차순 정렬
		Collections.sort(maxPointInUser);
		
		// 정렬 후 하나씩 꺼내어 배열로 저장
		answer = new int[maxPointInUser.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = maxPointInUser.get(i).intValue();
		}
		
		return answer; // 14.28점
	}
}
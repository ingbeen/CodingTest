package hash;

import java.util.HashMap;
import java.util.Set;

/*
							  0 0            0 1
String[][] clothes = 0 0 {{"yellow_hat", "headgear"}, 
					 1 0 {"blue_sunglasses", "eyewear"}, 
    				 2 0 {"green_turban", "headgear"}};
String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, 
    			{"smoky_makeup", "face"}};
    			
*/

public class ClothesLevel2_Solution1 {
	public static int solution(String[][] clothes) {
		int answer = 0;
		
		HashMap<String, Integer> clothesMap = new HashMap<>();
		
		for(int i = 0; i < clothes.length; i++) {
			// getOrDefault는 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
			// 즉, 의상타입별로 갯수를 카운팅 한다
			clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		Set<String> getKeys = clothesMap.keySet();
		
		// 곱셈을 위한 기본값 1 셋팅
		answer++;
		
		// 옷 종류마다 안 입는 경우 1개씩 추가
		// 예제 1(2 + 1) * (1 + 1)
		// 예제 2(3 + 1)
		for(String key : getKeys) {
			answer *= clothesMap.get(key) + 1;
		}
		
		// 아무것도 입지 않을 경우 수 차감
		answer--;
		
        return answer;
	}
}
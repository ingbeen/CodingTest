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
			// getOrDefault�� ã�� Ű�� �����Ѵٸ� ã�� Ű�� ���� ��ȯ�ϰ� ���ٸ� �⺻ ���� ��ȯ�Ѵ�.
			// ��, �ǻ�Ÿ�Ժ��� ������ ī���� �Ѵ�
			clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		Set<String> getKeys = clothesMap.keySet();
		
		// ������ ���� �⺻�� 1 ����
		answer++;
		
		// �� �������� �� �Դ� ��� 1���� �߰�
		// ���� 1(2 + 1) * (1 + 1)
		// ���� 2(3 + 1)
		for(String key : getKeys) {
			answer *= clothesMap.get(key) + 1;
		}
		
		// �ƹ��͵� ���� ���� ��� �� ����
		answer--;
		
        return answer;
	}
}
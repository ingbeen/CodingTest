package hash;
/*
String[] phone_book = {"119", "97674223", "1195524421"};
String[] phone_book = {"123", "456", "789"};
String[] phone_book = {"12", "123", "1235", "567", "88"};
*/

public class telListLevel2_Solution1 {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		// ���λ�
		for (int i = 0; i < phone_book.length - 1; i++) {
			String value1 = phone_book[i];
			
			// �񱳰�
			for (int k = i + 1; k < phone_book.length; k++) {
				String value2 = phone_book[k];
				
				// ���λ簪�� �񱳰�(�� 3����) �Ȱ����� üũ
				if (value1.equals(value2.substring(0, value1.length()))) {
					return false;
				}
			}
		}
		
		return answer; // 30.8��
	}
}
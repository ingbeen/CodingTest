package hash;
/*
String[] phone_book = {"119", "97674223", "1195524421"};
String[] phone_book = {"123", "456", "789"};
String[] phone_book = {"12", "123", "1235", "567", "88"};
*/

public class TelListLevel2_Solution2 {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		// ù��°��
		for(int i=0; i<phone_book.length-1; i++) {
			
			// �ι�°��
            for(int j=i+1; j<phone_book.length; j++) {
            	
            	// ù��°���� �ι�°���� ������ ���λ����� üũ
            	// startsWith�� �Ķ������ ������ �����ϴ��� üũ �Ҽ� �ִ� �Լ�
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
		return answer;
	}
}
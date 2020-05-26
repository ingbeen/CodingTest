package hash;
/*
String[] phone_book = {"119", "97674223", "1195524421"};
String[] phone_book = {"123", "456", "789"};
String[] phone_book = {"12", "123", "1235", "567", "88"};
*/

public class TelListLevel2_Solution2 {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		// 첫번째값
		for(int i=0; i<phone_book.length-1; i++) {
			
			// 두번째값
            for(int j=i+1; j<phone_book.length; j++) {
            	
            	// 첫번째값과 두번째값이 서로의 접두사인지 체크
            	// startsWith는 파라미터의 값으로 시작하는지 체크 할수 있는 함수
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
		return answer;
	}
}
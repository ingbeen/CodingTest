package DFS_BFS;

/*
int[] numbers = { 1, 1, 1, 1, 1 };
int target = 3;
*/

public class targetNumberDFSLevel2_Solution1 {
	
	// 다른 메소드에서 사용하기 위해 정적변수로 선언한다
	static int answer = 0;
	
	public static int solution(int[] numbers, int target) {
		
		// 파라미터로 주어진 숫자배열, 타켓 넘버
		// 그리고 초기 인덱스(0), 초기 합계(0)을 할당한다
		// 마지막 파라미터는 논리 구조를 이해하기 위한 것.
		dfs(numbers, target, 0, 0, " ");
		
        return answer;
    }
	
	public static void dfs(int[] numbers, int target, int index, int sum, String str) {
		
		// 논리 구조 이해하기
		// System.out.println(str);
		
		// 주어진 숫자배열과 index값이 같다는 것은 모든 수를 더하거나 뺏다는 것이다.
		// 즉, 나올 수 있는 경우의 수 중 하나이다
		if (index == numbers.length) {
			
			// 나온 경우의 수의 합계가 타켓넘버와 같으면 answer를 더해준다
			if (sum == target) {
				
				answer++;
			}
			
			// 다르다면 메소드를 종료시킨다
			return;
		}
		
		// idex를  +1을 시킨 이유는 배열을 순서대로 더하기(빼기) 위함이며
		// 메소드의 파라미터를 +, - 나눔으로써 모든 경우의 수를 검사할수 있다
		dfs(numbers, target, index + 1, sum + numbers[index], str + " + ");
		
		dfs(numbers, target, index + 1, sum - numbers[index], str + " - ");
	}
}
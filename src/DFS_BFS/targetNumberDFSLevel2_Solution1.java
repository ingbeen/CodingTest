package DFS_BFS;

/*
int[] numbers = { 1, 1, 1, 1, 1 };
int target = 3;
*/

public class targetNumberDFSLevel2_Solution1 {
	
	// �ٸ� �޼ҵ忡�� ����ϱ� ���� ���������� �����Ѵ�
	static int answer = 0;
	
	public static int solution(int[] numbers, int target) {
		
		// �Ķ���ͷ� �־��� ���ڹ迭, Ÿ�� �ѹ�
		// �׸��� �ʱ� �ε���(0), �ʱ� �հ�(0)�� �Ҵ��Ѵ�
		// ������ �Ķ���ʹ� �� ������ �����ϱ� ���� ��.
		dfs(numbers, target, 0, 0, " ");
		
        return answer;
    }
	
	public static void dfs(int[] numbers, int target, int index, int sum, String str) {
		
		// �� ���� �����ϱ�
		// System.out.println(str);
		
		// �־��� ���ڹ迭�� index���� ���ٴ� ���� ��� ���� ���ϰų� ���ٴ� ���̴�.
		// ��, ���� �� �ִ� ����� �� �� �ϳ��̴�
		if (index == numbers.length) {
			
			// ���� ����� ���� �հ谡 Ÿ�ϳѹ��� ������ answer�� �����ش�
			if (sum == target) {
				
				answer++;
			}
			
			// �ٸ��ٸ� �޼ҵ带 �����Ų��
			return;
		}
		
		// idex��  +1�� ��Ų ������ �迭�� ������� ���ϱ�(����) �����̸�
		// �޼ҵ��� �Ķ���͸� +, - �������ν� ��� ����� ���� �˻��Ҽ� �ִ�
		dfs(numbers, target, index + 1, sum + numbers[index], str + " + ");
		
		dfs(numbers, target, index + 1, sum - numbers[index], str + " - ");
	}
}
package DFS_BFS;

/*
n���� ���� �ƴ� ������ �ֽ��ϴ�. 
�� ���� ������ ���ϰų� ���� Ÿ�� �ѹ��� ������� �մϴ�. 
���� ��� [1, 1, 1, 1, 1]�� ���� 3�� ������� ���� �ټ� ����� �� �� �ֽ��ϴ�.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

����� �� �ִ� ���ڰ� ��� �迭 numbers, 
Ÿ�� �ѹ� target�� �Ű������� �־��� �� 
���ڸ� ������ ���ϰ� ���� Ÿ�� �ѹ��� ����� ����� ���� return �ϵ��� 
solution �Լ��� �ۼ����ּ���.

���ѻ���
�־����� ������ ������ 2�� �̻� 20�� �����Դϴ�.
�� ���ڴ� 1 �̻� 50 ������ �ڿ����Դϴ�.
Ÿ�� �ѹ��� 1 �̻� 1000 ������ �ڿ����Դϴ�.

����� ��
numbers			target	return
[1, 1, 1, 1, 1]		3		5
*/

public class targetNumberDFSLevel2_RunApp {
	public static void main(String[] agrs) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		System.out.println(targetNumberDFSLevel2_Solution1.solution(numbers, target));
	}
}
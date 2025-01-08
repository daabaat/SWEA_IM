
import java.util.Scanner;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++)
		{
			int people = sc.nextInt();
			int[] peopleArray = new int[people];
			for (int i=0; i<people; i++) {
				peopleArray[i] = sc.nextInt();
			}
			int result=0;
            result = result(people,peopleArray);
			System.out.println("#" + test_case + " " + result);
		}
		sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
	}

	

	public static int result(int length, int[] peopleArray) {
		int count=0;
		for(int i=0; i<length; i++) {
			int number=0;
			int number2= 201;
			number = i+peopleArray[i];
			if(number>= 0 && number <length) {
				number2 = number+peopleArray[number];
			}
			if(number2 == i) {
				count++;
			}
		}
		return count/2;
	}
}

import java.util.Random;

public class recursive_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int num = ran.nextInt(1000) + 1;
		int[] sum = fun1(num);
		String s[] = { "¤¸", "¬B", "¨Õ", "¥a" };
		for (int k = 3; k >= 0; k--) {
			System.out.print(sum[k] + s[k]);
		}
	}

	public static int[] fun1(int n) {
		int num1 = n;
		int[] m = new int[4];
		int i = 0;
		while (num1 != 0) {
			m[i] = num1 % 10;
			num1 = num1 / 10;
			i++;
		}

		return m;

	}
}

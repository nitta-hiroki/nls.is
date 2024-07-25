package curriculum_B;

public class Qes_4 {
	public static void main(String[] args) {
		// 九九の表を表示する
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				// 式と結果をゼロ埋めして2桁で表示
				System.out.printf("%02d * %02d = %02d\t ||", i, j, result);
			}
			System.out.println();
		}
	}
}
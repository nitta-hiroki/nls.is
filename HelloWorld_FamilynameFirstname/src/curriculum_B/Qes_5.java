package curriculum_B;

public class Qes_5 {
	public static void main(String[] args) {
		// 九九の表を出力する行数（1から9まで）
		int l = 9;
		// 九九の表を出力する列数（1から20まで）
		int r = 20;

		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= r; j++) {
				int result = i * j;
				//式と結果を3桁のゼロ埋めをして表示。
				System.out.printf("%03d * %03d = %03d\t ||", j, i, result);
			}
			// 改行
			System.out.println();
		}
	}
}

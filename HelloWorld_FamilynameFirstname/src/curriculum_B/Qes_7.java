package curriculum_B;

import java.util.Scanner;

public class Qes_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数を入力
		System.out.print("生徒の人数を入力してください（2以上）: ");
		int numStudents = scanner.nextInt();

		while (numStudents < 2) {
			System.out.println("2以上の数を入力してください。");
			System.out.print("生徒の人数を入力してください（2以上）: ");
			numStudents = scanner.nextInt();
		}

		// 各教科の合計点と全体の合計点を初期化
		double sumEnglish = 0;
		double sumMath = 0;
		double sumScience = 0;
		double sumSocial = 0;
		double totalSum = 0;

		// 各生徒の成績を入力して平均点を計算
		double[] studentAverages = new double[numStudents]; // 各生徒の平均点を格納する配列
		for (int i = 0; i < numStudents; i++) {
			System.out.println((i + 1) + "人目の成績を入力してください:");

			// 英語の点数を入力
			System.out.print("英語の点数を入力してください: ");
			int englishScore = scanner.nextInt();
			sumEnglish += englishScore;

			// 数学の点数を入力
			System.out.print("数学の点数を入力してください: ");
			int mathScore = scanner.nextInt();
			sumMath += mathScore;

			// 理科の点数を入力
			System.out.print("理科の点数を入力してください: ");
			int scienceScore = scanner.nextInt();
			sumScience += scienceScore;

			// 社会の点数を入力
			System.out.print("社会の点数を入力してください: ");
			int socialScore = scanner.nextInt();
			sumSocial += socialScore;

			// その生徒の平均点を計算して配列に格納
			double average = (englishScore + mathScore + scienceScore + socialScore) / 4.0;
			studentAverages[i] = average;

			// 全体の合計点を更新
			totalSum += (englishScore + mathScore + scienceScore + socialScore);
			//改行
			System.out.println();
		}

		// 各生徒の平均点を出力
		for (int i = 0; i < numStudents; i++) {
			System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
		}

		// 各教科の平均点を計算して出力
		double averageEnglish = sumEnglish / numStudents;
		double averageMath = sumMath / numStudents;
		double averageScience = sumScience / numStudents;
		double averageSocial = sumSocial / numStudents;

		System.out.printf("\n英語の平均点は%.2f点です。\n", averageEnglish);
		System.out.printf("数学の平均点は%.2f点です。\n", averageMath);
		System.out.printf("理科の平均点は%.2f点です。\n", averageScience);
		System.out.printf("社会の平均点は%.2f点です。\n", averageSocial);

		// 全体の平均点を計算して出力
		double overallAverage = totalSum / (numStudents * 4);
		System.out.printf("\n全体の科目平均点は%.2f点です。\n", overallAverage);

		scanner.close();
	}
}
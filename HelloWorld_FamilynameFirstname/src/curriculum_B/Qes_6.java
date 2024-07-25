package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {
	//出力される最大値を11にします
	private static final int MAX = 11;
	private static Scanner scanner = new Scanner(System.in);
	private static Random r = new Random();

	//コンソールに入力された家電の個数を最大11個からランダムに出力そます。
	public static void main(String[] args) {
		String[] strs = scanner.nextLine().split("、");
		for (String str : strs) {
			int n = r.nextInt(MAX);
			String cap = str + " の残りの台数は " + n + "台です";
			switch (str) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				break;
			case "テレビ":
			case "ディスプレイ":
				cap = "ディスプレイ".equals(str) ? str + "残りの台数は" + (MAX - n) + "台です" : cap;
				break;
			default:
				//上記の商品名以外を入力した場合指定の商品ではありませんという結果を表示させます。
				cap = "　『　" + str + " 』は指定の商品ではありません";
			}
			
			System.out.println(cap);
		}
	}

}

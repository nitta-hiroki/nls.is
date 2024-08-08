/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package curriculum1_25; // パッケージ名を指定

import java.util.Scanner; // Scanner クラスをインポート

public class Theme2 {
    public static void main(String[] args) {
        // Scanner クラスを使用してユーザーからの入力を処理
        Scanner scanner = new Scanner(System.in);

        // ユーザーから名前の入力を受け取る
        System.out.print("キャラクターの名前を入力してください: ");
        String name = scanner.nextLine();

        // 名前、HP、MP、攻撃力、素早さ、防御力を指定して初期化
        Character player = new Character(name, generateRandomValue(), generateRandomValue(), generateRandomValue(), generateRandomValue(), generateRandomValue());

        // コンソールにキャラクターの情報を出力
        System.out.println("こんにちは " + player.getName() + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp()); // HPを出力
        System.out.println("MP：" + player.getMp()); // MPを出力
        System.out.println("攻撃力：" + player.getAttack()); // 攻撃力を出力
        System.out.println("素早さ：" + player.getAgility()); // 素早さを出力
        System.out.println("防御力：" + player.getDefense()); // 防御力を出力
        System.out.println("\nさあ冒険に出かけよう！"); // 冒険の開始を促すメッセージ

        // Scanner クラスをクローズ
        scanner.close();
    }

    // ランダムな数値を生成するメソッド
    private static int generateRandomValue() {
        return (int) (Math.random() * 1000); // 0から999までのランダムな数値を生成
    }
}
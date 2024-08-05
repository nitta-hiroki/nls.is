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

// スーパークラス: キャラクター
class Character {
	// キャラクターの属性を定義
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int agility;
	private int defense;

	// コンストラクタ: キャラクターを初期化
	public Character(String name, int hp, int mp, int attack, int agility, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.agility = agility;
		this.defense = defense;
	}

	// GetterとSetterメソッド
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}

// メインクラス
public class Theme2 {
	public static void main(String[] args) {
		// メインクラスのインスタンスを作成
		// 名前、HP、MP、攻撃力、素早さ、防御力を指定して初期化
		Character player = new Character("名前", 849, 862, 375, 937, 24);

		// コンソールにキャラクターの情報を出力
		System.out.println("こんにちは " + player.getName() + " さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp()); // HPを出力
		System.out.println("MP：" + player.getMp()); // MPを出力
		System.out.println("攻撃力：" + player.getAttack()); // 攻撃力を出力
		System.out.println("素早さ：" + player.getAgility()); // 素早さを出力
		System.out.println("防御力：" + player.getDefense()); // 防御力を出力
		System.out.println("\nさあ冒険に出かけよう！"); // 冒険の開始を促すメッセージ
	}
}

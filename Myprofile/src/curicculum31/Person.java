package curicculum31;

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;

	// クラスフィールド「count」を定義（初期値：0）
	private static int count = 0;

	// コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 「count」を1増やす
		count++;
	}

	// BMI計算メソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// Person情報を出力するメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" +  String.format("%.2f", this.bmi()) + "です");
	}

	// クラスメソッド「printCount」
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
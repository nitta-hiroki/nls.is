package curriculum30;

public class Data {

	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Data(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// インスタンスメソッドbmiを定義
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// インスタンスメソッドprintを定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
	}

	// 静的メソッドで人数の合計を表示
	public static void printTotalCount(int count) {
		System.out.println("合計" + count + "人です");
	}
}
package curicculumu33;

public class Person {
	public static int count = 0;
	public String firstName;
	public String lastName; // インスタンスフィールド「lastName」を追加
	public int age;
	public double height, weight;

	// コンストラクタ（lastNameの引数なし）
	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName; // lastNameをセット
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // countを増加
	}

	// コンストラクタ（lastNameの引数あり）
	Person(String firstName, int age, double height, double weight) {
		this(firstName, "不明", age, height, weight); // デフォルト値として「不明」を設定
	}

	public String fullName() {
		return this.firstName + " " + this.lastName; // fullNameメソッドでフルネームを返す
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" +  String.format("%.2f", this.bmi()) + "です");
	}

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
		
		// インスタンスメソッドbuyを定義
		public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
		}

		public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}

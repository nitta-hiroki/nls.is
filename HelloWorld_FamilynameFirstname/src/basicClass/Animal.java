package basicClass;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
		Dog dog1 = new Dog(); // デフォルトコンストラクタを使用
		System.out.println("動物の名前: " + dog1.animalname); // "犬" が出力されます

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
		Dog dog2 = new Dog("Max", 5); // 名前を引数で指定、犬の数を5に設定
		System.out.println("動物の数: " + dog2.animals); // static 変数のため、クラス名を使って呼び出す

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
		System.out.println(
				java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s")));
	}
}
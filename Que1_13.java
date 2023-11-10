package curriculum_A;

public class Que1_13 {

	public static void main(String[] args) {
		//		データ型ををローカル変数で宣言しています
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		String h;
		boolean i;

		//	    宣言したローカル変数を初期化しています。
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		g = 0;
		h = null;
		i = false;

//	初期化した変数に指定された変数を代入しています。	
		a = 10;
		b = 100;
		c = 1000;
		d = 10000;
		e = 9.5f;
		f = 10.5;
		g = 'a';
		h = "ハロー";
		i = true;

//	設問に回答するために型の変換を行っています。
		int num = 20;
		int num1 = 23;

		//		上記の変数を用いてaからdを足し算してコンソールに表示しています
		System.out.println(d + c + b + a);
		//		eとfの値を足し算してコンソールに表示しています。
		System.out.println(e + f);
// gとhの値と空白を足し算してコンソールに表示しています。
		System.out.println(g + " " + h + " " + i);
//aからfまでの値を足し算してコンソールに表示しています。
		System.out.println(a + b + c + d + e + f);
//aからdまでの値を掛け算してコンソールに表示しています。
		System.out.println(a * b * c * d);
//fをbで割った値をコンソールに表示しています。
		System.out.println(f / b);
//aからbを引き算してコンソールに表示しています。
		System.out.println(a - b);
//ハローJAVAにnumの値を計算してコンソールに表示しています。
		System.out.println("ハローJAVA" + (num + num1));
//指定された変数を各型に代入しています。
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		float weit = 62.2f;
		String like = "寿司";

//	上記の変数を文字と組み合わせてコンソールに表示しています。
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weit + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + weit / height / height * 10000);
//指定された変数を各型に再代入しています。
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weit = 64.2f;
		like = "オムライス";
//上記の変数を再度文字と組み合わせてコンソールに表示しています。
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weit + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + weit / height / height * 10000 + "です");
//上記の変数を加法してコンソールに表示しています。
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + (age + age) + "歳です");
		System.out.println("身長は" + (height + height) + "cmです");
		System.out.println("体重は" + (weit + weit) + "kgです");
		System.out.println("好きな食べ物は" + like + "です");
		System.out.println("BMIは" + (weit / (height * height) * 10000) / 2 + "です");
//	25歳以上の時trueがコンソールに表示されるようにしています。	
		boolean isAge = (age > 25);
//	上記の結果をコンソールに表示しています。	
		System.out.println(isAge);
//	使用した身長、年齢、体重を文字列型に変換しています。	
		String sa = Integer.valueOf(age).toString();
		String sh = Double.valueOf(height).toString();
		String sw = Float.valueOf(weit).toString();
//型変換した文字列を繋げてコンソールに表示しています。
		System.out.println(sa + sh + sw);
//上記で型変換した変数を整数型に変換しています。
		int ia = Integer.parseInt(sa);
		double dh = Double.parseDouble(sh);
		int ih = (int) dh;
//変換した変数をコンソールに表示しています。
		System.out.println(ia);
		System.out.println(ih);
//	25歳以上もしくは160cm以上の時にtrueと表示されるように指定しています。
		 isAge = (age > 25);
		 boolean isHeight = (height > 160);
//	上記の結果をコンソールに表示しています。	 
		 System.out.println(isAge || isHeight );
	}
}

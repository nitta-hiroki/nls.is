/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package curriculum1_23; // パッケージ名を指定

public class Theme2 {
	// caption フィールドを定義し、初期値は null
	private String caption = null;

	// メインメソッド。Javaプログラムのエントリーポイント
	public static void main(String[] args) {
		// Theme2 クラスのインスタンスを生成
		Theme2 a = new Theme2();

		// setCaption メソッドを使用して caption を設定
		a.setCaption("""
				動物名 : ライオン
				体長　: 2.1m
				速度 : 80km/h
				""");

		// a の toString メソッドを呼び出して、caption の内容を出力
		System.out.println(a);
	}

	// caption を取得するゲッターメソッド
	public String getCaption() {
		return caption;
	}

	// caption を設定するセッターメソッド
	public void setCaption(String caption) {
		this.caption = caption;
	}

	// toString メソッドをオーバーライドし、caption を返す
	@Override
	public String toString() {
		return getCaption();
	}
}

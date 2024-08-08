package curriculum1_27;

public class Theme2 {
	private String length;
	private String speed;
	private String scientificName;

	// コンストラクタ
	public Theme2(String length, String speed, String scientificName) {
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	// 動物の情報をコンソールに表示
	public void displayInfo() {
		System.out.println("体長：" + length);
		System.out.println("速度：" + speed);
		System.out.println("学名：" + scientificName);
	}

	// Getter メソッド
	public String getLength() {
		return length;
	}

	public String getSpeed() {
		return speed;
	}

	public String getScientificName() {
		return scientificName;
	}
}
/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

package curriculum_n;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2 {
    private String greeting;
    private String sushiTaste;
    private String sushiType;
    private LocalDateTime currentDateTime;

    public Theme2() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiTaste = "この寿司はうまい";
        this.sushiType = "寿司は和食です";
        this.currentDateTime = LocalDateTime.now();
    }

    public String getGreeting() {
        return this.greeting;
    }

    public String getSushiTaste() {
        return this.sushiTaste;
    }

    public String getSushiType() {
        return this.sushiType;
    }

    public String getCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return this.currentDateTime.format(formatter);
    }
}
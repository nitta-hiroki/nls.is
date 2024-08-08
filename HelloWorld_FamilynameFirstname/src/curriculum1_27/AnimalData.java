package curriculum1_27;


import java.util.HashMap;
import java.util.Map;

public class AnimalData {
    private Map<String, Theme2> animals;

    // コンストラクタ
    public AnimalData() {
        animals = new HashMap<>();
        initializeDatabase();
    }

    // データベースの初期化
    private void initializeDatabase() {
        animals.put("ライオン", new Theme2("2.1m", "80km/h", "パンテラ レオ"));
        animals.put("ゾウ", new Theme2("3.2m", "40km/h", "ロキソドンタ・サイクロティス"));
        animals.put("パンダ", new Theme2("1.9m", "30km/h", "アイルロポダ・メラノレウカ"));
        animals.put("チンパンジー", new Theme2("0.94m", "25km/h", "パン・トゥログロディテス"));
        animals.put("シマウマ", new Theme2("2.4m", "65km/h", "チャップマンシマウマ"));
        animals.put("インコ", new Theme2("0.1m", "50km/h", "不明"));
    }

    // 動物名から情報を取得する
    public void printAnimalInfo(String name, String length, String speed) {
        Theme2 animal = animals.get(name);
        if (animal != null) {
            // 入力値とデータベースの値を比較
            String dbLength = animal.getLength().replace("m", "");
            String dbSpeed = animal.getSpeed().replace("km/h", "");
            
            if (dbLength.equals(length) && dbSpeed.equals(speed)) {
                System.out.println("動物名：" + name);
                // 単位を付けて表示
                System.out.println("体長：" + animal.getLength());
                System.out.println("速度：" + animal.getSpeed());
                System.out.println("学名：" + animal.getScientificName());
            } else {
                System.out.println("体長または速度が一致しません。");
            }
        } else {
            System.out.println("指定された動物の情報は見つかりませんでした。");
        }
    }
}
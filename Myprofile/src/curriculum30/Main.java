package curriculum30;

public class Main {
    public static void main(String[] args) {
        // Dataオブジェクトを複数作成
        Data data1 = new Data("鈴木太郎", 20, 1.7, 60);

        // 各Dataオブジェクトの情報を出力
        data1.print();

        // 合計人数を出力
        Data.printTotalCount(1);
    }
}
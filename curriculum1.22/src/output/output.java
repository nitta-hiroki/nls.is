package output;

import curriculum_n.Theme2;

public class output {
    public static void main(String[] args) {
        Theme2 Theme2 = new Theme2();

        System.out.println(Theme2.getGreeting());
        System.out.println(Theme2.getSushiTaste());
        System.out.println(Theme2.getSushiType());
        System.out.println("今の現在日時は" + Theme2.getCurrentDateTime() + "です");
    }
}





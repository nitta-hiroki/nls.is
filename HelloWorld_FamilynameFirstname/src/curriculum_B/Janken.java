package curriculum_B;

/* Janken.java */
public class Janken{
	public static final int WIN = 2;
	public static final int LOOSE = 1;
	public static final int DRAW = 0;
	// ・「0はグー、1：チョキ、2：パー」とすること
	public static final int ROCK_NO = 0;
	public static final int SCISSORS_NO = 1;
	public static final int PAPER_NO = 2;
	public static final String ROCK_CAPTION = "グー";
	public static final String SCISSORS_CAPTION = "チョキ";
	public static final String PAPER_CAPTION = "パー";

	public static final Janken ROCK = new Janken(ROCK_NO, ROCK_CAPTION);
	public static final Janken SCISSORS = new Janken(SCISSORS_NO, SCISSORS_CAPTION);
	public static final Janken PAPER = new Janken(PAPER_NO, PAPER_CAPTION);
	public static final Janken[] HANDS = {ROCK, SCISSORS, PAPER};

	private int handNo;
	private String handCaption;

	private Janken(int handNo, String handCaption) {
		this.handNo = handNo;
		this.handCaption = handCaption;
	}

	public final int getHandNo() {
		return handNo;
	}

	public final String getHandCaption() {
		return handCaption;
	}

	public int battle(Janken enemy) {
		return (this.handNo + 3 - enemy.getHandNo()) % 3;
	}
}

public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    private int n;
    public Yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }
    
    
    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            die1.roll();
        }
        if (dieNumber == 2) {
            die2.roll();
        }
        if (dieNumber == 3) {
            die3.roll();
        }
        if (dieNumber == 4) {
            die4.roll();
        }
        if (dieNumber == 5) {
            die5.roll();
        }
    }
    public String toString() {
        return "Dice values: " +die1.getValue()+ ", " +die2.getValue()+ ", " +die3.getValue()+ ", " +die4.getValue()+ ", " +die5.getValue();
    }
    public String summarize(int c1, int c2, int c3, int c4, int c5, int str) {
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        str = toString;
        for (int i = 0; i < toString.length(); i++) {
            
        }
    }
    
}

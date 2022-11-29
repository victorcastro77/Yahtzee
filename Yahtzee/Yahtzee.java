public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    private int n;
    private String diceValues;
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
        diceValues = "Dice values: " +die1.getValue()+ ", " +die2.getValue()+ ", " +die3.getValue()+ ", " +die4.getValue()+ ", " +die5.getValue();
        return diceValues;
    }
    
    public String summarize() {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int[] values = 
        String str = "";
        
        for (int i = 0; i < diceValues; i++) {
            if (i == 1) {
                c1++;
            }
            if (i == 2) {
                c2++;
            }
            if (i == 3) {
                c3++;
            }
            if (i == 4) {
                c4++;
            }
            if (i == 5) {
                c5++;
            }
            if (i == 6) {
                c6++;
            }
        }
        return str = "1-"+c1+", 2-"+c2+", 3-"+c3+", 4-"+c4+", 5-"+c5;
    }
    
}
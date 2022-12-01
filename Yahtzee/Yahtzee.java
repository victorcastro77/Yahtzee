public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    private Die6 die6;
    private int n;
    private String diceValues;
    public Yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
        die6 = new Die6();
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
        int[] count = {0,0,0,0,0,0};
        count[die1.getValue()]++;
        count[die2.getValue()]++;
        count[die3.getValue()]++;
        count[die4.getValue()]++;
        count[die5.getValue()]++;
        count[die6.getValue()]++;

        return  ("1-"+count[1]+", 2-"+count[2]+", 3-"+count[3]+", 4-"+count[4]+", 5-"+count[5]+", 6-"+count[6]);
    }
    
}
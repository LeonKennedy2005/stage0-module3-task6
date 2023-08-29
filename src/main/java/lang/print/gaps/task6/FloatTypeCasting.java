package lang.print.gaps.task6;
import java.lang.Math;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float numberRounded = Math.round(numberToBeRounded);
        System.out.println(numberRounded);
    }
    public static void main(String[] args){
        FloatTypeCasting numberRounder = new FloatTypeCasting();
        float numberToBeRounded = 28.8f;
        numberRounder.roundNumber(numberToBeRounded);

    }
}

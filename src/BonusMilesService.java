public class BonusMilesService {
    int result;

    public int calculate(int price) {
        if (price > 20) {
            result = price / 20;
        } else {
            result = 0;
        }
        return result;
    }
}

public class BonusMilesService {
    public int calculate(int ticket) {
        int numbertic = 7;
        int bonus = 20;
        int mils = ticket * numbertic / bonus;
        return mils;
    }
}
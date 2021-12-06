public class BonusMilesService {
    public int calculate(int ticket) {
        int bonus = 20;
        int mils = ticket  / bonus;
        return mils;
    }
}
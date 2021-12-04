public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 25;
        int mils = service.calculate(ticket);
        System.out.println(mils);
    }
}

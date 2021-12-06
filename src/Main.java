public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 1800;
        int mils = service.calculate(ticket);
        System.out.println(mils);
    }
}

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 100;
        int step = 20;
        int miles = service.calculate(price, step); // должно получиться 500
        System.out.println(miles);
    }
}
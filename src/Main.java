public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 110;
        double heightInMeters = 1.82;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}
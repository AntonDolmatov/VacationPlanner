import ru.netology.services.VacationPlanner;

public class Main {

    public static void main(String[] args) {

        VacationPlanner service = new VacationPlanner();
        System.out.println(service.calculateVacationMonths(10_000, 3_000, 20_000));

    }
}

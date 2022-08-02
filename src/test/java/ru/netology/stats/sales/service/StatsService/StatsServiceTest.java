import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.sales.service.StatsService;

import java.util.Arrays;

public class StatsServiceTest {
    //Рассчет месяца минимальных продаж
    @Test
    public void MinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 18, 19, 20, 7, 14, 14, 18};
        long expectedsales = 9;
        long actualsales = service.minSales(sales);
        Assertions.assertEquals(expectedsales, actualsales);
    }

    //Рассчет месяца максимальных продаж
    @Test
    public void MaxSales() {
        StatsService service = new StatsService();
        long[] maxsales = {8, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};
        long expectedsales = 8;
        long actualsales = service.maxSales(maxsales);
        Assertions.assertEquals(expectedsales, actualsales);
    }

    //Рассчет средней суммы продаж
    @Test
    public void AverageAmount() {
        StatsService service = new StatsService();
        int[] average = {8, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};
        int expectedsales = 14;
        int actualsales = service.averageamount(average);
        Assertions.assertEquals(expectedsales, actualsales);
    }

    //Рассчет суммы всех продаж
    @Test
    public void Totalamount() {
        StatsService service = new StatsService();
        int[] total = {8, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};
        int expectedsales = 176;
        int actualsales = service.totalamount(total);
        Assertions.assertEquals(expectedsales, actualsales);
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    public void Belowaverage() {
        StatsService service = new StatsService();
        int[] below = {8, 15, 13, 15, 17, 16, 19, 20, 7, 15, 14, 18};
        int expectedsales = 3;
        int actualsales = service.belowaverage(below);
        Assertions.assertEquals(expectedsales, actualsales);
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    @Test
    public void highsales() {
        StatsService service = new StatsService();
        int[] high = {8, 15, 13, 15, 17, 16, 19, 20, 7, 15, 14, 18};
        int expectedsales = 8;
        int actualsales = service.highsales(high);
        Assertions.assertEquals(expectedsales, actualsales);

    }
}

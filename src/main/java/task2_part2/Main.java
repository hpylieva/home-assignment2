package task2_part2;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        DataFactory dataFactory = new DataFactory();

        for ( int i=1; i<11; i++ )
        {
            int codeToProcess = dataFactory.getNumberBetween(100,599);
            httpService.handleHttpCode(codeToProcess);
            Thread.sleep(1000);
        }
    }
}

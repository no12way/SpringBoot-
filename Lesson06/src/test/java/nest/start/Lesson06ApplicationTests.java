package nest.start;

import nest.start.service.MultiConfigService;
import nest.start.service.SomeService;
import nest.start.pk2.ReadConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lesson06ApplicationTests {
    @Autowired
    private SomeService service;

    @Autowired
    private ReadConfig readConfig;

    @Autowired
    private MultiConfigService multiConfigService;
    @Test
    void contextLoads() {
        service.printValue();
        readConfig.print();
        multiConfigService.print();
    }

}

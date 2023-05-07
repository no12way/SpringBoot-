package nest;

import nest.bundle.NestAppBean;
import nest.bundlecollection.CollectionConfig;
import nest.bundleother.ConfigXml;
import nest.datasource.Group;
import nest.service.SomeService;
import nest.service.aspect.Strength;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lession7ApplicationTests {
    @Autowired
    private NestAppBean nestAppBean;

    @Autowired
    private ConfigXml configXml;

    @Autowired
    private CollectionConfig collectionConfig;

    @Autowired
    private Group group;

    @Autowired
    private SomeService someService;

    @Test
    void contextLoads() {
        System.out.println(nestAppBean);
        System.out.println(configXml.infoO());
        System.out.println(collectionConfig);
        System.out.println(group);
        someService.save("10","10");
    }

}

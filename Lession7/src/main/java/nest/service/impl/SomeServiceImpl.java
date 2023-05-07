package nest.service.impl;

import nest.service.SomeService;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void query(Integer id) {
        System.out.println("Service业务方法的query执行了");
    }

    @Override
    public void save(String name, String code) {
        System.out.println("Service业务方法的save方法执行了");
    }
}

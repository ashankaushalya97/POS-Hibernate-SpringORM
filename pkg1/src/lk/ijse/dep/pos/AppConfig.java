package lk.ijse.dep.pos;

import lk.ijse.dep.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.dep.pos.entity.Customer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.dep.pos"})
public class AppConfig {
}

package hello.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    private Logger logger = LoggerFactory.getLogger(MyService.class);

    @Autowired
    private Environment environment;

    @PostConstruct
    public void postSetup() {
        print("BOOTAPP_USR");
        print("ENV_NAME");
        print("BOOTAPP_USR");
        print("SERVER_PORT");
    }

    @PreDestroy
    public void postDestruct() {
        logger.info("I am destroying tata");
        logger.info("tata");
        logger.info("tata");
        logger.info("tata");
    }

    private void print(String key) {
        logger.debug("--------" + key + "---------------------------");
        logger.info(environment.getProperty(key));
    }

}

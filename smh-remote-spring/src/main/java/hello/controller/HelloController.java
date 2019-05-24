package hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("${spring.data.rest.base-path}/foos")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @ApiOperation(value = "says hello",
            notes = "Returns Appointment Details Like Doctor's Name, Timing",
            response = String.class)
    @GetMapping(value="/hello")
    public String hello() {
        logger.info("Hello info  is reached");
        logger.debug("Hello debug  is reached");
        logger.error("Hello error  is reached");
        return "Hello response";
    }

}

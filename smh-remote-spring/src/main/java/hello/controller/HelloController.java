package hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/foos")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @ApiOperation(value = "says hello",
            notes = "Returns Appointment Details Like Doctor's Name, Timing",
            response = String.class)
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        logger.info("Hello info  is reached");
        logger.debug("Hello debug  is reached");
        logger.error("Hello error  is reached");
        return "Hello response";
    }

}

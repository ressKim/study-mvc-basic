package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);
        // , 방식으로 사용해야 한다 + 로 만들어버리면 연산은 일어나고 출력은 안하는 상태가 된다. 중요**
//        log.trace(" trace log = {}" + name);

        log.trace(" trace log = {}", name);
        log.debug(" debug log = {}", name);
        log.info(" info log ={}", name);
        log.warn(" warn log ={}", name);
        log.error(" error log ={}", name);
        return "ok";
    }
}

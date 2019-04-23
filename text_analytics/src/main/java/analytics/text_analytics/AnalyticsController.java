package analytics.text_analytics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @GetMapping("/greeting")
    public String myGreetings(@RequestParam(value="name", defaultValue="World",required=false) String name){
        String template = "Hello, %s!";
        return String.format(template, name);
    }

    @PostMapping("/json")
    public String json(@RequestBody JSONSchema request_body){
        return request_body.getText();
    }
}
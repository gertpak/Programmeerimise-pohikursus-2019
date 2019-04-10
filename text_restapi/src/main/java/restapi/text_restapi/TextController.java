package restapi.text_restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TextController {

    @PostMapping("/text")
    public Text addText(@RequestBody Map<String, String> body) {
        String input = body.get("text");
        Text newText = new Text(input);
        return newText;
    }


}

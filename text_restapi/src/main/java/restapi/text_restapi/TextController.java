package restapi.text_restapi;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TextController {

    @PostMapping("/text")
    public Text addText(@RequestBody HashMap<String, String> body) {
        String input = body.get("text");
        Text newText = new Text(input);
        return newText;
    }


}

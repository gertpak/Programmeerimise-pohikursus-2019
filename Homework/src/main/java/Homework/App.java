package Homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
@RestController
@SpringBootApplication

public class App {

    String text;
    String words[];
    int isUppercaseCounter = 0;
    int wordCounter = 0;
    HashMap<String, Integer> word_counter = new HashMap<String, Integer>();

    @RequestMapping("/answer")
    public String answer(String txt){
        System.out.println(txt);
        text = txt;
        this.SplitIntoWords();
        this.countUppercasePercentage();
        this.countTheWords();
        //System.out.println('{"words": ['+ word_counter +'],"word_count": '+wordCounter+', "starts_with_uppercase": '+isUppercaseCounter+'}');
        System.out.format("{words:[%s], word_count: %d, starts_with_uppercase: %d} %n", word_counter, wordCounter, isUppercaseCounter);
        return txt; 
    }


    public void SplitIntoWords(){
        this.words = this.text.split("\\s+");
    }
    public void countUppercasePercentage(){
        double amountOfWords = this.words.length;
        for (String word : this.words) {
            char firstLetter = word.charAt(0);
            if(Character.isUpperCase(firstLetter)) {
                isUppercaseCounter++;
            }
        }
    }
    public void countTheWords(){
        for (String word : this.words) {
            wordCounter++;
            if(this.word_counter.get(word) == null){
                this.word_counter.put(word, 1);
            } else {
                int f = this.word_counter.get(word);
                this.word_counter.put(word, f+1);
            }
        }
    }


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
//http://localhost:8080/testhtml.html
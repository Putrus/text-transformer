package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.transformer.logic.InterfaceTextTransformer;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.ArrayList;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {
    public static void main(String[] args){
        LaunchPanel panel = new LaunchPanel();
        SpringApplication.run(TextTransformerApplication.class, args);

    }
}

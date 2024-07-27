package com.open.spotify.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@elegirCancion",
        glue = "com.open.spotify.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class ElegirCancionRunner {
}
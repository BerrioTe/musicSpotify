package com.open.spotify.steps;

import com.open.spotify.pageObjects.SesionSpotifyPage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static junit.framework.TestCase.assertTrue;

public class ValidacionSesionSpotifyStep {
    @Page
    SesionSpotifyPage sesionSpotifyPage;

    @Step
    public void assertionSesion(){
        WaitUntil.the(sesionSpotifyPage.getLblvalidacionLogin(), WebElementStateMatchers.isVisible());
        Assert.assertEquals(true, (sesionSpotifyPage.getDriver().
                findElement(sesionSpotifyPage.getLblvalidacionLogin()).isDisplayed()));

        assertTrue("La etiqueta de validación de login no se muestra", sesionSpotifyPage.getDriver().
                findElement(sesionSpotifyPage.getLblvalidacionLogin()).isDisplayed());
    }
}

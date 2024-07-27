package com.open.spotify.stepsDefinitions;

import com.open.spotify.steps.HomeSpotifyStep;
import com.open.spotify.steps.LoginSpotifyStep;
import com.open.spotify.steps.ValidacionSesionSpotifyStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    @Managed
    WebDriver driver;

    @BeforeAll
    public void setUpClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    public void setUpTest() {
        driver = new ChromeDriver();
    }

    @Steps
    HomeSpotifyStep homeSpotifyStep;
    @Steps
    LoginSpotifyStep loginSpotifyStep;
    @Steps
    ValidacionSesionSpotifyStep validacionSesionSpotifyStep;


    @Dado("que el usuario ingresa a la pagina de Spotify")
    public void queElUsuarioIngresaALaPaginaDeSpotify() {
        homeSpotifyStep.openBrowser();
    }
    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales() {
        homeSpotifyStep.clickLogin();
        loginSpotifyStep.escribirCrdenciales();
        loginSpotifyStep.clickInputCredenciales();
    }
    @Entonces("Valida que inicio sesion correctamente")
    public void validaQueInicioSesionCorrectamente() {
        validacionSesionSpotifyStep.assertionSesion();
    }
}

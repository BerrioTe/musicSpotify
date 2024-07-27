package com.open.spotify.stepsDefinitions;

import com.open.spotify.steps.BuscarCancionSpotifyStep;
import com.open.spotify.steps.ReproducirCancionStep;
import com.open.spotify.steps.ValidacionCancionStep;
import com.open.spotify.steps.ValidacionSesionSpotifyStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ElegirCancionStepDefinition {
    @Steps
    ValidacionSesionSpotifyStep validacionSesionSpotify;
    @Steps
    BuscarCancionSpotifyStep buscarCancionSpotifyStep;
    @Steps
    ReproducirCancionStep reproducirCancionStep;

    @Steps
    ValidacionCancionStep validacionCancionStep;
    @Dado("que el usuario esta logueado en Spotify")
    public void queElUsuarioEstaLogueadoEnSpotify() {
        validacionSesionSpotify.assertionSesion();
    }
    @Cuando("busca una cancion que quiere escuchar")
    public void buscaUnaCancionQueQuiereEscuchar() {
        buscarCancionSpotifyStep.clickbuscar();
        buscarCancionSpotifyStep.escribirCancion();
        buscarCancionSpotifyStep.elegirCancion();
        reproducirCancionStep.reproducirCancion();
    }
    @Entonces("verifica que sea la cancion seleccionada")
    public void verificaQueSeaLaCancionSeleccionada() {
        validacionCancionStep.validarCancion();
    }


}

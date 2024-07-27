#language: es
Característica: Reproducir cancion En Spotify

  Antecedentes:
    Dado que el usuario ingresa a la pagina de Spotify
    Cuando ingresa sus credenciales
  @elegirCancion
  Escenario: Elegir cancion
    Dado que el usuario esta logueado en Spotify
    Cuando busca una cancion que quiere escuchar
    Entonces verifica que sea la cancion seleccionada

package com.mycompany.youtube;

public class Visualizacion {
    
    private Usuario espectador;
    private Videos video;

    public Visualizacion(Usuario espectador, Videos video) {
        this.espectador = espectador;
        this.video = video;
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Videos getVideo() {
        return video;
    }

    public void setVideo(Videos video) {
        this.video = video;
    } 
}
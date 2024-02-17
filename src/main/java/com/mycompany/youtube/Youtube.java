
package com.mycompany.youtube;

public class Youtube {

    public static void main(String[] args) {
       Usuario usuario= new Usuario("Desire 2G");
       Videos videos= new Videos ("Aprende Java pt.1",2543,"https;//yotube.java");
       usuario.subirVideo(videos);
       usuario.mostrarInfoUsuario();
    }
}


package com.mycompany.youtube;

 
public class Usuario {
    public String  nombre;
   public Videos videosubido;
  

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Videos getVideosubido() {
        return videosubido;
    }

    public void subirVideo(Videos videosubido) {
        this.videosubido = videosubido;
    }
   
    public void mostrarInfoUsuario(){
        System.out.println("Usuario: "+nombre);
        if(videosubido != null){
      System.out.println("Ultimo video Subido: "+videosubido.getTitulo());
    } 
    else{
        System.out.println("aun no se ha subido videos");
}}}


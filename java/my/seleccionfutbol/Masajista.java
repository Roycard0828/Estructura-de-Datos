/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.seleccionfutbol;

/**
 *
 * @author roy
 */
public class Masajista extends SeleccionFutbol {
    
    private String titulacion;
    private int aniosExperiencia;
    
    //Construcor
    public Masajista(String nombre, int id, String apellidos, int edad, String titulacion, int aniosExperiencia){
        super(nombre,id,apellidos,edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
        
    }

    //Metodos sobreescritos
    @Override
    public String Entrenamiento() {
        return "Prepara musculo";
    }

    @Override
    public String Partido() {
        return "Hace masaje";
    }
    
    //Metodo propio
    public void DaMasaje(){
        System.out.println("Da un mansaje");
    }
}

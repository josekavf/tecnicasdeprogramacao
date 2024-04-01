/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex3.entities;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class Movie
 */

//Utilizando herança da classe Product na classe Movie.
public class Movie extends Product {
    
    //Abstração de atributo.
    private String director;

    //Construtores sobrecarregados para herdar o construtor da classe mãe.
    public Movie(String director, String name, double price, Integer numberOfCopies) {
        super(name, price, numberOfCopies);
        this.director = director;
    }

    public Movie() {
       
    }
    
    //Get e Set do atributo encapsulado director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

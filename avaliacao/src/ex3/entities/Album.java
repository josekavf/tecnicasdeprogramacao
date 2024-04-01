/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3.entities;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class Album
 */
//Utilizando herança da classe Product na classe Album
public class Album extends Product {

    //Abstração de atributo.
    private String artist;

    //Construtores sobrecarregados para herdar o construtor da classe mãe.
    public Album() {
        super();
    }

    public Album(String artist, String name, double price, Integer numberOfCopies) {
        super(name, price, numberOfCopies);
        this.artist = artist;
    }

    // Get e Set do atributo especifico da classe Album.
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}

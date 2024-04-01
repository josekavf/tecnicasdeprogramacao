/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex3.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class StockKeeper
 */
public class StockKeeper {
    
    private String name;
    private List<Movie> movieList;
    private List<Album> albumList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StockKeeper(String name) {
        this.name = name;
        this.albumList = new ArrayList<>();
        this.movieList = new ArrayList<>();
    }
    
    
    public void manageMovie(Movie movie, String name, String director, Double price, Integer numberOfCopies){
         movie.setName(name);
         movie.setDirector(director);
         movie.setPrice(price);
         movie.setNumberOfCopies(numberOfCopies);
         this.movieList.add(movie);
    }
    
        public void manageAlbum(Album album, String name, String artist, Double price, Integer numberOfCopies){
         album.setName(name);
         album.setArtist(artist);
         album.setPrice(price);
         album.setNumberOfCopies(numberOfCopies);
         this.albumList.add(album);
    }
    

}

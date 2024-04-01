/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex3.entities;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class Product
 */
public class Product {
    
    //Abstração do Produto de forma generica.
    private String name;
    private Double price;
    private Integer numberOfCopies;

    
    //Metodo construtor sobrecarregado com os parametros para setar os atributos
    public Product(String name, double price, Integer numberOfCopies) {
        this.name = name;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    } 
    //Metodo construtor sobrecarregado sem parametros de entrada.
    public Product() {
    }
    
    // Getters e Setter dos atributos encapsulados.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    
    public void sellCopies(){
       this.numberOfCopies--;
    }
    public void orderCopies(int num){
       this.numberOfCopies += num;    
    }
}

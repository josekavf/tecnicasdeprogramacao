/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex4.entities;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class Produto
 */
public class Produto {
    
    //propriedades privadas do Produto.
    private Integer id;
    private String nome;
    private Double preco;
    private Integer qtd;

    //Construtor da classe.
    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd = 0;

    }

    //metodos Get
    public Integer getID() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public Integer getQtd() {
        return this.qtd;
    }

    public void adicionar(Integer qtdAdicionada) {
        if (qtdAdicionada > 0) {
            this.qtd += qtdAdicionada;
        }
    }

    public void remover(Integer qtdRemovida) {
        if (qtdRemovida <= this.qtd) {
            this.qtd -= qtdRemovida;
        }
    }

    public Double totalProduto() {
        return (Double) (this.preco*this.qtd);
    }

}

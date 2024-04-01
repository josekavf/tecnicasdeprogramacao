/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex4.entities;

import java.util.ArrayList;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class Pedido
 */
public class Pedido {
    
    //propriedades do pedido
    private ArrayList<Produto> listaProdutos;
    private Double totalPedido;
    private Double totalParcial;

    public Pedido() {
        this.totalPedido = 0.00;
        this.totalParcial = 0.00;
        this.listaProdutos = new ArrayList<>();
    }

    public Double getTotalPedido() {
        return this.totalPedido;
    }

    public void adicionarProduto(Produto prod) {
        this.listaProdutos.add(prod);
        this.calcularTotalPedido();
    }

    public void adicionarUmProduto(Integer id) {
        for (Produto prod : listaProdutos) {
            if (prod.getID().equals(id)) {
                this.listaProdutos.get(id).adicionar(1);
                this.calcularTotalPedido();
            }
        }
    }

    public void removerUmProduto(Integer id) {
        for (Produto prod : listaProdutos) {
            if (prod.getID().equals(id)) {
                this.listaProdutos.get(id).remover(1);
                this.calcularTotalPedido();
            }
        }
    }

    private void calcularTotalPedido() {
        this.totalPedido = 0.00;
        for (Produto prod : listaProdutos) {
            this.totalPedido += prod.totalProduto();
        }
        this.totalPedido -= this.totalParcial;
    }

    public void listarProdutos() {
        System.out.println("ID  -  Nome  -  Qtd  -  Preco");
        for (Produto prod : listaProdutos) {

            System.out.println(prod.getID().toString() + "- "
                    + prod.getNome() + "- "
                    + prod.getQtd().toString() + "- "
                    + prod.getPreco().toString());

        }
       System.out.println("");
    }

    public void pagarPacial(Double valorParcial) {
        if (valorParcial < this.totalPedido) {
            this.totalParcial += valorParcial;
        }
    }
   public void pagarTotal()
   {
      this.listarProdutos();
      System.out.println("Total da conta: "+this.totalPedido.toString());
      this.totalParcial = 0.00;
      this.totalPedido = 0.00;
   }

}

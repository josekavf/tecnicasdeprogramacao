/*
 * Copyright (C) 2024 Jose Carlos Vaz Felipe <joseka.vf@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package avaliacao.n1;

import java.util.ArrayList;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com>
 * @date 08/03/2024
 * @brief Class Pedido
 */
public class Pedido {

    //propriedades do pedido
    private ArrayList<Produto> _listaProdutos;
    private Double _totalPedido;
    private Double _totalParcial;

    public Pedido() {
        this._totalPedido = 0.00;
        this._totalParcial = 0.00;
        this._listaProdutos = new ArrayList<Produto>();
    }

    public Double getTotalPedido() {
        return this._totalPedido;
    }

    public void adicionarProduto(Produto prod) {
        this._listaProdutos.add(prod);
        this.calcularTotalPedido();
    }

    public void adicionarUmProduto(Integer id) {
        for (Produto prod : _listaProdutos) {
            if (prod.getID().equals(id)) {
                this._listaProdutos.get(id).adicionar(1);
                this.calcularTotalPedido();
            }
        }
    }

    public void removerUmProduto(Integer id) {
        for (Produto prod : _listaProdutos) {
            if (prod.getID().equals(id)) {
                this._listaProdutos.get(id).remover(1);
                this.calcularTotalPedido();
            }
        }
    }

    private void calcularTotalPedido() {
        this._totalPedido = 0.00;
        for (Produto prod : _listaProdutos) {
            this._totalPedido += prod.totalProduto();
        }
        this._totalPedido -= this._totalParcial;
    }

    public void listarProdutos() {
        System.out.println("ID  -  Nome  -  Qtd  -  Preco");
        for (Produto prod : _listaProdutos) {

            System.out.println(prod.getID().toString() + "- "
                    + prod.getNome() + "- "
                    + prod.getQtd().toString() + "- "
                    + prod.getPreco().toString());

        }
       System.out.println("");
    }

    public void pagarPacial(Double valorParcial) {
        if (valorParcial < this._totalPedido) {
            this._totalParcial += valorParcial;
        }
    }
   public void pagarTotal()
   {
      this.listarProdutos();
      System.out.println("Total da conta: "+this._totalPedido.toString());
      this._totalParcial = 0.00;
      this._totalPedido = 0.00;
   }
}

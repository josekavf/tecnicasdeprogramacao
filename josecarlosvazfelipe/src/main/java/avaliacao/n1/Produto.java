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

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com>
 * @date 08/03/2024
 * @brief Class Produto
 */
public class Produto {

    //propriedades privadas do Produto.
    private Integer _id;
    private String _nome;
    private Double _preco;
    private Integer _qtd;

    //Construtor da classe.
    public Produto(Integer id, String nome, Double preco) {
        this._id = id;
        this._nome = nome;
        this._preco = preco;
        this._qtd = 0;

    }

    //metodos Get
    public Integer getID() {
        return this._id;
    }

    public String getNome() {
        return this._nome;
    }

    public Double getPreco() {
        return this._preco;
    }

    public Integer getQtd() {
        return this._qtd;
    }

    public void adicionar(Integer qtdAdicionada) {
        if (qtdAdicionada > 0) {
            this._qtd += qtdAdicionada;
        }
    }

    public void remover(Integer qtdRemovida) {
        if (qtdRemovida <= this._qtd) {
            this._qtd -= qtdRemovida;
        }
    }

    public Double totalProduto() {
        return (Double) (this._preco*this._qtd);
    }

}

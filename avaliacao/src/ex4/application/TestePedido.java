/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex4.application;

import ex4.entities.Pedido;
import ex4.entities.Produto;
import java.util.Scanner;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com>  e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class TestePedido
 */
public class TestePedido {
    
    
     //variavel global de controle do ID do produto.
    public static Integer idProduto = 1;

    //função para cadastrar novo produto.
    public static Produto cadastrarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CadastrarProduto");
        System.out.println("Informe o nome do produto: ");
        String nomeP = sc.next();
        System.out.println("Informe o preco do produto: ");
        Double precoP = sc.nextDouble();
        Produto resultado = new Produto(idProduto, nomeP, precoP);
        idProduto++;
        return resultado;
    }

    //função para retornar ID do produto selecionado.
    public static Integer RetornaIDListaProdutos(Pedido ped) {
        Scanner sc = new Scanner(System.in);
        ped.listarProdutos();
        System.out.println("Informe o ID do produto: ");
        Integer IdRetorno = sc.nextInt();
        return IdRetorno;
    }

    //função para informar valor do pagamento parcial
    public static Double PagamentoParcial(Pedido ped) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor a pagar: ");
        Double pagamento = sc.nextDouble();
        return pagamento;
    }

    //Validar Total
    public static int ValidarTotal(Pedido ped) {
        if (ped.getTotalPedido().equals(0.00)) {
            return 7;
        } else {
            System.out.println("Valor em aberto de: "+ped.getTotalPedido().toString());
            System.out.println("Pague o pedido aberto antes de encerrar");
            return 0;
        }

    }

    public static void main(String[] args) {
        //Declaração de variaveis
        int opcao = 0;

        Pedido pedidoAberto = new Pedido();
        Scanner sc = new Scanner(System.in);
        
        //Inicialização dos produtos precadastrados.
        pedidoAberto.adicionarProduto(new Produto(idProduto, "café expresso", 0.75));
        idProduto++;
        pedidoAberto.adicionarProduto(new Produto(idProduto, "café capuccino", 1.00));
        idProduto++;
        pedidoAberto.adicionarProduto(new Produto(idProduto, "leite com café", 1.25));
        idProduto++;
        
        //doWhile que apresenta o menu de opções de um pedido de uma cafeteria.
        do {
            System.out.println("Forneça uma opção: \n"
                    + "1 - Cadastrar novo produto \n"
                    + "2 - Adicionar produto \n"
                    + "3 - Remover produto­; \n"
                    + "4 -­ Pagar conta Parcial \n"
                    + "5 ­- Pagar total \n"
                    + "6 - Sair");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    pedidoAberto.adicionarProduto(cadastrarProduto());
                    break;
                case 2:
                    pedidoAberto.adicionarUmProduto(RetornaIDListaProdutos(pedidoAberto));
                    break;
                case 3:
                    pedidoAberto.removerUmProduto(RetornaIDListaProdutos(pedidoAberto));
                    break;
                case 4:
                    pedidoAberto.pagarPacial(PagamentoParcial(pedidoAberto));
                    break;
                case 5:
                    pedidoAberto.pagarTotal();
                    break;
                case 6:
                    opcao = ValidarTotal(pedidoAberto);
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;

            }
        } while (opcao != 7);


    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao.n1;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */
import java.util.Scanner;

public class Prova1 {

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
            /* 


                      System.out.println("Forneça uma opção: \n"
                    + "1 ­ café expresso; \n"
                    + "2 ­ café capuccino; \n"
                    + "3 ­ leite com café; \n"
                    + "4 ­ totalizar vendas;");

            if (opcao == 1) {
                qde_expresso++;
            } else if (opcao == 2) {
                qde_capuccino++;
            } else if (opcao == 3) {
                qde_leite_com_cafe++;
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
             */

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

        /*
        
        // Calcula o valor total do cafe expresso.
        valor_expresso = qde_expresso * 0.75;
        //Calcula o valor total do cafe capuccino.
        valor_capuccino = qde_capuccino;
        //Calcula o valor total do leite com cafe
        valor_leite_com_cafe = qde_leite_com_cafe * 1.25;
        //Calcula a quantidade total de itens vendidos. 
        qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe;
        //Calcula o valor total dos itens vendidos.
        valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe;

        //Informa ao usuario a quantidade total de cafe expresso e o valor total do mesmo.
        System.out.println("Qde café expresso: " + qde_expresso + " ­ valor: " + valor_expresso);
        //Informa ao usuario a quantidade total de cafe capuccino e o valor total do mesmo.
        System.out.println("Qde café capuccino: " + qde_capuccino + " ­ valor: " + valor_capuccino);
        //Informa ao usuario a quantidade total de leite com cafe e o valor total do mesmo.
        System.out.println("Qde leite com café: " + qde_leite_com_cafe
                + " ­ valor: " + valor_leite_com_cafe);
        //Informa ao usuario a quantidade total de todos os itens e o valor total pedido.
        System.out.println("Qde cafés vendidos: " + qde_cafes_vendidos
                + " ­ valor cafés vendidos: " + valor_cafes_vendidos);
        
         */
    }

}

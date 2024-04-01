/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.application;

import ex2.entities.NumeroSecreto;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class JogoDoNumeroSecreto
 */
public class JogoDoNumeroSecreto {

    public static void main(String[] args) {
        // TODO code application logic here
        long palpite = -2;
        NumeroSecreto ns = new NumeroSecreto();
        ns.sortear();
        do {
            palpite = Math.round(Math.random() * 100);
        } while (ns.adivinhar(palpite) != 0);
    }
}

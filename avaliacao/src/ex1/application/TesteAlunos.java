/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.application;

import ex1.entities.Aluno;
import java.util.Scanner;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 */
public class TesteAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Aluno a1, a2, a3;

        a1 = new Aluno();
        System.out.println("Informe a nota1 do primeiro aluno");
        a1.setN1(s.nextDouble());
        System.out.println("Informe a nota2 do primeiro aluno");
        a1.setN2(s.nextDouble());
        System.out.println("Informe a nota3 do primeiro aluno");
        a1.setN3(s.nextDouble());
        System.out.println("Informe a nota4 do primeiro aluno");
        a1.setN4(s.nextDouble());

        a2 = new Aluno();
        System.out.println("Informe a nota1 do segundo aluno");
        a2.setN1(s.nextDouble());
        System.out.println("Informe a nota2 do segundo aluno");
        a2.setN2(s.nextDouble());
        System.out.println("Informe a nota3 do segundo aluno");
        a2.setN3(s.nextDouble());
        System.out.println("Informe a nota4 do segundo aluno");
        a2.setN4(s.nextDouble());

        a3 = new Aluno();
        System.out.println("Informe a nota1 do terceiro aluno");
        a3.setN1(s.nextDouble());
        System.out.println("Informe a nota2 do terceiro aluno");
        a3.setN2(s.nextDouble());
        System.out.println("Informe a nota3 do terceiro aluno");
        a3.setN3(s.nextDouble());
        System.out.println("Informe a nota4 do terceiro aluno");
        a3.setN4(s.nextDouble());
        
        a1.media();
        a2.media();
        a3.media();
        
        System.out.println(String.format("A media geral dos alunos é: %.2f",Aluno.media_total()));
    }

}

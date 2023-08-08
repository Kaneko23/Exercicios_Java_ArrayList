/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kaue_brito
 */
public class Main {

    public static void main(String[] args) {
        String resp;
        do{
            resp = JOptionPane.showInputDialog("Bem vindo aos Exercicios 1 "+"\n digite:"+ "\n 1 - Numeros pares e impares"+"\n 2 - Temperatura" + "\n 3- Detetive");
            switch(resp){
                case "1":
                    exe1();
                break;
                case "2":
                    exe2();
                break;
                case "3":
                    exe3();
                break;
                default:
                    resp = "x";
                break;
            }
        }while(resp.equals("x"));
    }

    public static void exe1() {

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numList.add(Integer.parseInt(JOptionPane.showInputDialog("Informe um numero")));
            if (numList.get(i) % 2 == 0) {
                par.add(numList.get(i));
            } else {
                impar.add(numList.get(i));
            }
        }
        JOptionPane.showMessageDialog(null, "os numeros são: " + numList.toString() + "\n os numeros são pares: " + par.toString() + "\n os numeros são impares: " + impar.toString());
    }

    public static void exe2() {
        ArrayList<Double> temp = new ArrayList<>();
        int i = 0;
        double somaTotal = 0.0;
        while (i < 12) {
            temp.add(Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura do mês: " + (i + 1))));
            somaTotal += temp.get(i);
            i++;
        }
        double media = somaTotal / temp.size();

        for (int j = 0; j < temp.size(); j++) {
            if (temp.get(j) > media) {
                JOptionPane.showMessageDialog(null, "Mês " + (j + 1) + ": " + temp.get(j) + "C°");
            }

        }
    }

    public static void exe3() {
        int lvlSus = 0;
        ArrayList<String> pergs = new ArrayList<>();
        pergs.add("telefonou para a vitima? ");
        pergs.add("Esteve no local do crime? ");
        pergs.add("Mora perto da vítima? ");
        pergs.add("devia para vítima? ");
        pergs.add("Já trabalhou com a vítima?");
        for (String pergunta : pergs) {
            int resposta = JOptionPane.showConfirmDialog(null, pergunta, "Sus??", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                lvlSus++;
            }

        }
        switch (lvlSus) {
            case 2:
                JOptionPane.showMessageDialog(null, "Suspeito!!");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Cumplíce!!");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Assassino!!;-;");
                break;
            default:
                JOptionPane.showMessageDialog(null, "inocente<3");
                break;

        }
    }
}

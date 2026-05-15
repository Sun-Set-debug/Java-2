/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuche
 */
public class Main {
    public static void main(String args[]) {
        EthicsCase a = new IntellectualPropertyCase("x", "y", "z");
        System.out.println(a);
        System.out.println(a.getCaseTitle());
        System.out.println(a.getDescription());
        System.out.println(a.getCategory());
        IntellectualPropertyCase b =(IntellectualPropertyCase)a;
        System.out.println(b.getIpType());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_edit;

/**
 *
 * @author 52553
 */
public class Tarea1_Edit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="Fernando", s2="Ternhando";
        System.out.println(edit(s1, s2, 0));
    }
    
    public static int edit(String s1, String s2, int c){
        if(s1.length()==0||s2.length()==0)
            return c+s1.length()+s2.length();
        if(s1.charAt(0)==s2.charAt(0))
            return edit(s1.substring(1), s2.substring(1), c);
        int sus=edit(s1.substring(1), s2.substring(1), c+1);
        int ins=edit(s1.substring(1), s2, c+1);
        int bor=edit(s1, s2.substring(1), c+1);
        int aux=Math.min(sus, ins);
        return Math.min(aux, bor);
    }

}

package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;

public class Board {
	boolean[][] board;
	   
    boolean isWall(int w,int h){
        return board[w][h];
    }//isWall
   
    void gerarLabirinto(String fn){
        String a,str ;
        String[] b;
        try{
            BufferedReader br = new BufferedReader(new FileReader(fn));
           
            a = br.readLine();
            b = a.split(" ");
            boolean[][] bb= new boolean[Integer.parseInt(b[0])][Integer.parseInt(b[1])]  ;
            int row = 0;
           
            while((str = br.readLine())!=null){
                StringBuilder linha = new StringBuilder(str);
                int x = 0;
                while (x < linha.length()){
                    //System.out.println(linha.charAt(x));
                    if (linha.charAt(x) == '#') bb[row][x]=true;
                    else bb[row][x]=false;
                    x++;   
                   
                }
                row++;
            }
            board = bb;
        }
        catch (IOException e){
            System.err.println("Error: " + e);
           
        }
       
       
       
    }

}

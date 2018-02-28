package br.pro.hashi.ensino.desagil.tequilada;

public class Engine {
	void CriarPlayer(){
	       
        HumanPlayer toranja = new HumanPlayer();
        toranja.x=1;
        toranja.y=1;
    }
    void CriarCpu(){
        CpuPlayer bot = new CpuPlayer();
        bot.x = 9;
        bot.y = 9;
    }
    void CriarBoard(){
        Board board = new Board();
        board.gerarLabirinto("teste.txt");
       
    }
    void gen(){
        CriarCpu();
        CriarPlayer();
        CriarBoard();
    }
}

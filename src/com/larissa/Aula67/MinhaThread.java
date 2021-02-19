package com.larissa.Aula67;

	public class MinhaThread extends Thread{
		
		private String nome;
		private int tempo;
		
		public MinhaThread(String nome, int tempo) {
			this.nome = nome;
			this.tempo = tempo;
			start();
		}

		public void run(){
			
		for(int i=0; i<6; i++) {
		    System.out.println(nome + "contador" + i);
		    try {
				Thread.sleep(tempo);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    System.out.println(nome + "terminou a execu��o");
		}    
	}
	
}


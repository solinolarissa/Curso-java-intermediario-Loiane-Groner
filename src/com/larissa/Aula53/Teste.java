package com.larissa.Aula53;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstantes();
		
		System.out.println();
		
		usandoEnum();

	}
	
	private static void usandoConstantes(){
		
		int segunda = DiasSemanaConstantes.SEGUNDA;  
		int terca = DiasSemanaConstantes.TERCA;
		int quarta = DiasSemanaConstantes.QUARTA;
		int quinta = DiasSemanaConstantes.QUINTA;
		int sexta = DiasSemanaConstantes.SEXTA;
		int sabado = DiasSemanaConstantes.SABADO;
		int domingo = DiasSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	 

	 private static void imprimeDiaSemana(int dia) {
		 switch (dia) {
		 case 1:
			 System.out.println("Segunda-Feira");
			 break;
		 case 2:
			 System.out.println("Terca-Feira");
			 break;
		 case 3:
			 System.out.println("Quarta-Feira");
			 break;
		 case 4:
			 System.out.println("Quinta-Feira");
			 break;
		 case 5:
			 System.out.println("Sexta-Feira");
			 break;
		 case 6:
			 System.out.println("Sabado");
			 break;
		 case 7:
			 System.out.println("Domingo");
			 break;
				 
		 }
	}
	 
	 private static void usandoEnum() {
		 
		 DiaSemana segunda = DiaSemana.SEGUNDA;
		 DiaSemana terca = DiaSemana.TERCA;
		 DiaSemana quarta = DiaSemana.QUARTA;
		 DiaSemana quinta = DiaSemana.QUINTA;
		 DiaSemana sexta = DiaSemana.SEXTA;
		 DiaSemana sabado = DiaSemana.SABADO;
		 DiaSemana domingo = DiaSemana.DOMINGO;
		 
		 System.out.println("Teste utilizando enum no Java");
		 
	 }
	 
	 
	 private static void imprimeDiaSemana(DiaSemana dia) {
		 switch (dia) {
		 case SEGUNDA:
			 System.out.println("Segunda-Feira");
			 break;
		 case TERCA:
			 System.out.println("Terca-Feira");
			 break;
		 case QUARTA:
			 System.out.println("Quarta-Feira");
			 break;
		 case QUINTA:
			 System.out.println("Quinta-Feira");
			 break;
		 case SEXTA:
			 System.out.println("Sexta-Feira");
			 break;
		 case SABADO:
			 System.out.println("Sabado");
			 break;
		 case DOMINGO:
			 System.out.println("Domingo");
			 break;
				
	 }
   } 
}










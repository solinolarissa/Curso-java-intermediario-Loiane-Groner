package com.larissa.Aula64;

public class Anonima {
	
	public void imprimeTexto() {
		System.out.println("qualquer texto");
		
	}
	
	public static void main(String[] args) {
		
        
		Anonima anonima = new Anonima() {
		    public void imprimeTexto() {
		        System.out.println("qualquer texto que foi sobescrito");
		        
		        
		    }    	
		};       
		        
		        anonima.imprimeTexto();
	}	
	
}
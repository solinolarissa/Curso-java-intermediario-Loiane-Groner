package com.larissa.Aula60;

public class EscopoVariaveis {

	public void maiUmOutroTeste(int num) {
	
		int total = 0;
		
		try {
			int outroNum = 0;
			total = num/outroNum;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			total++;
		}
		num++;

	}

}

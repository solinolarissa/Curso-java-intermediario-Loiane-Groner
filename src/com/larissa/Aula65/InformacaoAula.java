package com.larissa.Aula65;

 @interface InformacaoAula {
	 
	 String autor();
	 
	 int aulaNumero();
	 
	 String blog() default "http://Larissa.com";
	 
	 String site() default "http://Larissa.com";

}


 class Carro {
	
	String cor;
	String nome;
	String modelo;
	int ano;
	int numeroDePortas;
	Motor motor;
	boolean isligado; // is -->está
	boolean  isMovendo;
	
//	tipo_retorno nomeMetodo(parametros) {
//
//	}
	
	void ligar() {
		isligado = true;		
	}
	
	void desligar() {
		isligado = false;
	}
	
	void moveer() {
		ismovendo = true;
		
	}

	void parar() {
		ismovendo = false;
		
	}
}

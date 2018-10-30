package tarefa;

public class VetorCaracteristico {
	private boolean[] vetor;
	
	VetorCaracteristico(int tamUnive){
		vetor = new boolean[tamUnive];
	}
	/**
	 * 	Recebe um outro VetorCaracteristico e faz a uniao entre o vetor recebido e
	 * o vetor que o chamou a funcao.
	 * @param vet2
	 */
	public VetorCaracteristico uniao(VetorCaracteristico vet2) {

		int tamanhoUniv; //Será igual ao tamanho do maior vetor.
		
		/* O tamanho do univero da uniao sera igual ao tamanho do maio vetor, pois
		 * na uniao o elemento deve estar ou em um conjunto ou em outro. Ou seja,
		 * mesmo que um dos conjuntos termine, ainda há a possibilidade do elemento
		 * estar no outro.
		 */
		if(this.vetor.length >= vet2.vetor.length) {
			tamanhoUniv = this.vetor.length;
		}else {
			tamanhoUniv = vet2.vetor.length;
		}
		
		VetorCaracteristico uniao = new VetorCaracteristico(tamanhoUniv);
		
		for(int i= 0; i <= tamanhoUniv; i++) {
			
			if( (this.vetor[i] == true) || (vet2.vetor[i]) == true ) {
				uniao.vetor[i] = true;
			}
			
		}
		
		return uniao;
	}
	
	/**
	 * 
	 * Recebe um outro VetorCaracteristico e faz a intersecao entre o vetor recebido e
	 * o vetor que o chamou a funcao.
	 * 
	 * @param vet2
	 * @return
	 */
	public VetorCaracteristico intersecao(VetorCaracteristico vet2) {

		int tamanhoUniv; //Será igual ao tamanho do maior vetor.
		
		/* O tamanho do univero da intersecao sera  ao tamanho do menor vetor, pois
		 * na intersecao o elemento deve estar em um conjunto e em outro. Ou seja,
		 * quando que um dos conjuntos termine, não há a possibilidade do elemento
		 * estar no outro.
		 */
		
		if(this.vetor.length <= vet2.vetor.length) {
			tamanhoUniv = this.vetor.length;
		}else {
			tamanhoUniv = vet2.vetor.length;
		}
		
		VetorCaracteristico intersecao = new VetorCaracteristico(tamanhoUniv);
		
		for(int i= 0; i <= tamanhoUniv; i++) {
			
			if( (this.vetor[i] == true) && (vet2.vetor[i]) == true ) {
				intersecao.vetor[i] = true;
			}
			
		}
		
		return intersecao;
	}
	
	/**
	 * Adiciona um elemento ao conjunto. Na posicao do elemento no vetor caracteristico 
	 * é atribuido o valor verdadeiro (true).
	 * 
	 * @param elem
	 */
	public void addElemento(int elem) {
		vetor[elem] = true;
	}
	
	/**
	 * Remove um elemento ao conjunto. Na posicao do elemento no vetor caracteristico 
	 * é atribuido o valor falso(false).
	 * 
	 * @param elem
	 */
	public void removeElemento(int elem) {
		vetor[elem] = false;
	}
}

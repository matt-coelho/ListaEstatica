package pkgListaEstatica;

public class ListaEstatica {
	private String nomes[];
	private int tamanho;
	final int MAXTAM = 6;
	public ListaEstatica(){
		nomes = new String [MAXTAM];
		tamanho = 0;
	}
	public boolean verificarSeVazia(){
		return tamanho == 0;
	}
	public boolean verificarSeCheia(){
		return tamanho == nomes.length;
	}
	public void Consultar(){
		for(int i=0;i<6;i++){
			System.out.println(" "+nomes[i]+" ,");
			System.out.println("\n");
		}
	System.out.println(" ");
	}
	public void adicionarNoFinal(String n){
		if(!verificarSeCheia()){
			nomes[tamanho]=n;
			tamanho++;
		}
		else{
			System.out.println("a lista esta cheia\n\n");
		}
	}
	public void adicionarNoInicio(String n){
		if(!verificarSeCheia()){
			for(int i=tamanho;i>=1;i--){
				nomes[i]=nomes[i-1];
			}
			tamanho++;
			nomes[0]=n;
		}
		else{
			System.out.println("\na lista esta cheia, impossivel adicionar");
		}
	}
	public void adicionarSelecionado(String n, int p){
		if(verificarSeCheia()){
			System.out.println("a lista está cheia\n\n");
		}
		else{
			if(p==0){
				adicionarNoInicio(n);
			}
			else{
				if(p>tamanho){
					System.out.println("posicao fora dos limites");
				}
				else{
					for(int i=tamanho;i>=p;i++){
						nomes[i]=nomes[i-1];
					}
					nomes[p] = n;
					tamanho++;
				}
			}
		}
	}
	public void removerSelecionado(String n){
		int pos = 0;
		boolean achou = false;
		System.out.println("verifica lista vazia");
		if(verificarSeVazia()){
			System.out.println("a lista está vazia!\n\n");
		}
		else{
			for(int i=(tamanho-1);i>=0;i--){
				if(nomes[i].equals(n)){
					pos = i;
					achou = true;
				}
			}
			nomes[pos] = null;
			for(int i=pos; i<=(tamanho-1);i++){
				try{
					if(i==MAXTAM-1)
						nomes[i]= null;
					else
						nomes[i]= nomes[i+1];
				}
				catch(Exception e){
					System.out.println("ocorreu um erro");
					System.out.println(e.getMessage()+"\n");
				}
			}
			tamanho--;
		}
		if(achou == true)
			System.out.println("o nome "+n+", foi removido");
		else
			System.out.println("o nome "+n+", nao foi encontrado");
	}
	public void removerTodos(){
		if(verificarSeVazia()){
			System.out.println("a lista esta vazia\n\n");
		}
		else{
			for(int i=tamanho-1;i>=0;i--){
				nomes[i]=null;
			}
			tamanho = 0;
			System.out.println("todos os elementos foram excluidos\n\n");
		}
	}
	public void verificarTamanho(){
		if(verificarSeVazia()){
			System.out.println("a lista esta vazia");
			System.out.println("quantidade de elementos "+tamanho+"\n");
		}
		else if(verificarSeCheia()){
			System.out.println("a lista esta cheia");
			System.out.println("quantidade de elementos "+tamanho+"\n\n");
		}
		else{
			System.out.println("tamanho da lista "+tamanho+"\n\n");
		}
	}
}
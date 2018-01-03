package pkgListaEstatica;
import java.util.*;
public class TestaListaEstatica {
	static Scanner entrada;
	static ListaEstatica lista;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		lista = new ListaEstatica();
		
		int op=0;
		while(true){
			System.out.println("Lista estatica com 6 posicoes\n\n1-Inserir no INICIO\n2-Inserir no FINAL\n3-Consultar\n4-Adicionar em uma posicao especifica\n5-remover um nome especifico\n6-remover todos\n7-verificar o tamanho da lista\n8-SAIR\nDigite sua opcao:\n");
			op = entrada.nextInt();
			if(op<1 && op>8){
				System.out.println("opcao invalida");
			}
			if(op == 8){
				break;
			}
			if(op == 1){
				System.out.println("digite o nome a adicionar no inicio");
				String n = entrada.next();
				lista.adicionarNoInicio(n);
			}
			if(op == 2){
				System.out.println("digite o nome a adicionar no final");
				String n = entrada.next();
				lista.adicionarNoFinal(n);
			}
			if(op == 3){
				System.out.println("dados iseridos na lista");
				lista.Consultar();
			}
			if(op == 4){
				System.out.println("digite o nome a adiconar no final");
				String n = entrada.next();
				System.out.println("informe a posicao(1 a 6)");
				int p = entrada.nextInt();
				System.out.println("dados inseridos na lista");
				lista.adicionarSelecionado(n, p);
			}
			if(op == 5){
				System.out.println("digite o nome a remover");
				String n = entrada.next();
				lista.removerSelecionado(n);
			}
			if(op == 6){
				lista.removerTodos();
			}
			if(op == 7){
				lista.verificarTamanho();
			}
		}
		System.out.println("----------------------------------------------------------------\n\tfim do app\n----------------------------------------------------------------");
	}
}
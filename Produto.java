//This code is about a stock of one Store;

//First of all, I declared all the variables;

import java.util.Scanner;

public class Produto {
	public int CodigoSequencial;
	public String NomeDoProduto;
	public int quantidade;
	public String Tipo;
	public double valor;
	private int quantidadeDeVenda;
	private double preçoDaCompra;
	private int qtdComprar;
	private double novoValor;
	
	
	
//Second: I did four constructor methods with overload;
	public Produto(int CodigoSequencial) {
		this.CodigoSequencial = CodigoSequencial;
		
	}
	
	public Produto(int CodigoSequencial,String NomeDoProduto) {
		this.CodigoSequencial = CodigoSequencial;
		this.NomeDoProduto = NomeDoProduto;
		
	}
	
	public Produto(int CodigoSequencial,String NomeDoProduto,int quantidade) {
		this.CodigoSequencial = CodigoSequencial;
		this.NomeDoProduto = NomeDoProduto;
		this.quantidade = quantidade;
		
	}
	
	public Produto(int CodigoSequencial,String NomeDoProduto,int quantidade,String Tipo,double valor) {
		this.CodigoSequencial = CodigoSequencial;
		this.NomeDoProduto = NomeDoProduto;
		this.quantidade = quantidade;
		this.Tipo = Tipo;
		this.valor = valor;
	}
	
//Third, I created the methods;
	public void vender() {
		Scanner qtd = new Scanner(System.in);
		System.out.println("Informe a quantidade de produtos que deseja:");
		quantidadeDeVenda = qtd.nextInt();
		
		if(quantidadeDeVenda>=quantidade) {
			quantidade = quantidade-quantidadeDeVenda;
			preçoDaCompra = quantidadeDeVenda*valor;
			System.out.println("O valor final da compra é "+preçoDaCompra);
			
		}else {
			System.out.println("Não temos esse produto!!");
		}
	}	
	public void comprar(int qtdComprar, double novoValor) {
		Scanner qtdC = new Scanner(System.in);
		System.out.println("Informe a quantidade de produtos comprados:");
		qtdComprar = qtdC.nextInt();
		
		Scanner valorN = new Scanner(System.in);
		System.out.println("Informe o novo valor dos produtos comprados:");
		novoValor = valorN.nextInt();
		
		
		quantidade =+ qtdComprar;
		valor = novoValor;
		

       }
	public void comprar(int qtdComprar) {
		//Scanner qtdC = new Scanner(System.in);
		//System.out.println("Informe a quantidade de produtos comprados:");
		//qtdComprar = qtdC.nextInt();
		quantidade =+ qtdComprar;
	}
	public void consultar() {
		System.out.println("Os dados do produto são:");
		System.out.println("CódigoSequencial: "+CodigoSequencial);
		System.out.println("Nome do produto: "+NomeDoProduto);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Tipo do produto: "+Tipo);
		System.out.println("Valor do produto: "+valor);
	}
	public void inserir() {
		Scanner nome = new Scanner(System.in);
		System.out.println("Informe o nome do produto:");
		NomeDoProduto = nome.nextLine();
		
		Scanner qtd = new Scanner(System.in);
		System.out.println("Informe a quantidade do produto:");
		quantidade = qtd.nextInt();
		
		Scanner tipo = new Scanner(System.in);
		System.out.println("Informe o tipo do produto:");
		Tipo = tipo.nextLine();
		
		Scanner Valor = new Scanner(System.in);
		System.out.println("Informe o valor do produto:");
		valor = Valor.nextFloat();
	}
	public boolean igual(Produto p) {
		if(this.NomeDoProduto.equals(p.NomeDoProduto) && this.Tipo.equals(p.Tipo) ) {
			return true;
		}else {
			return false;
		}
		}

}

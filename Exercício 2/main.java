
public class main {

	public static void main(String[] args) {
		Produto produto1 = new Produto(001,"Jogo Batalha Naval",10, "jogo", 100.00);
		produto1.inserir();
		produto1.vender();
		produto1.comprar(10);
		produto1.consultar();
		
		Produto produto2 = new Produto(001,"Jogo Batalha Naval");
		produto2.inserir();
		produto2.vender();
		produto2.comprar(10);
		produto2.consultar();
		
		if(produto1.equals(produto2)) {
			System.out.println("Produto 1 igual Produto2");
		}else {
			System.out.println("Produto 1 diferente Produto2");
		}
		
		Produto produto3 = new Produto(001,"Jogo Batalha Naval",14);
		produto3.inserir();
		produto3.vender();
		produto3.comprar(7,10.00);
		produto3.consultar();
		
		if(produto2.equals(produto3)) {
			System.out.println("Produto 2 igual Produto3");
		}else {
			System.out.println("Produto 2 diferente Produto 3");
		}
		

	}

}

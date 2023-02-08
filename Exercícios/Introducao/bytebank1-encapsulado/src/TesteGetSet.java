
public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24266);
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente gustavo = new Cliente();
		
		gustavo.setNome("Gustavo Rocha");
		
		conta.setTitular(gustavo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}

}

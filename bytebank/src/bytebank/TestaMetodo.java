package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		
		System.out.println(conseguiuRetirar);
	}
	

}

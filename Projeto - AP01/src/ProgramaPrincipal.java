
public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		
		v1.ano = 2017;
		v1.marca = "GM";
		v1.modelo = "Onix";
		v1.motor = 1.0;
		v1.preco = 42000;
		v1.combustivel = 'f';
		
		v1.imprimeDados();
		
		v1.deprecia(540);
		
		v1.imprimeDados();
		
		System.out.println(v1.calculaImposto());
		
		/*Parte #5:*/
		
		Veiculo v2 = new Veiculo();
		
		if(v1==v2) {
			System.out.println("Os veiculos sao iguais");
		}else {
			System.out.println("Os veiculos sao diferentes");
		}
		
		//Os veiculos sao diferentes pois v1 e v2 são referencias para objetos distintos!
		//Se imprimirmos v1 e v2 (usando System.out.println(v1);) percebe-se também que cada um possui um endereço de memória próprio.
	
		
		/*Parte #6:*/
		
		Veiculo v3 = v1;
		v3.preco = 0;
		v3.imprimeDados();
		v1.imprimeDados();
		
		// Nesse caso v3 possui a mesma referencia que v1, apontando para o mesmo objeto (Onix)
		//Dessa forma, alterando o preco do carro tanto via v3.preco quanto v1.preco mudamos o preco do Onix.
	}
}

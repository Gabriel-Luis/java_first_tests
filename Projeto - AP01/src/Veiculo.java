
public class Veiculo {
	int ano;
	String marca;
	String modelo;
	double motor;
	double preco;
	char combustivel;
	
	public void imprimeDados() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Motor: " + this.motor);
		System.out.println("Preco: " + this.preco);
		System.out.println("Combustivel: " + this.combustivel);
	}
	
	public double calculaImposto() {
		
		if(this.motor <= 1.0) {
			return 0.306*this.preco;
		}else
		
		if(this.motor <= 2.0 && this.combustivel == 'g') {
			return 0.366*this.preco;
		}else
		
		if(this.motor <= 2.0 && this.combustivel == 'f') {
			return 0.346*this.preco;
		}else
		
		if(this.motor > 2.0 && this.combustivel == 'g') {
			return 0.486*this.preco;
		}else
		
		if(this.motor == 2.0 && this.combustivel == 'f') {
			return 0.416*this.preco;
		}else {
			return 0;
		}
		
	}
	
	public void deprecia(double valor) {
		this.preco = this.preco - valor;
	}
	
	
	
}


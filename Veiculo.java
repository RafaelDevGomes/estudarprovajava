package exerciciosprova;

public class Veiculo {

	private String placa;
	private String modelo;
	private int tipo;
	private double valorVenal;
	
	
	
	
	public String getPlaca() {
		return placa;
	}




	public void setPlaca(String placa) {
		this.placa = placa;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getTipo() {
		return tipo;
	}




	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	public double getValorVenal() {
		return valorVenal;
	}




	public void setValorVenal(double valorVenal) {
		this.valorVenal = valorVenal;
	}




	public int calcularIPVA() {
		
		double valorIPVA = 0.0;
		
		switch (tipo) {
		
		case 1: 
			
		System.out.println("Para carros de passeio, o valor Venal é: " + valorIPVA);
		valorIPVA = valorVenal * 0.04;
		break;
		
		case 2: 
			
		System.out.println("Para carros de cargo, o valor Venal é: " + valorIPVA);
        valorIPVA = valorVenal * 0.06;		
		
		case 3:
			
		System.out.println("Para carros de passeio, o valor Venal é: " + valorIPVA);
		valorIPVA = valorVenal * 0.015;
		
		default:
		
		System.out.println("Para carros em geral, o valor Venal é: " + valorIPVA);
		valorIPVA = valorVenal * 0.01;
		
		}
		return tipo;
		
			
		
		
	
		
	}
	
	
}

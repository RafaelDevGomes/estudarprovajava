package estudarprovajava;
import java.util.Scanner;
public class testeVeiculo {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);	
    
    Veiculo carro1 = new Veiculo();
    
    System.out.println("Digite seu modelo de carro: ");
    carro1.setModelo(scan.nextLine());
    
    System.out.println("Digite sua placa: ");
    carro1.setPlaca(scan.nextLine());
    
    
    System.out.println("Digite o seu tipo de carro de 1 a 3.");
    carro1.setTipo(scan.nextInt());
    
    
    System.out.println("Digite o valor venal do veículo: ");
    carro1.setValorVenal(scan.nextDouble());
   
    System.out.println("Dados do véiculo: ");
    System.out.println("Modelo: " + carro1.getModelo());
    System.out.println("Placa: " + carro1.getPlaca());
    System.out.println("Tipo: " + carro1.getTipo());
    
    double ipva = carro1.calcularIPVA();
    
    System.out.println("O quanto a pagar na tipagem + valor venal: " + ipva);
    
    scan.close();
    
	}
    
}

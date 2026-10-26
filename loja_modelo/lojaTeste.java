import java.util.Scanner;

public class lojaTeste { 
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        Produto prod1 = new Produto();
        
      
        prod1.setCodigo(1);
        prod1.setDescricao("Camiseta");
        prod1.setPrecoUnitario(50.0);
        prod1.setQuantidadeEstoque(10);

        int opcao = 0;

       
        do {
            System.out.println("\n=== BEM-VINDO AO MENU DO ESTOQUE ===");
            System.out.println("1 - Consultar Estoque.");
            System.out.println("2 - Entrada de Mercadoria.");
            System.out.println("3 - Saída de Mercadoria.");
            System.out.println("4 - Sair.");
            System.out.print("Escolha uma opção: ");
            
            opcao = scan.nextInt();
            scan.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n--- DADOS DO PRODUTO ---");
                    System.out.println("Descrição: " + prod1.getDescricao());
                    System.out.println("Quantidade disponível: " + prod1.getQuantidadeEstoque());
                    System.out.println("Preço Unitário: R$ " + prod1.getPrecoUnitario());
                    
                   
                    double valorTotal = prod1.getQuantidadeEstoque() * prod1.getPrecoUnitario();
                    System.out.println("Valor total do estoque: R$ " + valorTotal);
                    break;

                case 2:
                    System.out.print("Qual a quantidade a ser adicionada? ");
                    int qtdAdicionar = scan.nextInt();
                    prod1.adicionarEstoque(qtdAdicionar);
                    break;
                
                case 3:
                    System.out.print("Qual a quantidade a ser removida? ");
                    int qtdRemover = scan.nextInt();
                    prod1.removerEstoque(qtdRemover); 
                    break;
                
                case 4:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scan.close();
    }
}
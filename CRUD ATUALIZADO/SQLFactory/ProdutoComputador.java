public class ProdutoComputador extends SQLClass{            
    @Key
    int id;
    String descricao;
    double preco;    
    String um;
    String processador;
    String memoria; 
    double quantidade;
    String tam_disco;

    ProdutoComputador(){
        this.setTableName("computador");        
    }    
}

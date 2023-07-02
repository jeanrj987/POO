public class SQLFactory{
    public static void main(String[] args){

        ProdutoComputador produto1 = new ProdutoComputador();

        produto1.id = 2;
        produto1.descricao = "notebook positivo";
        produto1.um = "18 kg";
        produto1.preco = 12345;
        produto1.memoria = " 16 GB de ram";
        produto1.processador = " 10º geração";
        produto1.quantidade = 3;
        produto1.tam_disco = "240 GB";

        boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);

      
    
    }
}
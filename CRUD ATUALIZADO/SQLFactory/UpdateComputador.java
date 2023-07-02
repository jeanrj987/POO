public class UpdateComputador{
    public static void main(String[] args){

        ProdutoComputador produto1 = new ProdutoComputador();

        produto1.id = 3;
        produto1.descricao = " acer";
        produto1.um = "4 kg";
        produto1.preco = 853.00;
        produto1.memoria = " 8 GB de ram";
        produto1.processador = " 11º geração";
        produto1.quantidade = 2;
        produto1.tam_disco = "480 GB";

        boolean retorno = Database.atualizarRegistro(produto1);
        System.out.println(retorno);


    }
}
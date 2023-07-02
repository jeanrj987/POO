public class DeleteComputador{
    public static void main(String[] args){

        ProdutoComputador produto1 = new ProdutoComputador();

        produto1.id = 2;
        
        boolean retorno = Database.deletarRegistro(produto1);
        System.out.println(retorno);

       
    }
}
public class ReadComputador{
    public static void main(String[] args){

        ProdutoComputador produto1 = new ProdutoComputador();

        boolean retorno = Database.abrirID(produto1, 3);
        System.out.println("---------------------");
        System.out.println("Produto selecionado");
         System.out.println("---------------------");
        System.out.println(produto1.descricao + " " + produto1.preco);
        System.out.println("---------------------");

    }
}
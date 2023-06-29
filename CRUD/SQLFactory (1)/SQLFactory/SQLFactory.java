public class SQLFactory{
    public static void main(String[] args){

        Produto produto1 = new Produto();

        produto1.id = 2;
        produto1.descricao = "notebook acer";
        produto1.um = "3 kg";
        produto1.preco = 1500;

        boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);

      
    
    }
}
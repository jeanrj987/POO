public class DeletePc{
    public static void main(String[] args){

        Produto produto1 = new Produto();

        produto1.id = 1;
        
        boolean retorno = Database.deletarRegistro(produto1);
        System.out.println(retorno);

       
    }
}
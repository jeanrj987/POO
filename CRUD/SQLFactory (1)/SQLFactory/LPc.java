public class LPc{
    public static void main(String[] args){

        Produto produto1 = new Produto();

        boolean retorno = Database.abrirID(produto1, 1);
        System.out.println("---------------------");
        System.out.println(produto1.descricao + " " + produto1.preco);
        System.out.println("---------------------");

    }
}
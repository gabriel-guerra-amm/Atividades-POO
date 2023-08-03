
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gabriel", "14/03/1997", 26);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Data Nascimento: "+ p1.getDataNascimento());
        System.out.println("Idade: "+ p1.getIdade());
    }
}
public class AnatomiaDeClasses {

    public static void main (String [] args) {
        String primeiroNome = "Marcondes";
        String segundoNome = "Junior";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }


}

package EX2_Redes_Sociais;

public class Main {
    public static void main(String[] args) {
        RedeSocial[] redesSociais = {new Facebook(), new Twitter()};

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Will Smith");
        usuario.setEmail("Willzin@gmail.com");

        usuario.redesSociais[0].senha = "Smith";
        usuario.redesSociais[0].numAmigos = 43229;
        
        usuario.redesSociais[1].senha = "Smith";
        usuario.redesSociais[1].numAmigos = 69321;

        usuario.usarRedes();    // UML
    }
}

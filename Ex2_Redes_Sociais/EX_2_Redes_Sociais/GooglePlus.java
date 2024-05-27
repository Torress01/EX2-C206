package EX2_Redes_Sociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("*Posta foto no GooglePlus*");
    }
    
    @Override
    public void postarVideo() {
        System.out.println("*Posta video no GooglePlus*");
    }
    
    @Override
    public void postarComentario() {
        System.out.println("*Posta comentario no GooglePlus*");
    }
    
    @Override
    public void compartilhar() {
        System.out.println("*Compartilha no GooglePlus*");
    }
    
    @Override
    public void fazStreaming() {
        System.out.println("*Faz streaming no GooglePlus*");
    }
    
}

import models.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone("123-456-789", "Iphone 14");
        iphone.ligar("987-654-321");
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.exibirPagina("https://www.example.com");
    }
}

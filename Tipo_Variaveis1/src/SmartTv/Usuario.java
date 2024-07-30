package SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
                
        SmartTv smartTv = new SmartTv();
    
        System.out.println("Tv Ligada?" + smartTv.ligada);
        System.out.println("Volume Atual ? " + smartTv.volume);
        System.out.println("Volume Atual : " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status - Tv Ligada?" + smartTv.ligada);
        smartTv.Desligar();
        System.out.println("Tv Ligada?" + smartTv.ligada);


    }
}

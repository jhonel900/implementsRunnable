package interfazrunna;

/**
 *
 * @author sendo
 */
public class InterfazRunna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        HiloRunnable ton = new HiloRunnable("ton", 33);
        HiloRunnable tin = new HiloRunnable("tin", 100);
        Thread hilo1 = new Thread(ton);
        Thread hilo2 = new Thread(tin);
        // ejecutar los hilos
         hilo1.setPriority(10);
        hilo2.setPriority(5);
        hilo1.start();
        hilo1.join();
        hilo2.start();
        hilo2.join();
        System.out.println(hilo1.getPriority());
        System.out.println(hilo2.getPriority());
        System.out.println(hilo1.getName());
        System.out.println(hilo2.getName());
        hilo1.setName("hilo numero 1");
        hilo2.setName("hilo numero 2");
        System.out.println(hilo1.getName());
        System.out.println(hilo2.getName());       
        System.out.println(hilo1.isAlive());       
        System.out.println(hilo2.isAlive());
      
    }

}

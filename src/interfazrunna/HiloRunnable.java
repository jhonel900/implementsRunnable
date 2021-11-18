
package interfazrunna;

/**
 *
 * @author sendo
 */
public class HiloRunnable implements Runnable
{
String palabra;
    long pausa;
   public HiloRunnable(String queDecir,long tiempoPausa){
    super();
    
 palabra=queDecir;
   pausa=tiempoPausa;
   }

public void run(){
    try {
      
        for(int i=0;i<100;i++){
        System.out.println(palabra+" "+i);

        Thread.sleep(pausa);
        
}     
    } catch (Exception e) {
    }
}
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.resumoprova;

/**
 *
 * @author Beatr
 */
public class ResumoProva {

    public static void main(String[] args) {
        
        
    }
    
    //ler arquivo assincrono
       
       public static final ler(String nome) {
           System.out.println("iniciando");
           
           new Thread(() ->{
               try{
               Thread.sleep(5000);
               }catch(InterrupedException e){
                   e.printStackTrace();
               }
               System.out.println("concluida");
           }, "noem").start();
           System.out.println("em andamento");
           
       }
       
       public Cliente findCliente() throws IOException {
           URL url = new URL("JFJF");
           
           BufferedReader br = new BufferedReader(
           new InputStreamReader(url.opemStream()));
           
           String inputLine;
           String resulta = "";
           
           while((inputLine = br.readLine()) != null) {
               result += inputLine;
           }
           
           br.close();
           
           Cliente cliente = Cliente.unmarshalFromJson(resulta);
           return cliente;
       }
       
       
}

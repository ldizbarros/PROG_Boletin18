package boletin18;

import javax.swing.JOptionPane;

/**Define a clase Buzon para xestionar un buzon de correo  electrónicos ordenados segundo a orde de chegada.
 * Para representar o buzon de correo úsase un array de correos electrónicos; 
 * estes, á súa vez, son obxectos da clase Correo e teñen como atributos un String, 
 * co contido do correo, e un indicativo para saber se foron lidos ou non.
 * Define a clase Correo cos métodos que creas convenientes, 
 * sabendo que a clase Buzon debe incluír os seguintes métodos públicos:
 *  a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
 *  b) void engade (Correo c), que engade c ao buzon
 *  c) boolean porLer(), que determina se quedan correos por ler
 *  d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
 *  e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
 *  f) void elimina(int k), que elimina o correo k-ésimo.
 */
public class Boletin18 {

    public static void main(String[] args) {
        Buzon lista = new Buzon();
        
        System.out.println("******** MENU *********\n"
                + "1)Añadir un correo\n"
                + "2)Mostrar buzon\n"
                + "3)Numero de correos del buzon\n"
                + "4)Quedan elementos por leer?\n"
                + "5)Primer correo sin leer\n"
                + "6)Mostrar un correo (segun su posiscion)\n"
                + "7)Eliminar un correo (segun posicion)\n"
                + "0)Salir\n");
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce una opcion"));
        
        while(opcion!=0){
            switch(opcion){
                case 1: String op = JOptionPane.showInputDialog("Quieres añadir un correo?", JOptionPane.QUESTION_MESSAGE);
                        while(op.equals("si")){
                            String correo = JOptionPane.showInputDialog("Introduce el correo");
                            boolean leido = Boolean.parseBoolean(JOptionPane.showInputDialog("Se ha leido el correo?"));
                            Correo c = new Correo(correo,leido);
                            lista.engadirCorreo(c);
                            op = JOptionPane.showInputDialog("Quieres añadir un correo?", JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                case 2: lista.amosarBuzon();
                        break;
                case 3: System.out.println("Numero de correos: "+lista.numeroDeCorreos());
                        break;
                case 4: if (lista.porLer()){
                            System.out.println("Queda elementos por leer");
                        }else{
                            System.out.println("Estan todos lidos");
                        }
                        break;
                case 5: if (lista.amosarPrimerNoLeido() != null){
                            System.out.println("El primero correo sin leer es: "+lista.amosarPrimerNoLeido());
                        }else{
                            System.out.println("Todos los corros se han leido");
                        }
                        break;
                case 6: int po = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la posicion del correo a mostrar"));
                        System.out.println("El correo numero "+po+" es: "+lista.amosar(po));
                        break;
                case 7: int po2 = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la posicion del correo a eliminar"));
                        lista.eleminar(po2);
                        break;
                case 0: break;
                default: System.out.println("Opcion no valida");
            }
            
            System.out.println("******** MENU *********\n"
                + "1)Añadir un correo\n"
                + "2)Mostrar buzon\n"
                + "3)Numero de correos del buzon\n"
                + "4)Quedan elementos por leer?\n"
                + "5)Primer correo sin leer\n"
                + "6)Mostrar un correo (segun su posiscion)\n"
                + "7)Eliminar un correo (segun posicion)\n"
                + "0)Salir\n");
        
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce una opcion"));
        }

    }
    
}

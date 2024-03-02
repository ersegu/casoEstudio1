/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ECP01;
import java.util.Random;

/**
 *
 * @author tloz
 */

//ATRIBUTOS
public class vehiculo {
    
    private String vin;
    private int placa;
    private float consumo;
    private Combustible combustible;
    
    //CONSTRUCTOR
    
    public vehiculo (Combustible pCombustible) {
        combustible=pCombustible;
        vin=generadorAleatorio(1);
        placa=Integer.parseInt(generadorAleatorio(2));
        consumo=(float)9.5;
        
    }
    
    //GET VIN
    
    public String getVin (){
        return vin;
    
    }
    
    //GET PLACA
    
    public int getPlaca (){
        return placa;
    }
    
    //SET y GET COMBUSTIBLE
    
    public Combustible getCombustible (){
        return combustible;
    }
    
    public void setCombustible (Combustible pCombustible) {
        combustible=pCombustible;
    
    }
    
    //SET y GET Consumo
    
    public float getConsumo(){
        return consumo;
    
    }
    
    public void setConsumo (){
        consumo=Float.parseFloat(generadorAleatorio(3));
        
    }
    
    
    //OTROS METODOS
    
    public String estatusConsumo (){
        float pConsumo=getConsumo();
        String aux;
        
        if (pConsumo<10) {
            aux="bajo";
        } else if (pConsumo >= 10 && pConsumo < 12) {
            aux="medio";
        } else {
            aux="alto";
        }
        
        return aux;
    
    }
    
    public String restriccionVehicular (){
        
        String aux;
        if (combustible.equals(Combustible.electrico)) {
            aux="No tiene restriccion vehicular";
        } else {
            char digito=Integer.toString(getPlaca()).charAt(5);
        
            switch (digito) {
                case '1':
                case '2':
                    aux="No puede circular el dia Lunes";
                    break;
                case '3':
                case '4':
                    aux="No puede circular el dia Martes";
                    break;
                case '5':
                case '6':
                    aux="No puede circular el dia Miercoles";
                    break;
                case '7':
                case '8':
                    aux="No puede circular el dia Jueves";
                    break;
                case '9':
                case '0':
                    aux="No puede circular el dia Viernes";
                    break;
                default:
                aux="Error: No se pudo ejecutar el programa.";
            }
        }
        
        return aux;
    }
    
    @Override
    public String toString(){
        return "El vehiculo con el numero de VIN: "+vin+ "  tiene la placa #: "+placa+" es un auto: "+combustible+" y posee un consumo de: "+consumo;
    }
    
    
    private String generadorAleatorio (int pTipo){
        String cadena1="abcdefghijklmnopqrstuvwxyz0123456789";
        String cadena2="0123456789";
        String cadenaAleatoria="";
        Random aleatorio = new Random();
        int aux;
        
        switch (pTipo) {
            case 1:
                for (int i = 0; i < 12; i++) {
                    
                    aux=aleatorio.nextInt(cadena1.length());
                    cadenaAleatoria+=cadena1.charAt(aux);
                }   break;
            case 2:
                for (int i = 0; i < 6; i++) {
                    
                    aux=aleatorio.nextInt(cadena2.length());
                    cadenaAleatoria+=cadena2.charAt(aux);
                }   break;
            case 3:
                cadenaAleatoria=Integer.toString(aleatorio.nextInt(5)+9);
                cadenaAleatoria+=".";
                cadenaAleatoria+=Integer.toString(aleatorio.nextInt(9));
                break;
        }
    
        return cadenaAleatoria;
    
    }

}







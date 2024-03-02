/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ECP01;

import javax.swing.JOptionPane;

/**
 *
 * @author tloz
 */
public class ECP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int respuesta;
        
        //VEHICULO 1
        vehiculo auto1 = new vehiculo(Combustible.diesel);
          
        JOptionPane.showMessageDialog(null, "El vin del vehiculo es: "+auto1.getVin());
        
        JOptionPane.showMessageDialog(null, "La placa del vehiculo es: "+auto1.getPlaca());
        
        JOptionPane.showMessageDialog(null, "El vehiculo es de combustible: "+auto1.getCombustible());
        respuesta=Integer.parseInt(JOptionPane.showInputDialog("Para cambiar el tipo de combustible del vehiculo, presione: \n1) Para Electrico\n2) Para Diesel\n3) Para Gasolina"));
        switch (respuesta) {
            case 1:
                auto1.setCombustible(Combustible.electrico);
                break;
            case 2:
                auto1.setCombustible(Combustible.diesel);
                break;
            case 3:
                auto1.setCombustible(Combustible.gasolina);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Opcion incorrecta, no se ha podido realizar el cambio de combustible.");
                break;
        }
        JOptionPane.showMessageDialog(null, "El vehiculo es de combustible: "+auto1.getCombustible());
        
        JOptionPane.showMessageDialog(null, "El consumo del vehiculo es de: "+auto1.getConsumo()+" y su consumo es: "+auto1.estatusConsumo());
        auto1.setConsumo();
        JOptionPane.showMessageDialog(null, "El consumo del vehiculo es de: "+auto1.getConsumo()+" y su consumo es: "+auto1.estatusConsumo());
        
        JOptionPane.showMessageDialog(null, "El vehiculo tiene la siguiente restriccion vehicular: "+auto1.restriccionVehicular());
        
        JOptionPane.showMessageDialog(null, auto1.toString());
        
        //VEHICULO 2
        
        vehiculo auto2 = new vehiculo(Combustible.electrico);
        
        JOptionPane.showMessageDialog(null, "El vin del vehiculo es: "+auto2.getVin());
        
        JOptionPane.showMessageDialog(null, "La placa del vehiculo es: "+auto2.getPlaca());
        
        JOptionPane.showMessageDialog(null, "El vehiculo es de combustible: "+auto2.getCombustible());
        respuesta=Integer.parseInt(JOptionPane.showInputDialog("Para cambiar el tipo de combustible del vehiculo, presione: \n1) Para Electrico\n2) Para Diesel\n3) Para Gasolina"));
        switch (respuesta) {
            case 1:
                auto2.setCombustible(Combustible.electrico);
                break;
            case 2:
                auto2.setCombustible(Combustible.diesel);
                break;
            case 3:
                auto2.setCombustible(Combustible.gasolina);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Opcion incorrecta, no se ha podido realizar el cambio de combustible.");
                break;
        }
        JOptionPane.showMessageDialog(null, "El vehiculo es de combustible: "+auto2.getCombustible());
        
        JOptionPane.showMessageDialog(null, "El consumo del vehiculo es de: "+auto2.getConsumo()+" y su consumo es: "+auto2.estatusConsumo());
        auto1.setConsumo();
        JOptionPane.showMessageDialog(null, "El consumo del vehiculo es de: "+auto2.getConsumo()+" y su consumo es: "+auto2.estatusConsumo());
        
        JOptionPane.showMessageDialog(null, "El vehiculo tiene la siguiente restriccion vehicular: "+auto2.restriccionVehicular());
        
        JOptionPane.showMessageDialog(null, auto2.toString());
        
        //VEHICULO 3
        
        vehiculo auto3 = new vehiculo(Combustible.gasolina);
      
        JOptionPane.showMessageDialog(null, "El vin del vehiculo es: "+auto3.getVin());
        
        JOptionPane.showMessageDialog(null, "La placa del vehiculo es: "+auto3.getPlaca());
        
        JOptionPane.showMessageDialog(null, "El vehiculo es de combustible: "+auto3.getCombustible());
        respuesta=Integer.parseInt(JOptionPane.showInputDialog("Para cambiar el tipo de combustible del vehiculo, presione: \n1) Para Electrico\n2) Para Diesel\n3) Para Gasolina"));
        switch (respuesta) {
            case 1:
                auto3.setCombustible(Combustible.electrico);
                break;
            case 2:
                auto3.setCombustible(Combustible.diesel);
                break;
            case 3:
                auto3.setCombustible(Combustible.gasolina);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Opcion incorrecta, no se ha podido realizar el cambio de combustible.");
                break;
        }
        JOptionPane.showMessageDialog(null, "El vehiculo es de combustible: "+auto3.getCombustible());
        
        JOptionPane.showMessageDialog(null, "El consumo del vehiculo es de: "+auto3.getConsumo()+" y su consumo es: "+auto3.estatusConsumo());
        auto1.setConsumo();
        JOptionPane.showMessageDialog(null, "El consumo del vehiculo es de: "+auto3.getConsumo()+" y su consumo es: "+auto3.estatusConsumo());
        
        JOptionPane.showMessageDialog(null, "El vehiculo tiene la siguiente restriccion vehicular: "+auto3.restriccionVehicular());
        
        JOptionPane.showMessageDialog(null, auto3.toString());
        
    }
    
}

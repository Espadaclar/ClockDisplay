
/**
 * 
 */
public class ClockDisplay
{
    
    private NumberDisplay horas;
    private NumberDisplay minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }

    /**
     * método para fijar una hora en el reloj
     */
    public void fijarHora(int hora2, int minuto2)
    {
        horas.setValue(hora2);
        minutos.setValue(minuto2);
    }
    
    /**
     * metodo para retornar los valores de los atributos.
     */
    public String getValor(){
        return horas.getValue()+ " : " +minutos.getValue();
    }
    
    /**
     * mt para avanzar un minuto el tiempo fijado.
     */
    public void avanzaMinuto(){
        minutos.increment();
        if(minutos.getValue() == 0){
            horas.increment();
        }
    }
    
    /**
     * método para devolver la hora en forma de un String de cinco caracteres.
     */
    public String getHora(){
        return horas.getDisplayValue()+ " : " +minutos.getDisplayValue();
    }
}












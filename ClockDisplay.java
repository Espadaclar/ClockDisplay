
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
        horas = new NumberDisplay(23);
        minutos = new NumberDisplay(59);
    }

    /**
     * metodo para fijar una hora en el reloj
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
}












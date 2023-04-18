package edu.jabs.simubanca.mundo;

/**
 * Esta clase representa la cuenta corriente que hace parte de la simulación bancaria de un cliente
 */
public class CuentaCorriente
{

    //-----------------------------------
    // Constantes
    //-----------------------------------

    //-----------------------------------
    // Atributos
    //-----------------------------------

    /**
     * Saldo actual de la cuenta corriente
     */

    private int saldo;

    //-----------------------------------
    // Constructor
    //-----------------------------------

    public CuentaCorriente()
    {
    }

    //-----------------------------------
    // Métodos
    //-----------------------------------

    /**
     * Inicializa la cuenta corriente
     */
    public void inicializar( )
    {
        //El saldo inicial de la cuenta corriente es cero
        saldo = 0;
    }

    /**
     * Consigna una cantidad de dinero en la cuenta del cliente <br>
     * <b>post: </b>El saldo se incrementa en valor <br>
     *
     * @param valor - el valor a consignar en la cuenta
     */
    public void consignarValor( int valor )
    {
        saldo = saldo + valor;
    }

    /**
     * Retira una cantidad de dinero de la cuenta del cliente <br>
     * <b>post: </b>El saldo se reduce en valor <br>
     *
     * @param valor - el valor a retirar de la cuenta
     */
    public void retirarValor( int valor )
    {
        saldo = saldo - valor;
    }

    /**
     * Retorna el saldo del cliente <br>
     * <b>pre: </b>La cuenta tiene un saldo válido <br>
     * <b>post: </b>Se retorna el saldo actual de la cuenta <br>
     *
     * @return saldo
     */
    public int darSaldo( )
    {
        return saldo;
    }
}

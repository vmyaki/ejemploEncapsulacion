package imfe;

public class Main {

	public static void main(String[] args) {
		Coche ferrari = new Coche("Ferrari");
		Coche ford = new Coche("MA-0258-CY");
		
		//Aceleramos 2 veces, frenamos 3, y a�n as�, la velocidad nunca es negativa
		//Tampoco podemos modificar directamente la velocidad, s�lo podemos usar
		//los m�todos para que ellos sean los que modifiquen los atributos del objeto.
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frenar();
		ferrari.frenar();
		ferrari.frenar();
		
		//La velocidad del ferrari, deber�a ser negativa, pero es 0
		ferrari.mostrarInfo();
		ford.mostrarInfo();
		
		
	}

}

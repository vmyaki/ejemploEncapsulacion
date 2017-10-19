package imfe;

public class Main {

	public static void main(String[] args) {
		Coche ferrari = new Coche("Ferrari");
		Coche ford = new Coche("MA-0258-CY");
		
		//Aceleramos 2 veces, frenamos 3, y aún así, la velocidad nunca es negativa
		//Tampoco podemos modificar directamente la velocidad, sólo podemos usar
		//los métodos para que ellos sean los que modifiquen los atributos del objeto.
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frenar();
		ferrari.frenar();
		ferrari.frenar();
		
		//La velocidad del ferrari, debería ser negativa, pero es 0
		ferrari.mostrarInfo();
		ford.mostrarInfo();
		
		
	}

}

package imfe;

public class Coche {
	//Atributos
	private String matricula;
	private String color;
	private int velocidad;
	private int aceleracion;

	//Constructor
	//El constructor se va a encargar de inicializar los atributos en el momento de la creación del objeto
	public Coche() {
		this.matricula = "XXXX-XXX";
		this.color = "Sin pintura";
		this.velocidad = 0;
		this.aceleracion = 5;
	}
	public Coche(String matricula) {
		this.matricula = matricula;
		this.color = "Blanco";
		this.velocidad = 0;
		this.aceleracion = 50;
	}
	
	//Métodos
	public void acelerar() {
		this.velocidad += this.aceleracion;
		if(this.velocidad==250) {
			this.parar();
			System.out.println("Has superado el límite velocidad");
		}
	}
	
	public void frenar() {
		this.velocidad -= this.aceleracion;
		if (this.velocidad < 0) {
			this.parar();
		}
	}
	
	public void parar() {
		this.velocidad = 0;
	}
	
	public void mostrarInfo() {
		System.out.println("ID          : " + this.matricula);
		System.out.println("Color       : " + this.color);
		System.out.println("Speed       : " + this.velocidad + " km/h");
		System.out.println("Aceleration : " + this.aceleracion);
	}
	

}

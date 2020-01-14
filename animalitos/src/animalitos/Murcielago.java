package animalitos;

public class Murcielago extends Mamiferos implements PuedeVolar{
	
	private int patas;
	private boolean salvaje;
	
	public void caminar() {
		System.out.println("El murcielago puede caminar.");
	}
	
	public void volar() {
		System.out.println("El murcielago puede volar.");	
	}
}

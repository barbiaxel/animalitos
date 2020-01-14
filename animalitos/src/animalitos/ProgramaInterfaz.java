package animalitos;

public class ProgramaInterfaz {

	public static void main(String[] args) {
		
		Murcielago mu1 = new Murcielago();
		mu1.caminar();
		mu1.volar();
		System.out.println("");
		
		Avestruz a1 = new Avestruz();
		a1.caminar();
		a1.volar();
		System.out.println("");
		
		Gato g1 = new Gato();
		g1.caminar();
		g1.nadar();
		System.out.println("");
		
		Loro l1 = new Loro();
		l1.caminar();
		l1.volar();
		System.out.println("");
		
		Tigre t1 = new Tigre();
		t1.caminar();
		t1.nadar();
		System.out.println("");
	}

}

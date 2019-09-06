
public class TestAreaCalculavel {
	
	public static void main(String[] args) {
		AreaCalculavel ac = new Retangulo(100, 50);
		AreaCalculavel ac2 = new Quadrado(20);
		AreaCalculavel ac3 = new Circulo(300);
		
		System.out.println(ac.calculaArea());
		System.out.println(ac2.calculaArea());
		System.out.println(ac3.calculaArea());
	}

}

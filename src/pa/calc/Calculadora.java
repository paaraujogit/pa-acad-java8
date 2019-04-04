package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opEx = new OperEx();
		double resEx = opEx.oper(1, 2);
		System.out.println(resEx);
		
		// Oper02 - Solution
		Oper02 op02 = new Oper02();
		double res02 = op02.oper(10, 2);
		System.out.println(res02);

		//OperMedia - Solution
		OperMedia opMedia = new OperMedia();
		double media = opMedia.oper(1,2);
		System.out.println(media);
		
		Oper404 op404 = new Oper404();
		double res404 = op404.oper(40, 25);
		System.out.println(res404);
		
		Zero opZero = new Zero();
		System.out.println(opZero.oper(123123, 9237489));
	}
}
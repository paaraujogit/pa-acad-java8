package pa.calc;

public class Zero implements ItfOper{

	@Override
	public double oper(double op1, double op2) {
		return (op1+op2)*0;
	}
}

public class PiApproximationWithFirstEulerFormula extends AbstractPiApproximation {

	public Double calculateResult(Integer number) {
		for (Integer i = 2; i < number; i++) {
			result += 1.0 / Math.pow(i, 2);
		}
		return Math.sqrt(result * 6);
	}

}
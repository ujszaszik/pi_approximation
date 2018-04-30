
public class PiApproximationWithSecondEulerFormula extends AbstractPiApproximation {

	public Double calculateResult(Integer number) {
		for (Integer i = 2; i < number; i++) {
			result += 1 / Math.pow(i, 4);
		}
		return Math.sqrt(Math.sqrt(result * 90));
	}

}
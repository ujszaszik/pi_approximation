
public class PiApproximationWithVieteFormula extends AbstractPiApproximation {

	@Override
	public Double calculateResult(Integer number) {
		Double current = 0.0;
		for (Integer i = 0; i < number; i++) {
			current = Math.sqrt(current + 2);
			result *= current / 2;
		}
		return 2 / result;
	}

}


public class PiApproximationWithWallisFormula extends AbstractPiApproximation {

	@Override
	public Double calculateResult(Integer number) {
		Double numerator = 0.0;
		Double denominator = 1.0;
		for (Integer i = 0; i < number; i++) {
			numerator += (i % 2 == 0 ? 2 : 0);
			denominator += (i % 2 != 0 ? 2 : 0);
			result *= (numerator / denominator);
		}
		return result * 2;
	}

}
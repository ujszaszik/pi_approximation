
public class PiApproximationWithLeibnizFormula extends AbstractPiApproximation {

	@Override
	public Double calculateResult(Integer number) {
		for (Integer i = 1; i < number; i++) {
			Double current = 1.0 / ( 1 + 2 * i);
			result += (i % 2 == 0 ? current : current * - 1);
		}
		return result * 4;
	}

}
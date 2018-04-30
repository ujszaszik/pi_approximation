
public abstract class AbstractPiApproximation implements PiApproximation {
	protected Double result = 1.0;
	
	@Override
	public void calculate(Integer number) {
		if (isInvalidParameter(number)) {
			return;
		}
		result = calculateResult(number);
		printOutResult(number, result);
	}
	
	public abstract Double calculateResult(Integer number);

	@Override
	public boolean isInvalidParameter(Integer n) {
		if (n == 0) {
			System.out.println("Null iteration means no calculation!");
			return true;
		}
		if (n < 0) {
			System.out.println("Cannot do negative iteration!");
			return true;
		}
		return false;
	}

	@Override
	public void printOutResult(Integer number, Double result) {
		StringBuilder sb = new StringBuilder();
		sb.append("The approximate value of Pi after the ");
		sb.append(number);
		sb.append(getNumberFormat(number));
		sb.append(" iteration is: ");
		sb.append(result);
		System.out.println(sb.toString());
	}

	@Override
	public NumberEndings getNumberFormat(Integer number) {
		Integer lastDigit = number % 10;
		switch (lastDigit) {
		case 1:
			return NumberEndings.ST;
		case 2:
			return NumberEndings.ND;
		case 3:
			return NumberEndings.RD;
		default:
			return NumberEndings.TH;
		}
	}

}
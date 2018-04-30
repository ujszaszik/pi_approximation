
public interface PiApproximation {
	
	void calculate(Integer number);
	
	boolean isInvalidParameter(Integer number);
	
	void printOutResult(Integer number, Double result);
	
	NumberEndings getNumberFormat(Integer number);

}

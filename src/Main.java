import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Set<PiApproximation> set = new HashSet<>();
		set.add(new PiApproximationWithVieteFormula());
		set.add(new PiApproximationWithLeibnizFormula());
		set.add(new PiApproximationWithWallisFormula());
		set.add(new PiApproximationWithFirstEulerFormula());
		set.add(new PiApproximationWithSecondEulerFormula());
		
		Iterator<PiApproximation> it = set.iterator();
		for (Integer i = 0; i < set.size(); i++) {
			it.next().calculate(randomNumber());
		}
	}
	
	private Integer randomNumber() {
		return (int) (Math.random() * 10000000) + 1;
	}

}

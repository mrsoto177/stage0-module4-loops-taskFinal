package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
	public void printTable(int numberTableToPrint) {
		if (numberTableToPrint >= 0) {
			for (int i = 1; i <= 10; i++) {
				int res = i * numberTableToPrint;
				System.out.println(i + " x " + numberTableToPrint + " = " + res);
			}
		}

	}

	public static void main(String[] args) {
		MultiplicationTable multi = new MultiplicationTable();
		multi.printTable(0);
	}
}
